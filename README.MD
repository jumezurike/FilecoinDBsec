# DataShield : The AI Driven Database

# Encryption Utility

## Introduction

Dataisbecomingmoreimportantandeverybigtechplayerintheindustryaredesperatetoget
accesstouserdata.Userdataisamarketfortechcompaniesandasourceofincomefor
advertisers.Thereareseveralincidentsofuserdatabreacheveryyearduetolackofproper
dataencryptionandsecurity.Databasesecurityisimportantbecauseitpreventsdatabreaches,
avoidsfinesandpenaltiesfornon-compliance,protectsbrandreputation,andensuresbusiness
continuity.Databasesecurityreferstotherangeoftools,controls,andmeasuresdesignedto
establishandpreservedatabaseconfidentiality,integrity,andavailability. So,thisAIdriven
databaseencryptionutilitywillhelpprotectagainstdatabreachesandcanactasalastlineof
defenseincaseyourapplicationlevelsecurityiscompromised.

## Problem statement

##### Userdataisvulnerabletobreachesandmisusebyunauthorizedpartiesdueto

##### inadequateencryptionandsecuritymeasuresatthedatabaselevel.

## Why DataShield?

Mostapplicationsoftwareusesomeformofdatabasesystemtopersistimportantuserdata
includingpersonalinformationsuchaspasswordsandcreditcarddetails.Andinmostcases
thisdataisonlyprotectedattheapplicationlayerthroughanauthentication&authorization
scheme.Butevenwithrestrictedaccesstothedatabase,storingplaintextuserdataisnevera
goodidea.That’swhyweneedDataShield,thecompletedatabaseencryptionutilitywhichonly
encryptstheuserdata.
Icompiledalistofrecentdatabreachesondatabasesystems:

##### ● InJuly2021,ITsolutionsproviderKaseyasufferedamassiveattackontheirunified

```
remotemonitoringandnetworkperimetersecuritytool.Theattackersexploiteda
zero-dayvulnerabilityandencryptedmorethan1,500businesses’datausing
ransomware.
```
##### ● InJanuary2021,adatabasecontaining1.9millionuserrecordsbelongingtoPixlr,afree

```
onlinephoto-editingapplication,wasleakedbyahacker.Thedatabasewasstolenatthe
sametimeastheattackon123RF,whichexposedover 83 millionuserrecords.The
```

```
leakedrecordsincludeemailaddresses,usernames,hashedpasswords,user’scountry
andothersensitiveinformation.
```
##### ● InDecember2020,SolarWinds,asoftwarecompanythatprovidesnetworkmanagement

```
toolstovariousgovernmentagenciesandFortune 500 companies,washackedbya
sophisticatedcyberespionagegroup.TheattackerscompromisedSolarWinds’Orion
softwareupdateserverandinsertedmaliciouscodeintolegitimateupdatesthatwere
downloadedbythousandsofcustomers.Thebreachgavetheattackersaccessto
sensitivedatafromseveralorganizationsincludingMicrosoft,FireEyeandtheUS
DepartmentofHomelandSecurity.
```
## Scope

##### TheprojectaimstodevelopanAIdrivendatabaseencryptionutilitythatcan

##### automaticallyencryptanddecryptuserdatabasedonpredefinedrulesandpolicies.The

##### utilitywillalsomonitoranddetectanysuspiciousactivitiesorattemptstoaccessthe

##### datawithoutproperauthorization.Theutilitywillworkwithvarioustypesofdatabases

##### andplatforms,suchasSQL,NoSQL,cloud-based,etc.Theutilitywillprovidea

##### user-friendlyinterfaceforsettingupandmanagingtheencryptionpoliciesandkeys.

##### Theutilitywillalsogeneratereportsandalertsontheencryptionstatusand

##### performanceofthedatabases.

Inaddition,developingamonitoringanddetectionsystemthatcanalertusersofanyabnormal
orunauthorizedaccesstothedata.Developingareportingsystemthatcanprovideinsightson
theencryptionstatusandperformanceofthedatabases.

## AdvantagesofDataShield

