BMC DevOps for CFA
Version 1.0.00

Copyright (c) 2021 BMC Software, Inc.


Jenkins plug-in Version 1.0.00 available here in .HPI format.

###Introduction
BMC DevOps for CFA automates the process of reporting application checkpoints/commit information from IMS and DB2 logs. It can be used to illustrate the impact of changes made by application programs on IMS databases, by comparing CFA reports before and after the implemented changes.

The plugin is implemented as a job's build step:

![This is an image](mcohen11/bmc-cfa-plugin/images/bmc_build_step.jpg)

Installation instructions:
==========================
Navigate to Plugin Manager --> Advanced --> Upload Plugin.
Once the .hpi file is uploaded the plug-in will be ready for use, and it will be available under 'Add build step'.

Release Notes:
==========================
The plugin was developed against Jenkins version 2.303.2.
