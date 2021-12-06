# BMC DevOps for CFA Version 1.0.00

## Introduction
BMC DevOps for CFA automates the process of reporting application checkpoints/commit information from IMS and DB2 logs. It can be used to illustrate the impact of changes made by application programs on IMS databases, by comparing CFA reports before and after the implemented changes.

The plugin is implemented as a job's build step:

![BMC build step](https://github.com/jenkinsci/bmc-cfa-plugin/blob/main/src/main/webapp/images/bmc_build_step.jpg)

It uses z/OSMF REST API to submit the following CFA job to run on z/OS.
```
//CFRDEVOP JOB (${ACCTNO}),'CFA REPORT',NOTIFY=&SYSUID,
//         CLASS=A,MSGCLASS=X,REGION=0M
//CFRMAIN   EXEC PGM=CFRMAIN,REGION=4M                       
//STEPLIB   DD DISP=SHR,DSN=${CFA_LOAD0} 
//SYSOUT   DD SYSOUT=*                
//SYSIN    DD *                       
* comment
ANALYZE   keywords
INTERVAL  keywords
REPORTS   keywords
END
/*
//
```

**Notes!**
```
Notice that the values for the different keywords are not explicitly displayed in the generated JCL.
Instead placeholders (which are marked with ${}) are used.
The placeholders are being internally resolved into variables by Jenkins during the build process.
Therefore, it’s not recommended to modify the JCL, but it’s possible.
```
```
Script Security Plugin is used, thus an administrator will have to approve the scripts.
```

## Authenticating the SSL Certificate
1. Distribute the z/OS certificate to the appropriate workstation, and import it into Java KeyStore using keytool.
2. Issue the following command from the command line:
```
keytool -import -alias <alias_name> -keystore <keystore_name > -file <file_name>
```
where:
- **alias_name** - alias name of the entry to process
- **keystore_name** - the location of the cacerts file , By default it is in jre/lib/security/cacerts
- **file_name**- file.cer
You will be asked for password (which is by default : changeit). Enter the password.
Restart your Java Virtual Machine or your computer.

## Installation instructions:
TODO

## Screenshots:
![BMC CFA Plugin](https://github.com/jenkinsci/bmc-cfa-plugin/blob/main/src/main/webapp/images/cfa_plugin.JPG)

## Job Logs
TODO
## Required information for diagnosing problems
TODO
## Release Notes:
The plugin was developed against Jenkins version 2.303.2.
