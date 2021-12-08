# BMC DevOps for Checkpoint/Commit Frequency Analyzer 

# Table of contents
1. [Introduction](#introduction)
2. [Authenticating the SSL Certificate](#cert)  
3. [Screenshots](#screenshots)
4. [CFA Job Logs](#joblogs)
5. [Commit Frequency Report for DB2](#db2rpt)
6. [Commit Frequency Report for IMS](#imsrpt)
7. [Required information for diagnosing problems](#diag)

## Introduction <a name="introduction"></a>
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

## Authenticating the SSL Certificate <a name="cert"></a>
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

## Screenshots: <a name="screenshots"></a>
![BMC CFA Plugin](https://github.com/jenkinsci/bmc-cfa-plugin/blob/main/src/main/webapp/images/cfa_plugin.JPG)

For details of the dialog box fields, click the question mark icon next to each field.

For further information regarding a specific field please refer to LUI Manual:
- [Specifying ANALYZE control statements](https://docs.bmc.com/docs/loganalyzer17/specifying-analyze-control-statements-958587173.html)
- [Specifying INTERVAL control statements](https://docs.bmc.com/docs/loganalyzer17/specifying-interval-control-statements-958587198.html)
- [APPCHECK keyword](https://docs.bmc.com/docs/loganalyzer17/appcheck-keyword-958587247.html)

## CFA Job Logs <a name="joblogs"></a>
The contents of the CFA job spool files are available in Jenkins job workspace.
\work\workspace\Jenkns_job_name\CFA_JOBNAME-CFA_JOBID\spool_file

![CFA job logs](https://github.com/jenkinsci/bmc-cfa-plugin/blob/main/src/main/webapp/images/workspace.jpg)

For further information regarding a specific report please refer to:
- [SUMMARY](https://docs.bmc.com/docs/loganalyzer17/using-the-luow-summary-report-958587335.html)
- [REPRTIMS](https://docs.bmc.com/docs/loganalyzer17/using-the-application-checkpoint-report-958587359.html)
- [CSVIMS]
- [SYSOUT](https://docs.bmc.com/docs/loganalyzer17/sysout-dd-statement-958587165.html)

## REPRTDB2 - Commit Frequency Report for DB2 <a name="db2rpt"></a>
 ![Commit Frequency Report for DB2](https://github.com/jenkinsci/bmc-cfa-plugin/blob/main/src/main/webapp/images/reprtdb2.JPG)

## REPRTIMS - Commit Frequency Report for IMS <a name="imsrpt"></a> 
![Commit Frequency Report for IMS](https://github.com/jenkinsci/bmc-cfa-plugin/blob/main/src/main/webapp/images/reprtims.JPG)

## Required information for diagnosing problems <a name="diag"></a> 
1.	Identify **plugin version**:
**Jenkins**->**Manage Jenkins**->**Manage Plugins**->**Installed**
![BMC plugin version](https://github.com/jenkinsci/bmc-cfa-plugin/blob/main/src/main/webapp/images/plugin_version.JPG)
2.	**Jenkins Job logs**  
	* Navigate to  **C:\Users\\*user_name*\\AppData\Local\Jenkins\.jenkins**
	* Select **jobs** directory
	* Select the relevant job
    * Select **builds** directory
 	* Select the relevant build number
	* log
3. System log: **Jenkins**->**Manage Jenkins**->**System Log**
4. **config.xml** in C:\Users\\*user_name*\\AppData\Local\Jenkins\.jenkins\jobs\\*job_name*

## Release Notes:
The plugin was developed against Jenkins version 2.303.2.