WhatmakesDataShieldspecial?
● Itallowsautomationofkeylessencryptionusingpolicies,permissionandroleswithin
regulations,compliance,andorganizationaldatasecuritymanagementlibrarytoencrypt
datafortimelesssecurity.
● Itcanenhancethedataprivacyandsecurityoftheusersbypreventingunauthorized
accessandleakageoftheirpersonalinformation.
● Itcanreducetheriskandcostofdatabreachesandcomplianceviolationsforthe
organizationsthatstoreandprocessuserdata.
● ItcanimprovetheefficiencyandperformanceofthedatabaseoperationsbyusingAIto
optimizetheencryptionalgorithmsandkeys.
● Itcansimplifythemanagementandmaintenanceofthedatabaseencryptionby
providingadistributedandautomatedsolution.
● ThebasicencryptionalgorithmisbasedonECSMIDalgorithm(2048-bitQuantum
resistantcryptography)developed&patentedbyLokDonLLC


## PossibleApplications

ThereareseveralpossibleapplicationsofDataShield,thesearesomeofwhatwethinkare
moreappropriate:

##### ● Ahealthcareorganizationthatstoressensitivepatientdatainacloud-based

##### database.Theorganizationwantstoensurethatthedataisprotectedfrom

##### unauthorizedaccessandtampering,andthatitcomplieswiththeHIPAA

##### regulations.TheorganizationcanuseDataShieldtoencryptthedataatrestand

##### intransit,andtomonitoranysuspiciousactivityoranomaliesonthedatabase.

##### Theutilitycanalsogeneratereportsandalertsontheencryptionstatusand

##### performanceofthedatabase.

##### ● Ane-commercecompanythatcollectscustomerdatasuchasnames,addresses,

##### creditcardnumbers,andpurchasehistory.Thecompanywantstosecurethe

##### datafromhackersandidentitythieves,andtocomplywiththeGDPRregulations.

##### ThecompanycanuseDataShieldutilitytoencryptthedatausingstrong

##### algorithmsandkeys,andtodetectanyunauthorizedaccessormodificationof

##### thedata.Theutilitycanalsoprovideaudittrailsandlogsoftheencryption

##### activitiesandeventsonthedatabase

## PotentialBeneficiaries

##### Someofthepotentialbeneficiariesofthisprojectare:

##### ● Userswhovaluetheirprivacyandsecurityoftheirpersonaldata

##### ● Businesseswhostoresensitivecustomerdataandwanttoavoiddatabreaches

##### andlegalconsequences

##### ● Databaseadministratorswhowanttosimplifyandautomatetheencryption

##### process

##### ● Developerswhowanttointegrateencryptionintotheirapplicationseasily


## UseCase& Basic Architecture(subjectto change)

Thisserviceworksjustabovethedatabaselayerasaprotectivemiddleware.

Wewillmakeuseofthetransactionalpropertyofthedatabase,i.eeitheralloperationsina
giventransactionarecompletedsuccessfullyornoneofthemareperformedandarollbackwill
bedoneforpartiallycompletedoperations.Eachoperationpassesthroughtheutilitytoensure
protectionandstability.ThefollowingflowchartconsidersbothOLTP&OLAPusecasesas
illustratedbelow.


## Features

ThefollowingareplannedfeaturesforDataShieldAI:

- Autoencryption/decryptionofdatafields
- Pre-configuredencryption/decryptionofdatafieldsthroughexternalconfiguration
  support
- SupportforUTF-16&UTF 8
- SupportforSQLbasedrelationaldatabaseslikeMySQL

Thefollowingfeaturesareimplementedoravailablefordemobuild:

- Pre-configuredencryption/decryptionofdatafields
- SupportforUTF-
- SupportforMySQL
- Oneclickdeploy


## Design & Flow

Atahigherlevel,theserviceworkslikethis

Flowchartfordeploymentmanager



## Getting Started

Wehavejustreleasedabetaversionofdatashieldformaven,getyourtestAPIkeysanddeploy
thesolutionlikethese:

1. Adddatashieldrepositoryinyourpom.xmlfile
2. Specifythesnapshotrepositoryindistrubitionmanagementblockinyourpom.xmlfile
3. Addthedatashieldmavendependency

**_Optionallyyoucanaddthemavenassemblypluginwhichletsyoucreateajarwithall
dependenciesprepackaged._**


Tocompiletheproject:

```
>mvncompileassembly:single
```
YoucanusetheincludedexamplewhichshowcasessomecorefeaturesofDatashieldAI

Usethe@EncryptedValueannotationtospecifywhichdatapointsneedtobeencrypted
Forexample:


Afteryourcreateyourfirstentityclass,youcannowuseitwithanyORM,datashieldAI
abstractsJavaPersistenceAPI(JPA)andEnterpriseJavaBeantoautodetectvariablesthat
needtoencryptedordecryptedonruntime.

## Working withEJBsand DataShieldInitialization

### Initialization

Whenyourprojectrunsforthefirst-time,DatashieldwillscanforDTOs,entitiesanddata
definitions.Ifthedatabaseschemahasalreadyexistingrecords,theywillbeencrypted
automaticallybasedonyourentityconfiguration.

**_Allunmappedentitieswillremainun-encryptedandwillnotbealteredinthefutureby
datashieldAI._**

### Entities

Anentityisalightweightpersistencedomainobject.Typically,anentityrepresentsatableina
relationaldatabase,andeachentityinstancecorrespondstoarowinthattable.Theprimary
programmingartifactofanentityistheentityclass,althoughentitiescanusehelperclasses.
Thepersistentstateofanentityisrepresentedthrougheitherpersistentfieldsorpersistent
properties.Thesefieldsorpropertiesuseobject/relationalmappingannotationstomapthe
entitiesandentityrelationshipstotherelationaldataintheunderlyingdatastore.

#### RequirementsforEntityClasses

Anentityclassmustfollowtheserequirements.
● Theclassmustbeannotatedwiththejavax.persistence.Entityannotation.
● Theclassmusthaveapublicorprotected,no-argumentconstructor.Theclassmay
haveotherconstructors.
● Theclassmustnotbedeclaredfinal.Nomethodsorpersistentinstancevariablesmust
bedeclaredfinal.


```
● Ifanentityinstanceispassedbyvalueasadetachedobject,suchasthroughasession
bean’sremotebusinessinterface,theclassmustimplementtheSerializableinterface.
● Entitiesmayextendbothentityandnon-entityclasses,andnon-entityclassesmay
extendentityclasses.
● Persistentinstancevariablesmustbedeclaredprivate,protected,orpackage-private
andcanbeaccesseddirectlyonlybytheentityclass’smethods.Clientsmustaccessthe
entity’sstatethroughaccessororbusinessmethods.
```
#### PersistentFieldsandPropertiesinEntityClasses

NotethatDataShieldonlyencryptsordecryptsallpersistentfieldsannotatedwith
**@EncryptedValue**.
Thepersistentstateofanentitycanbeaccessedthrougheithertheentity’sinstancevariables
orproperties.ThefieldsorpropertiesmustbeofthefollowingJavalanguagetypes:
● Javaprimitivetypes
● java.lang.String
● Otherserializabletypes,including:
○ WrappersofJavaprimitivetypes **|SupportsEncryption**
○ java.math.BigInteger **|SupportsEncryption**
○ java.math.BigDecimal **|SupportsEncryption**
○ java.util.Date
○ java.util.Calendar
○ java.sql.Date
○ java.sql.Time
○ java.sql.TimeStamp **|SupportsEncryption**
○ User-definedserializabletypes **|SupportsEncryption**
○ Byte[] **|SupportsEncryption**
○ Char[] **|SupportsEncryption**
○ Character[] **|SupportsEncryption**
● Enumeratedtypes
● Otherentitiesand/orcollectionsofentities
● Embeddableclasses

Entitiesmayusepersistentfields,persistentproperties,oracombinationofboth.Ifthemapping
annotationsareappliedtotheentity’sinstancevariables,theentityusespersistentfields.Ifthe
mappingannotationsareappliedtotheentity’sgettermethodsforJavaBeans-styleproperties,
theentityusespersistentproperties.

## Transactions& Custom Query

Toensuredataintegrity,atransactionindatashieldAIiseithercommitted100%orcanceled
withnochangesmadetotheschema.Alltransactionsarefilteredthroughthemappertoparse
andidentifyencryptedcolumnvalues.


**_Wecurrentlydonotsupportacustomqueryonamappedentitywithencryptedvalues._**

## UsageAnalysis

WecomparedDataShield.AI(2048bit)withAES-256sidebysideonmultipledatasizesand
comparedtheCPUtimeandMemoryusage

TheanalysisisbasedonthefollowingDUTspecification:
**Device/VM** :T2.Micro(AWSEC2)
**CPU:** 3.3GHzIntelXeon
**Mem(GiB):** 1

Basedontheaverageresultobtainedfrom 10 differentruns,DataShieldis2.5xfasterthan
AES-256.


MemoryAnalysis:

OuranalysissuggestthatDataShielduses30%lessaddressablememoryspacethanAES-
CBC


### StaticApplicationSecurityTesting

Wetestedoursourceforvulnerabilityusingthespotbugsstaticanalyzerandcommonanalyzer.
Thereportisasfollows

###### {

"version":"14.0.4",
"vulnerabilities":[
{
"id":"cc8eb3f161a9532dde950aaed31a2526ff88b2562cc1b80f55f43e7358ab03e4",
"category":"sast",
"name":"NonconstantstringpassedtoexecuteoraddBatchmethodonanSQL
statement",
"message":"NonconstantstringpassedtoexecuteoraddBatchmethodonanSQL
statement",
"description":"datasheild.MySQLHelper.encryptFullTable(MySQLHelper$TableStructure)
passesanonconstantStringtoanexecuteoraddBatchmethodonanSQLstatement",

"cve":"d961fbfc0559485d4d4036832fceb46a:SQL_NONCONSTANT_STRING_PASSED_TO_E
XECUTE:src/main/java/datasheild/MySQLHelper.java:404",
"severity":"Low",
"confidence":"Low",
"scanner":{
"id":"find_sec_bugs",
"name":"FindSecurityBugs"
},
"location":{
"file":"src/main/java/datasheild/MySQLHelper.java",
"start_line":404,
"class":"datasheild.MySQLHelper",
"method":"encryptFullTable"
},
"identifiers":[
{
"type":"find_sec_bugs_type",
"name":"FindSecurity
Bugs-SQL_NONCONSTANT_STRING_PASSED_TO_EXECUTE",
"value":"SQL_NONCONSTANT_STRING_PASSED_TO_EXECUTE",

"url":"https://spotbugs.readthedocs.io/en/latest/bugDescriptions.html#sql-nonconstant-string-pas
sed-to-execute-or-addbatch-method-on-an-sql-statement-sql-nonconstant-string-passed-to-exec
ute"


###### },

###### {

```
"type":"cwe",
"name":"CWE-89",
"value":"89",
"url":"https://cwe.mitre.org/data/definitions/89.html"
}
]
},
{
"id":"d99d44bd872956459956065829efdf7ab9a6e4c7c8fc5903b4049e2541f456d3",
"category":"sast",
"name":"InformationExposureThroughAnErrorMessage",
"message":"InformationExposureThroughAnErrorMessage",
"description":"Possibleinformationexposurethroughanerrormessage",
```
"cve":"dd35abb66405b484c4d2658b301e4aad:INFORMATION_EXPOSURE_THROUGH_AN_
ERROR_MESSAGE:src/main/java/datasheild/MySQLHelper.java:67",
"severity":"Low",
"confidence":"Low",
"scanner":{
"id":"find_sec_bugs",
"name":"FindSecurityBugs"
},
"location":{
"file":"src/main/java/datasheild/MySQLHelper.java",
"start_line":67,
"class":"datasheild.MySQLHelper",
"method":"getInstance"
},
"identifiers":[
{
"type":"find_sec_bugs_type",
"name":"FindSecurity
Bugs-INFORMATION_EXPOSURE_THROUGH_AN_ERROR_MESSAGE",
"value":"INFORMATION_EXPOSURE_THROUGH_AN_ERROR_MESSAGE",

"url":"https://find-sec-bugs.github.io/bugs.htm#INFORMATION_EXPOSURE_THROUGH_AN_E
RROR_MESSAGE"
},
{
"type":"cwe",
"name":"CWE-209",
"value":"209",


```
"url":"https://cwe.mitre.org/data/definitions/209.html"
}
]
},
{
"id":"ca2cb73d4ba75ef3a0c4018089b3bccde7bebc4353de4046b1894f8d656c5984",
"category":"sast",
"name":"InformationExposureThroughAnErrorMessage",
"message":"InformationExposureThroughAnErrorMessage",
"description":"Possibleinformationexposurethroughanerrormessage",
```
"cve":"dd35abb66405b484c4d2658b301e4aad:INFORMATION_EXPOSURE_THROUGH_AN_
ERROR_MESSAGE:src/main/java/datasheild/MySQLHelper.java:74",
"severity":"Low",
"confidence":"Low",
"scanner":{
"id":"find_sec_bugs",
"name":"FindSecurityBugs"
},
"location":{
"file":"src/main/java/datasheild/MySQLHelper.java",
"start_line":74,
"class":"datasheild.MySQLHelper",
"method":"getInstance"
},
"identifiers":[
{
"type":"find_sec_bugs_type",
"name":"FindSecurity
Bugs-INFORMATION_EXPOSURE_THROUGH_AN_ERROR_MESSAGE",
"value":"INFORMATION_EXPOSURE_THROUGH_AN_ERROR_MESSAGE",

"url":"https://find-sec-bugs.github.io/bugs.htm#INFORMATION_EXPOSURE_THROUGH_AN_E
RROR_MESSAGE"
},
{
"type":"cwe",
"name":"CWE-209",
"value":"209",
"url":"https://cwe.mitre.org/data/definitions/209.html"
}
]
},
{


```
"id":"e409dc8ec1f46523070da9bd5ecb46b6b7c8d107d69f406f98556bf3c49bff52",
"category":"sast",
"name":"InformationExposureThroughAnErrorMessage",
"message":"InformationExposureThroughAnErrorMessage",
"description":"Possibleinformationexposurethroughanerrormessage",
```
"cve":"ee76e9cd85447d9b7b70cd626ddc883a:INFORMATION_EXPOSURE_THROUGH_AN_
ERROR_MESSAGE:src/main/java/datasheild/MySQLHelper.java:331",
"severity":"Low",
"confidence":"Low",
"scanner":{
"id":"find_sec_bugs",
"name":"FindSecurityBugs"
},
"location":{
"file":"src/main/java/datasheild/MySQLHelper.java",
"start_line":331,
"class":"datasheild.MySQLHelper",
"method":"getInstance"
},
"identifiers":[
{
"type":"find_sec_bugs_type",
"name":"FindSecurity
Bugs-INFORMATION_EXPOSURE_THROUGH_AN_ERROR_MESSAGE",
"value":"INFORMATION_EXPOSURE_THROUGH_AN_ERROR_MESSAGE",

"url":"https://find-sec-bugs.github.io/bugs.htm#INFORMATION_EXPOSURE_THROUGH_AN_E
RROR_MESSAGE"
},
{
"type":"cwe",
"name":"CWE-209",
"value":"209",
"url":"https://cwe.mitre.org/data/definitions/209.html"
}
]
},
{
"id":"db3656702229ba8007616540e8b6b44e40a687bcdb2767b5f96be78c63ab2c02",
"category":"sast",
"name":"NonconstantstringpassedtoexecuteoraddBatchmethodonanSQL
statement",


"message":"NonconstantstringpassedtoexecuteoraddBatchmethodonanSQL
statement",
"description":"datasheild.MySQLHelper.getColumns(MySQLHelper$TableStructure)
passesanonconstantStringtoanexecuteoraddBatchmethodonanSQLstatement",

"cve":"fad117b63e1056400e3f16a38bbf63cc:SQL_NONCONSTANT_STRING_PASSED_TO_E
XECUTE:src/main/java/datasheild/MySQLHelper.java:475",
"severity":"Low",
"confidence":"Low",
"scanner":{
"id":"find_sec_bugs",
"name":"FindSecurityBugs"
},
"location":{
"file":"src/main/java/datasheild/MySQLHelper.java",
"start_line":475,
"class":"datasheild.MySQLHelper",
"method":"getColumns"
},
"identifiers":[
{
"type":"find_sec_bugs_type",
"name":"FindSecurity
Bugs-SQL_NONCONSTANT_STRING_PASSED_TO_EXECUTE",
"value":"SQL_NONCONSTANT_STRING_PASSED_TO_EXECUTE",

"url":"https://spotbugs.readthedocs.io/en/latest/bugDescriptions.html#sql-nonconstant-string-pas
sed-to-execute-or-addbatch-method-on-an-sql-statement-sql-nonconstant-string-passed-to-exec
ute"
},
{
"type":"cwe",
"name":"CWE-89",
"value":"89",
"url":"https://cwe.mitre.org/data/definitions/89.html"
}
]
}
],
"dependency_files":[

```
],
"scan":{
"analyzer":{
```

"id":"spotbugs",
"name":"Spotbugs",
"vendor":{
"name":"GitLab"
},
"version":"3.3.5"
},
"scanner":{
"id":"find_sec_bugs",
"name":"FindSecurityBugs",
"url":"https://spotbugs.github.io",
"vendor":{
"name":"GitLab"
},
"version":"4.7.3"
},
"type":"sast",
"start_time":"2023-04-19T22:20:35",
"end_time":"2023-04-19T22:21:08",
"status":"success"
}
}

Thereportshowsthatwehaveminorbugswithlowconfidenceonexposingerrormessages
andpassingaconstantvaluetomysqlstatements.However,theerrormessagesareonly
enabledonnonproductionbuilds(test&dev)andtheconstantpassedtothemysqlstatement
isamandatoryvaluewithnopotentialthreatstotheapplicationsoftware.

### CodeQualityReport

WetestedoursourcecodethroughtheGitLabCodeQualityCheckandwefoundthefollowing
minorissueswhichwillbefixedonthenextstablerelease:

[
{
"engine_name":"structure",
"fingerprint":"0cc31cb8d8d223652519266e394421e8",
"categories":[
"Complexity"
],
"check_name":"file_lines",


"content":{
"body":""
},
"description":"File`AllCharacter.java`has 308 linesofcode(exceeds 250 allowed).Consider
refactoring.",
"location":{
"path":"src/main/java/lokdon/AllCharacter.java",
"lines":{
"begin":1,
"end":
}
},
"other_locations":[

],
"remediation_points":2035200,
"severity":"minor",
"type":"issue"
},
{
"engine_name":"structure",
"fingerprint":"0d4202defa4727c45d7397fea5b093e1",
"categories":[
"Complexity"
],
"check_name":"method_complexity",
"content":{
"body":"#CognitiveComplexity\nCognitiveComplexityisameasureofhowdifficultaunit
ofcodeistointuitivelyunderstand.UnlikeCyclomaticComplexity,whichdetermineshowdifficult
yourcodewillbetotest,CognitiveComplexitytellsyouhowdifficultyourcodewillbetoread
andcomprehend.\n\n###Amethod'scognitivecomplexityisbasedonafewsimplerules:\n*
Codeisnotconsideredmorecomplexwhenitusesshorthandthatthelanguageprovidesfor
collapsingmultiplestatementsintoone\n*Codeisconsideredmorecomplexforeach\"breakin
thelinearflowofthecode\"\n*Codeisconsideredmorecomplexwhen\"flowbreaking
structuresarenested\"\n\n###Furtherreading\n*[CognitiveComplexity
docs](https://docs.codeclimate.com/v1.0/docs/cognitive-complexity)\n*[CognitiveComplexity:A
newwayofmeasuring
understandability](https://www.sonarsource.com/docs/CognitiveComplexity.pdf)\n"
},
"description":"Method`loadPositionData`hasaCognitiveComplexityof 7 (exceeds 5
allowed).Considerrefactoring.",
"location":{
"path":"src/main/java/lokdon/KnightSolver.java",
"lines":{


```
"begin":68,
"end":132
}
},
"other_locations":[
```
],
"remediation_points":350000,
"severity":"minor",
"type":"issue"
},
{
"engine_name":"structure",
"fingerprint":"e06748bbbc566cffbd524c3c746dc829",
"categories":[
"Complexity"
],
"check_name":"method_complexity",
"content":{
"body":"#CognitiveComplexity\nCognitiveComplexityisameasureofhowdifficultaunit
ofcodeistointuitivelyunderstand.UnlikeCyclomaticComplexity,whichdetermineshowdifficult
yourcodewillbetotest,CognitiveComplexitytellsyouhowdifficultyourcodewillbetoread
andcomprehend.\n\n###Amethod'scognitivecomplexityisbasedonafewsimplerules:\n*
Codeisnotconsideredmorecomplexwhenitusesshorthandthatthelanguageprovidesfor
collapsingmultiplestatementsintoone\n*Codeisconsideredmorecomplexforeach\"breakin
thelinearflowofthecode\"\n*Codeisconsideredmorecomplexwhen\"flowbreaking
structuresarenested\"\n\n###Furtherreading\n*[CognitiveComplexity
docs](https://docs.codeclimate.com/v1.0/docs/cognitive-complexity)\n*[CognitiveComplexity:A
newwayofmeasuring
understandability](https://www.sonarsource.com/docs/CognitiveComplexity.pdf)\n"
},
"description":"Method`nextStep`hasaCognitiveComplexityof 18 (exceeds 5 allowed).
Considerrefactoring.",
"location":{
"path":"src/main/java/lokdon/KnightSolver.java",
"lines":{
"begin":172,
"end":254
}
},
"other_locations":[

```
],
"remediation_points":1450000,
```

"severity":"minor",
"type":"issue"
},
{
"engine_name":"structure",
"fingerprint":"a66e18652fa52ff0f5ff78d0dcf3dd91",
"categories":[
"Complexity"
],
"check_name":"method_lines",
"content":{
"body":""
},
"description":"Method`nextStep`has 36 linesofcode(exceeds 25 allowed).Consider
refactoring.",
"location":{
"path":"src/main/java/lokdon/KnightSolver.java",
"lines":{
"begin":172,
"end":254
}
},
"other_locations":[

],
"remediation_points":864000,
"severity":"minor",
"type":"issue"
},
{
"engine_name":"structure",
"fingerprint":"fb1081a8e90095b47c7ba2529ae06b02",
"categories":[
"Complexity"
],
"check_name":"method_complexity",
"content":{
"body":"#CognitiveComplexity\nCognitiveComplexityisameasureofhowdifficultaunit
ofcodeistointuitivelyunderstand.UnlikeCyclomaticComplexity,whichdetermineshowdifficult
yourcodewillbetotest,CognitiveComplexitytellsyouhowdifficultyourcodewillbetoread
andcomprehend.\n\n###Amethod'scognitivecomplexityisbasedonafewsimplerules:\n*
Codeisnotconsideredmorecomplexwhenitusesshorthandthatthelanguageprovidesfor
collapsingmultiplestatementsintoone\n*Codeisconsideredmorecomplexforeach\"breakin
thelinearflowofthecode\"\n*Codeisconsideredmorecomplexwhen\"flowbreaking


structuresarenested\"\n\n###Furtherreading\n*[CognitiveComplexity
docs](https://docs.codeclimate.com/v1.0/docs/cognitive-complexity)\n*[CognitiveComplexity:A
newwayofmeasuring
understandability](https://www.sonarsource.com/docs/CognitiveComplexity.pdf)\n"
},
"description":"Method`generatePassword`hasaCognitiveComplexityof 40 (exceeds 5
allowed).Considerrefactoring.",
"location":{
"path":"src/main/java/lokdon/CipherControl.java",
"lines":{
"begin":239,
"end":363
}
},
"other_locations":[

```
],
"remediation_points":3650000,
"severity":"minor",
"type":"issue"
},
{
"engine_name":"structure",
"fingerprint":"b96329dee45cccced09b09490b43b6c2",
"categories":[
"Complexity"
],
"check_name":"method_count",
"content":{
"body":""
},
"description":"`MySQLHelper`has 28 methods(exceeds 20 allowed).Considerrefactoring.",
"location":{
"path":"src/main/java/datasheild/MySQLHelper.java",
"lines":{
"begin":14,
"end":583
}
},
"other_locations":[
```
```
],
"remediation_points":2000000,
"severity":"minor",
```

"type":"issue"
},
{
"engine_name":"structure",
"fingerprint":"6ebe216bb7199d2ef45da22b1b2f0d72",
"categories":[
"Complexity"
],
"check_name":"method_lines",
"content":{
"body":""
},
"description":"Method`encryptFullTable`has 40 linesofcode(exceeds 25 allowed).
Considerrefactoring.",
"location":{
"path":"src/main/java/datasheild/MySQLHelper.java",
"lines":{
"begin":403,
"end":445
}
},
"other_locations":[

],
"remediation_points":960000,
"severity":"minor",
"type":"issue"
}
]


### DASTTestResults


