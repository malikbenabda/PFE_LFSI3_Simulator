<?xml version="1.0" encoding="UTF-8"?>
<?PowerDesigner AppLocale="UTF16" ID="{ED7ECC3A-F9F5-4BA6-936E-CBB2B451D489}" Label="" LastModificationDate="1400736711" Name="gestion des stagiares" Objects="107" Symbols="130" Target="Java" TargetLink="Reference" Type="{18112060-1A4B-11D1-83D9-444553540000}" signature="CLD_OBJECT_MODEL" version="15.1.0.2850"?>
<!-- Veuillez ne pas modifier ce fichier -->

<Model xmlns:a="attribute" xmlns:c="collection" xmlns:o="object">

<o:RootObject Id="o1">
<c:Children>
<o:Model Id="o2">
<a:ObjectID>ED7ECC3A-F9F5-4BA6-936E-CBB2B451D489</a:ObjectID>
<a:Name>gestion des stagiares</a:Name>
<a:Code>gestion_des_stagiares</a:Code>
<a:CreationDate>1399223409</a:CreationDate>
<a:Creator>HP</a:Creator>
<a:ModificationDate>1400735334</a:ModificationDate>
<a:Modifier>stark</a:Modifier>
<a:PackageOptionsText>[FolderOptions]

[FolderOptions\Class Diagram Objects]
GenerationCheckModel=Yes
GenerationPath=
GenerationOptions=
GenerationTasks=
GenerationTargets=
GenerationSelections=</a:PackageOptionsText>
<a:ModelOptionsText>[ModelOptions]

[ModelOptions\Cld]
CaseSensitive=Yes
DisplayName=Yes
EnableTrans=Yes
EnableRequirements=No
ShowClss=No
DeftAttr=int
DeftMthd=int
DeftParm=int
DeftCont=java.util.Collection
DomnDttp=Yes
DomnChck=No
DomnRule=No
SupportDelay=No
PreviewEditable=Yes
AutoRealize=No
DttpFullName=Yes
DeftClssAttrVisi=private
VBNetPreprocessingSymbols=
CSharpPreprocessingSymbols=

[ModelOptions\Cld\NamingOptionsTemplates]

[ModelOptions\Cld\ClssNamingOptions]

[ModelOptions\Cld\ClssNamingOptions\CLDPCKG]

[ModelOptions\Cld\ClssNamingOptions\CLDPCKG\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,,,firstLowerWord)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\CLDPCKG\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; &#39;(.)+=*/&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\CLDDOMN]

[ModelOptions\Cld\ClssNamingOptions\CLDDOMN\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\CLDDOMN\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; &#39;(.)+=*/&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\CLDCLASS]

[ModelOptions\Cld\ClssNamingOptions\CLDCLASS\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,,,FirstUpperChar)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\CLDCLASS\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; &#39;(.)+=*/&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\CLDINTF]

[ModelOptions\Cld\ClssNamingOptions\CLDINTF\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,,,FirstUpperChar)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\CLDINTF\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; &#39;(.)+=*/&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\UCDACTR]

[ModelOptions\Cld\ClssNamingOptions\UCDACTR\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\UCDACTR\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; &#39;(.)+=*/&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\UCDUCAS]

[ModelOptions\Cld\ClssNamingOptions\UCDUCAS\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\UCDUCAS\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; &#39;(.)+=*/&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\SQDOBJT]

[ModelOptions\Cld\ClssNamingOptions\SQDOBJT\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\SQDOBJT\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; &#39;(.)+=*/&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\SQDMSSG]

[ModelOptions\Cld\ClssNamingOptions\SQDMSSG\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\SQDMSSG\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; &#39;(.)+=*/&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\CPDCOMP]

[ModelOptions\Cld\ClssNamingOptions\CPDCOMP\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,,,FirstUpperChar)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\CPDCOMP\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; &#39;(.)+=*/&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\CLDATTR]

[ModelOptions\Cld\ClssNamingOptions\CLDATTR\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,,,firstLowerWord)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\CLDATTR\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; &#39;(.)+=*/&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\CLDMETHOD]

[ModelOptions\Cld\ClssNamingOptions\CLDMETHOD\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,,,firstLowerWord)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\CLDMETHOD\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; &#39;(.)+=*/&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\CLDPARM]

[ModelOptions\Cld\ClssNamingOptions\CLDPARM\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,,,firstLowerWord)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\CLDPARM\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; &#39;(.)+=*/&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\OOMPORT]

[ModelOptions\Cld\ClssNamingOptions\OOMPORT\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\OOMPORT\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; &#39;(.)+=*/&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\OOMPART]

[ModelOptions\Cld\ClssNamingOptions\OOMPART\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\OOMPART\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; &#39;(.)+=*/&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\CLDASSC]

[ModelOptions\Cld\ClssNamingOptions\CLDASSC\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,,,firstLowerWord)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\CLDASSC\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; &#39;(.)+=*/&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\UCDASSC]

[ModelOptions\Cld\ClssNamingOptions\UCDASSC\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\UCDASSC\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; &#39;(.)+=*/&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\GNRLLINK]

[ModelOptions\Cld\ClssNamingOptions\GNRLLINK\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\GNRLLINK\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; &#39;(.)+=*/&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\RQLINK]

[ModelOptions\Cld\ClssNamingOptions\RQLINK\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\RQLINK\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; &#39;(.)+=*/&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\RLZSLINK]

[ModelOptions\Cld\ClssNamingOptions\RLZSLINK\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\RLZSLINK\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; &#39;(.)+=*/&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\DEPDLINK]

[ModelOptions\Cld\ClssNamingOptions\DEPDLINK\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\DEPDLINK\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; &#39;(.)+=*/&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\OOMACTV]

[ModelOptions\Cld\ClssNamingOptions\OOMACTV\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\OOMACTV\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; &#39;(.)+=*/&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\ACDOBST]

[ModelOptions\Cld\ClssNamingOptions\ACDOBST\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\ACDOBST\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; &#39;(.)+=*/&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\STAT]

[ModelOptions\Cld\ClssNamingOptions\STAT\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\STAT\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; &#39;(.)+=*/&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\DPDNODE]

[ModelOptions\Cld\ClssNamingOptions\DPDNODE\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\DPDNODE\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; &#39;(.)+=*/&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\DPDCMPI]

[ModelOptions\Cld\ClssNamingOptions\DPDCMPI\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\DPDCMPI\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; &#39;(.)+=*/&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\DPDASSC]

[ModelOptions\Cld\ClssNamingOptions\DPDASSC\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\DPDASSC\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; &#39;(.)+=*/&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\OOMVAR]

[ModelOptions\Cld\ClssNamingOptions\OOMVAR\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\OOMVAR\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; &#39;(.)+=*/&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\FILO]

[ModelOptions\Cld\ClssNamingOptions\FILO\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=&quot;\/:*?&lt;&gt;|&quot;
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\FILO\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_. &quot;
InvldChar=&quot; &#39;(.)+=*/&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\FRMEOBJ]

[ModelOptions\Cld\ClssNamingOptions\FRMEOBJ\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\FRMEOBJ\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; &#39;(.)+=*/&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\FRMELNK]

[ModelOptions\Cld\ClssNamingOptions\FRMELNK\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\FRMELNK\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; &#39;(.)+=*/&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\DefaultClass]

[ModelOptions\Cld\ClssNamingOptions\DefaultClass\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\DefaultClass\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; &#39;(.)+=*/&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Generate]

[ModelOptions\Generate\Cdm]
CheckModel=Yes
SaveLinks=Yes
NameToCode=No
Notation=2

[ModelOptions\Generate\Pdm]
CheckModel=Yes
SaveLinks=Yes
ORMapping=No
NameToCode=No
BuildTrgr=No
TablePrefix=
RefrUpdRule=RESTRICT
RefrDelRule=RESTRICT
IndxPKName=%TABLE%_PK
IndxAKName=%TABLE%_AK
IndxFKName=%REFR%_FK
IndxThreshold=
ColnFKName=%.3:PARENT%_%COLUMN%
ColnFKNameUse=No

[ModelOptions\Generate\Xsm]
CheckModel=Yes
SaveLinks=Yes
ORMapping=No
NameToCode=No</a:ModelOptionsText>
<c:ObjectLanguage>
<o:Shortcut Id="o3">
<a:ObjectID>E8C8103F-009B-4F61-AE6B-F96B8124AD4B</a:ObjectID>
<a:Name>Java</a:Name>
<a:Code>Java</a:Code>
<a:CreationDate>1399223409</a:CreationDate>
<a:Creator>HP</a:Creator>
<a:ModificationDate>1399223409</a:ModificationDate>
<a:Modifier>HP</a:Modifier>
<a:TargetStereotype/>
<a:TargetID>0DEDDB90-46E2-45A0-886E-411709DA0DC9</a:TargetID>
<a:TargetClassID>1811206C-1A4B-11D1-83D9-444553540000</a:TargetClassID>
</o:Shortcut>
</c:ObjectLanguage>
<c:ExtendedModelDefinitions>
<o:Shortcut Id="o4">
<a:ObjectID>263A732F-2796-4B9C-A9F5-9609ACD6FDC9</a:ObjectID>
<a:Name>WSDL for Java</a:Name>
<a:Code>WSDLJava</a:Code>
<a:CreationDate>1399223409</a:CreationDate>
<a:Creator>HP</a:Creator>
<a:ModificationDate>1399223409</a:ModificationDate>
<a:Modifier>HP</a:Modifier>
<a:TargetStereotype/>
<a:TargetID>C8F5F7B2-CF9D-4E98-8301-959BB6E86C8A</a:TargetID>
<a:TargetClassID>186C8AC3-D3DC-11D3-881C-00508B03C75C</a:TargetClassID>
</o:Shortcut>
</c:ExtendedModelDefinitions>
<c:DefaultDiagram>
<o:SequenceDiagram Ref="o5"/>
</c:DefaultDiagram>
<c:SequenceDiagrams>
<o:SequenceDiagram Id="o5">
<a:ObjectID>42704873-2FF9-4357-BCEF-7E3E1CA07AA5</a:ObjectID>
<a:Name>Exercice Stagiaire</a:Name>
<a:Code>Exercice_Stagiaire</a:Code>
<a:CreationDate>1399481972</a:CreationDate>
<a:Creator>HP</a:Creator>
<a:ModificationDate>1400735334</a:ModificationDate>
<a:Modifier>stark</a:Modifier>
<a:DisplayPreferences>[DisplayPreferences]

[DisplayPreferences\SQD]

[DisplayPreferences\General]
Adjust to text=Yes
Snap Grid=No
Constrain Labels=Yes
Display Grid=No
Show Page Delimiter=Yes
Grid size=0
Graphic unit=2
Window color=255, 255, 255
Background image=
Background mode=8
Watermark image=
Watermark mode=8
Show watermark on screen=No
Gradient mode=0
Gradient end color=255, 255, 255
Show Swimlane=No
SwimlaneVert=Yes
TreeVert=No
CompDark=0

[DisplayPreferences\Object]
Mode=2
Trunc Length=40
Word Length=40
Word Text=!&quot;&quot;#$%&amp;&#39;()*+,-./:;&lt;=&gt;?@[\]^_`{|}~
Shortcut IntIcon=Yes
Shortcut IntLoct=Yes
Shortcut IntFullPath=No
Shortcut IntLastPackage=Yes
Shortcut ExtIcon=Yes
Shortcut ExtLoct=No
Shortcut ExtFullPath=No
Shortcut ExtLastPackage=Yes
Shortcut ExtIncludeModl=Yes
EObjShowStrn=Yes
ExtendedObject.Comment=No
ExtendedObject.IconPicture=No
ExtendedObject_SymbolLayout=&lt;Form&gt;[CRLF] &lt;StandardAttribute Name=&quot;Stéréotype&quot; Attribute=&quot;Stereotype&quot; Prefix=&quot;&amp;lt;&amp;lt;&quot; Suffix=&quot;&amp;gt;&amp;gt;&quot; Alignment=&quot;CNTR&quot; Caption=&quot;&quot; Mandatory=&quot;No&quot; /&gt;[CRLF] &lt;StandardAttribute Name=&quot;Nom de l&amp;#39;objet&quot; Attribute=&quot;DisplayName&quot; Prefix=&quot;&quot; Suffix=&quot;&quot; Alignment=&quot;CNTR&quot; Caption=&quot;&quot; Mandatory=&quot;Yes&quot; /&gt;[CRLF] &lt;Separator Name=&quot;Séparateur&quot; /&gt;[CRLF] &lt;StandardAttribute Name=&quot;Commentaire&quot; Attribute=&quot;Comment&quot; Prefix=&quot;&quot; Suffix=&quot;&quot; Alignment=&quot;LEFT&quot; Caption=&quot;&quot; Mandatory=&quot;No&quot; /&gt;[CRLF] &lt;StandardAttribute Name=&quot;Icône&quot; Attribute=&quot;IconPicture&quot; Prefix=&quot;&quot; Suffix=&quot;&quot; Alignment=&quot;CNTR&quot; Caption=&quot;&quot; Mandatory=&quot;Yes&quot; /&gt;[CRLF]&lt;/Form&gt;
ELnkShowStrn=Yes
ELnkShowName=Yes
ExtendedLink_SymbolLayout=&lt;Form&gt;[CRLF] &lt;Form Name=&quot;Centre&quot; &gt;[CRLF]  &lt;StandardAttribute Name=&quot;Stéréotype&quot; Attribute=&quot;Stereotype&quot; Prefix=&quot;&amp;lt;&amp;lt;&quot; Suffix=&quot;&amp;gt;&amp;gt;&quot; Caption=&quot;&quot; Mandatory=&quot;No&quot; /&gt;[CRLF]  &lt;StandardAttribute Name=&quot;Nom&quot; Attribute=&quot;DisplayName&quot; Prefix=&quot;&quot; Suffix=&quot;&quot; Caption=&quot;&quot; Mandatory=&quot;No&quot; /&gt;[CRLF] &lt;/Form&gt;[CRLF] &lt;Form Name=&quot;Source&quot; &gt;[CRLF] &lt;/Form&gt;[CRLF] &lt;Form Name=&quot;Destination&quot; &gt;[CRLF] &lt;/Form&gt;[CRLF]&lt;/Form&gt;
FileObject.Stereotype=No
FileObject.DisplayName=Yes
FileObject.LocationOrName=No
FileObject.IconPicture=No
FileObject.IconMode=Yes
FileObject_SymbolLayout=&lt;Form&gt;[CRLF] &lt;StandardAttribute Name=&quot;Stéréotype&quot; Attribute=&quot;Stereotype&quot; Prefix=&quot;&amp;lt;&amp;lt;&quot; Suffix=&quot;&amp;gt;&amp;gt;&quot; Alignment=&quot;CNTR&quot; Caption=&quot;&quot; Mandatory=&quot;No&quot; /&gt;[CRLF] &lt;ExclusiveChoice Name=&quot;Choix exclusif&quot; Mandatory=&quot;Yes&quot; Display=&quot;HorizontalRadios&quot; &gt;[CRLF]  &lt;StandardAttribute Name=&quot;Nom&quot; Attribute=&quot;DisplayName&quot; Prefix=&quot;&quot; Suffix=&quot;&quot; Alignment=&quot;CNTR&quot; Caption=&quot;&quot; Mandatory=&quot;No&quot; /&gt;[CRLF]  &lt;StandardAttribute Name=&quot;Emplacement&quot; Attribute=&quot;LocationOrName&quot; Prefix=&quot;&quot; Suffix=&quot;&quot; Alignment=&quot;CNTR&quot; Caption=&quot;&quot; Mandatory=&quot;No&quot; /&gt;[CRLF] &lt;/ExclusiveChoice&gt;[CRLF] &lt;StandardAttribute Name=&quot;Icône&quot; Attribute=&quot;IconPicture&quot; Prefix=&quot;&quot; Suffix=&quot;&quot; Alignment=&quot;CNTR&quot; Caption=&quot;&quot; Mandatory=&quot;Yes&quot; /&gt;[CRLF]&lt;/Form&gt;
PckgShowStrn=Yes
Package.Comment=No
Package.IconPicture=No
Package_SymbolLayout=
Display Model Version=Yes
InteractionSymbol.IconPicture=No
InteractionSymbol_SymbolLayout=
UMLObject.IconPicture=No
UMLObject_SymbolLayout=
ActivationSymbol.IconPicture=No
ActivationSymbol_SymbolLayout=
Actor.IconPicture=No
Actor_SymbolLayout=
InteractionReference.IconPicture=No
InteractionReference_SymbolLayout=
InteractionFragment.IconPicture=No
InteractionFragment_SymbolLayout=
ActrShowStrn=Yes
ObjtShowStrn=Yes
ObjtShowHead=Yes
MssgShowName=Yes
MssgShowStrn=Yes
MssgShowTime=Yes
MssgShowCond=Yes
MssgShowMthd=Yes
MssgShowSign=Yes
MssgShowActv=No
IRefShowStrn=Yes
FragShowLife=Yes
ShowIntrSym=Yes

[DisplayPreferences\Symbol]

[DisplayPreferences\Symbol\FRMEOBJ]
STRNFont=Arial,8,N
STRNFont color=0, 0, 0
DISPNAMEFont=Arial,8,N
DISPNAMEFont color=0, 0, 0
LABLFont=Arial,8,N
LABLFont color=0, 0, 0
AutoAdjustToText=Yes
Keep aspect=No
Keep center=No
Keep size=No
Width=6000
Height=2000
Brush color=255 255 255
Fill Color=Yes
Brush style=6
Brush bitmap mode=12
Brush gradient mode=64
Brush gradient color=192 192 192
Brush background image=
Custom shape=
Custom text mode=0
Pen=1 0 255 128 128
Shadow color=192 192 192
Shadow=0

[DisplayPreferences\Symbol\FRMELNK]
CENTERFont=Arial,8,N
CENTERFont color=0, 0, 0
Line style=1
AutoAdjustToText=Yes
Keep aspect=No
Keep center=No
Keep size=No
Brush color=255 255 255
Fill Color=Yes
Brush style=1
Brush bitmap mode=12
Brush gradient mode=0
Brush gradient color=118 118 118
Brush background image=
Custom shape=
Custom text mode=0
Pen=1 0 128 128 255
Shadow color=192 192 192
Shadow=0

[DisplayPreferences\Symbol\FILO]
OBJSTRNFont=Arial,8,N
OBJSTRNFont color=0, 0, 0
DISPNAMEFont=Arial,8,N
DISPNAMEFont color=0, 0, 0
LCNMFont=Arial,8,N
LCNMFont color=0, 0, 0
AutoAdjustToText=Yes
Keep aspect=No
Keep center=No
Keep size=No
Width=4800
Height=3600
Brush color=255 255 255
Fill Color=Yes
Brush style=1
Brush bitmap mode=12
Brush gradient mode=0
Brush gradient color=118 118 118
Brush background image=
Custom shape=
Custom text mode=0
Pen=1 0 0 0 255
Shadow color=192 192 192
Shadow=0

[DisplayPreferences\Symbol\CLDPCKG]
STRNFont=Arial,8,N
STRNFont color=0, 0, 0
DISPNAMEFont=Arial,8,N
DISPNAMEFont color=0, 0, 0
LABLFont=Arial,8,N
LABLFont color=0, 0, 0
AutoAdjustToText=Yes
Keep aspect=No
Keep center=No
Keep size=No
Width=4800
Height=3600
Brush color=255 255 192
Fill Color=Yes
Brush style=6
Brush bitmap mode=12
Brush gradient mode=65
Brush gradient color=255 255 255
Brush background image=
Custom shape=
Custom text mode=0
Pen=1 0 178 178 178
Shadow color=192 192 192
Shadow=0

[DisplayPreferences\Symbol\SINT]
DISPNAMEFont=Arial,8,N
DISPNAMEFont color=0, 0, 0
AutoAdjustToText=Yes
Keep aspect=No
Keep center=No
Keep size=No
Width=22000
Height=28800
Brush color=255 255 255
Fill Color=No
Brush style=4
Brush bitmap mode=12
Brush gradient mode=0
Brush gradient color=118 118 118
Brush background image=
Custom shape=
Custom text mode=0
Pen=1 0 208 208 232
Shadow color=192 192 192
Shadow=0

[DisplayPreferences\Symbol\SQDOBJT]
OBJSTRNFont=Arial,8,N
OBJSTRNFont color=0, 0, 0
DISPNAMEFont=Arial,8,U
DISPNAMEFont color=0, 0, 0
AutoAdjustToText=Yes
Keep aspect=No
Keep center=No
Keep size=No
Width=4800
Height=3600
Brush color=236 249 255
Fill Color=Yes
Brush style=6
Brush bitmap mode=12
Brush gradient mode=65
Brush gradient color=255 255 255
Brush background image=
Custom shape=
Custom text mode=0
Pen=1 0 0 128 255
Shadow color=192 192 192
Shadow=0

[DisplayPreferences\Symbol\ACTVSYM]
AutoAdjustToText=Yes
Keep aspect=No
Keep center=No
Keep size=No
Width=900
Height=2400
Brush color=208 208 255
Fill Color=Yes
Brush style=6
Brush bitmap mode=12
Brush gradient mode=65
Brush gradient color=255 255 255
Brush background image=
Custom shape=
Custom text mode=0
Pen=1 0 0 0 128
Shadow color=192 192 192
Shadow=0

[DisplayPreferences\Symbol\UCDACTR]
STRNFont=Arial,8,N
STRNFont color=0, 0, 0
DISPNAMEFont=Arial,8,N
DISPNAMEFont color=0, 0, 0
AutoAdjustToText=Yes
Keep aspect=No
Keep center=No
Keep size=No
Width=4800
Height=3600
Brush color=255 255 192
Fill Color=Yes
Brush style=6
Brush bitmap mode=12
Brush gradient mode=65
Brush gradient color=255 255 255
Brush background image=
Custom shape=
Custom text mode=0
Pen=1 0 0 128 255
Shadow color=192 192 192
Shadow=0

[DisplayPreferences\Symbol\IREF]
STRNFont=Arial,8,N
STRNFont color=0, 0, 0
DISPNAMEFont=Arial,8,N
DISPNAMEFont color=0, 0, 0
AutoAdjustToText=Yes
Keep aspect=No
Keep center=No
Keep size=No
Width=4800
Height=3600
Brush color=255 255 255
Fill Color=Yes
Brush style=6
Brush bitmap mode=12
Brush gradient mode=65
Brush gradient color=208 208 232
Brush background image=
Custom shape=
Custom text mode=0
Pen=1 0 208 208 232
Shadow color=192 192 192
Shadow=0

[DisplayPreferences\Symbol\IFRG]
KWRDFont=Arial,8,N
KWRDFont color=0, 0, 0
AutoAdjustToText=Yes
Keep aspect=No
Keep center=No
Keep size=No
Width=4800
Height=3600
Brush color=255 255 255
Fill Color=Yes
Brush style=4
Brush bitmap mode=12
Brush gradient mode=65
Brush gradient color=208 208 232
Brush background image=
Custom shape=
Custom text mode=0
Pen=1 150 208 208 232
Shadow color=192 192 192
Shadow=0

[DisplayPreferences\Symbol\SQDMSSG]
DISPNAMEFont=Arial,8,N
DISPNAMEFont color=0, 0, 0
BTIMFont=Arial,8,N
BTIMFont color=0, 0, 0
ETIMFont=Arial,8,N
ETIMFont color=0, 0, 0
Line style=0
Pen=1 0 128 128 192
Shadow color=192 192 192
Shadow=0

[DisplayPreferences\Symbol\USRDEPD]
OBJXSTRFont=Arial,8,N
OBJXSTRFont color=0, 0, 0
Line style=1
AutoAdjustToText=Yes
Keep aspect=No
Keep center=No
Keep size=No
Brush color=255 255 255
Fill Color=Yes
Brush style=1
Brush bitmap mode=12
Brush gradient mode=0
Brush gradient color=118 118 118
Brush background image=
Custom shape=
Custom text mode=0
Pen=2 0 128 128 255
Shadow color=192 192 192
Shadow=0

[DisplayPreferences\Symbol\Free Symbol]
Free TextFont=Arial,8,N
Free TextFont color=0, 0, 0
Line style=0
AutoAdjustToText=Yes
Keep aspect=No
Keep center=No
Keep size=No
Brush color=255 255 255
Fill Color=Yes
Brush style=1
Brush bitmap mode=12
Brush gradient mode=0
Brush gradient color=118 118 118
Brush background image=
Custom shape=
Custom text mode=0
Pen=1 0 0 0 255
Shadow color=192 192 192
Shadow=0</a:DisplayPreferences>
<a:PaperSize>(8268, 11693)</a:PaperSize>
<a:PageMargins>((315,354), (433,354))</a:PageMargins>
<a:PageOrientation>1</a:PageOrientation>
<a:PaperSource>15</a:PaperSource>
<c:Symbols>
<o:InteractionSymbol Id="o6">
<a:ModificationDate>1400736584</a:ModificationDate>
<a:Rect>((-25004,-76138), (23608,36329))</a:Rect>
<a:AutoAdjustToText>0</a:AutoAdjustToText>
<a:BaseSymbol.Flags>4</a:BaseSymbol.Flags>
<a:LineColor>15257808</a:LineColor>
<a:FillColor>16777215</a:FillColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>DISPNAME 0 Arial,8,N</a:FontList>
<a:BrushStyle>4</a:BrushStyle>
<a:ManuallyResized>1</a:ManuallyResized>
<c:Object>
<o:SequenceDiagram Ref="o5"/>
</c:Object>
</o:InteractionSymbol>
<o:MessageSymbol Id="o7">
<a:CreationDate>1400735334</a:CreationDate>
<a:ModificationDate>1400736643</a:ModificationDate>
<a:Rect>((-18504,-57221), (254,-54701))</a:Rect>
<a:ListOfPoints>((254,-56921),(-18504,-56921))</a:ListOfPoints>
<a:ArrowStyle>8</a:ArrowStyle>
<a:LineColor>12615808</a:LineColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>DISPNAME 0 Arial,8,N
BTIM 0 Arial,8,N
ETIM 0 Arial,8,N</a:FontList>
<c:SourceSymbol>
<o:UMLObjectSequenceSymbol Ref="o8"/>
</c:SourceSymbol>
<c:DestinationSymbol>
<o:ActorSequenceSymbol Ref="o9"/>
</c:DestinationSymbol>
<c:Object>
<o:Message Ref="o10"/>
</c:Object>
</o:MessageSymbol>
<o:MessageSymbol Id="o11">
<a:CreationDate>1400735290</a:CreationDate>
<a:ModificationDate>1400736700</a:ModificationDate>
<a:Rect>((-18504,-50142), (254,-47622))</a:Rect>
<a:ListOfPoints>((254,-49842),(-18504,-49842))</a:ListOfPoints>
<a:ArrowStyle>8</a:ArrowStyle>
<a:LineColor>12615808</a:LineColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>DISPNAME 0 Arial,8,N
BTIM 0 Arial,8,N
ETIM 0 Arial,8,N</a:FontList>
<c:SourceSymbol>
<o:UMLObjectSequenceSymbol Ref="o8"/>
</c:SourceSymbol>
<c:DestinationSymbol>
<o:ActorSequenceSymbol Ref="o9"/>
</c:DestinationSymbol>
<c:Object>
<o:Message Ref="o12"/>
</c:Object>
</o:MessageSymbol>
<o:MessageSymbol Id="o13">
<a:CreationDate>1400735270</a:CreationDate>
<a:ModificationDate>1400736709</a:ModificationDate>
<a:Rect>((-18504,-43579), (254,-42033))</a:Rect>
<a:ListOfPoints>((-18504,-43279),(254,-43279))</a:ListOfPoints>
<a:ArrowStyle>8</a:ArrowStyle>
<a:LineColor>12615808</a:LineColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>DISPNAME 0 Arial,8,N
BTIM 0 Arial,8,N
ETIM 0 Arial,8,N</a:FontList>
<c:SourceSymbol>
<o:ActorSequenceSymbol Ref="o9"/>
</c:SourceSymbol>
<c:DestinationSymbol>
<o:UMLObjectSequenceSymbol Ref="o8"/>
</c:DestinationSymbol>
<c:Object>
<o:Message Ref="o14"/>
</c:Object>
</o:MessageSymbol>
<o:MessageSymbol Id="o15">
<a:CreationDate>1400734952</a:CreationDate>
<a:ModificationDate>1400736711</a:ModificationDate>
<a:Rect>((-18504,-41608), (254,-39088))</a:Rect>
<a:ListOfPoints>((254,-41308),(-18504,-41308))</a:ListOfPoints>
<a:ArrowStyle>8</a:ArrowStyle>
<a:LineColor>12615808</a:LineColor>
<a:DashStyle>2</a:DashStyle>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>DISPNAME 0 Arial,8,N
BTIM 0 Arial,8,N
ETIM 0 Arial,8,N</a:FontList>
<c:SourceSymbol>
<o:UMLObjectSequenceSymbol Ref="o8"/>
</c:SourceSymbol>
<c:DestinationSymbol>
<o:ActorSequenceSymbol Ref="o9"/>
</c:DestinationSymbol>
<c:Object>
<o:Message Ref="o16"/>
</c:Object>
</o:MessageSymbol>
<o:MessageSymbol Id="o17">
<a:CreationDate>1400734879</a:CreationDate>
<a:ModificationDate>1400736584</a:ModificationDate>
<a:Rect>((-18504,-31894), (254,-30348))</a:Rect>
<a:ListOfPoints>((254,-31594),(-18504,-31594))</a:ListOfPoints>
<a:ArrowStyle>8</a:ArrowStyle>
<a:LineColor>12615808</a:LineColor>
<a:DashStyle>2</a:DashStyle>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>DISPNAME 0 Arial,8,N
BTIM 0 Arial,8,N
ETIM 0 Arial,8,N</a:FontList>
<c:SourceSymbol>
<o:UMLObjectSequenceSymbol Ref="o8"/>
</c:SourceSymbol>
<c:DestinationSymbol>
<o:ActorSequenceSymbol Ref="o9"/>
</c:DestinationSymbol>
<c:Object>
<o:Message Ref="o18"/>
</c:Object>
</o:MessageSymbol>
<o:MessageSymbol Id="o19">
<a:CreationDate>1400734550</a:CreationDate>
<a:ModificationDate>1400736584</a:ModificationDate>
<a:Rect>((-3908,-13329), (11616,-11181))</a:Rect>
<a:ListOfPoints>((254,-11455),(3854,-11455),(3854,-13055),(254,-13055))</a:ListOfPoints>
<a:ArrowStyle>8</a:ArrowStyle>
<a:LineColor>12615808</a:LineColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>DISPNAME 0 Arial,8,N
BTIM 0 Arial,8,N
ETIM 0 Arial,8,N</a:FontList>
<c:SourceSymbol>
<o:UMLObjectSequenceSymbol Ref="o8"/>
</c:SourceSymbol>
<c:DestinationSymbol>
<o:UMLObjectSequenceSymbol Ref="o8"/>
</c:DestinationSymbol>
<c:Object>
<o:Message Ref="o20"/>
</c:Object>
</o:MessageSymbol>
<o:MessageSymbol Id="o21">
<a:CreationDate>1400734278</a:CreationDate>
<a:ModificationDate>1400736584</a:ModificationDate>
<a:Rect>((-3833,-24192), (11541,-22592))</a:Rect>
<a:ListOfPoints>((254,-22592),(3854,-22592),(3854,-24192),(254,-24192))</a:ListOfPoints>
<a:ArrowStyle>8</a:ArrowStyle>
<a:LineColor>12615808</a:LineColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>DISPNAME 0 Arial,8,N
BTIM 0 Arial,8,N
ETIM 0 Arial,8,N</a:FontList>
<c:SourceSymbol>
<o:UMLObjectSequenceSymbol Ref="o8"/>
</c:SourceSymbol>
<c:DestinationSymbol>
<o:UMLObjectSequenceSymbol Ref="o8"/>
</c:DestinationSymbol>
<c:Object>
<o:Message Ref="o22"/>
</c:Object>
</o:MessageSymbol>
<o:MessageSymbol Id="o23">
<a:CreationDate>1400734040</a:CreationDate>
<a:ModificationDate>1400736584</a:ModificationDate>
<a:Rect>((-18504,-18672), (254,-17126))</a:Rect>
<a:ListOfPoints>((254,-18372),(-18504,-18372))</a:ListOfPoints>
<a:ArrowStyle>8</a:ArrowStyle>
<a:LineColor>12615808</a:LineColor>
<a:DashStyle>2</a:DashStyle>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>DISPNAME 0 Arial,8,N
BTIM 0 Arial,8,N
ETIM 0 Arial,8,N</a:FontList>
<c:SourceSymbol>
<o:UMLObjectSequenceSymbol Ref="o8"/>
</c:SourceSymbol>
<c:DestinationSymbol>
<o:ActorSequenceSymbol Ref="o9"/>
</c:DestinationSymbol>
<c:Object>
<o:Message Ref="o24"/>
</c:Object>
</o:MessageSymbol>
<o:MessageSymbol Id="o25">
<a:CreationDate>1400733870</a:CreationDate>
<a:ModificationDate>1400736584</a:ModificationDate>
<a:Rect>((-3121,-17655), (10829,-16055))</a:Rect>
<a:ListOfPoints>((254,-16055),(3854,-16055),(3854,-17655),(254,-17655))</a:ListOfPoints>
<a:ArrowStyle>8</a:ArrowStyle>
<a:LineColor>12615808</a:LineColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>DISPNAME 0 Arial,8,N
BTIM 0 Arial,8,N
ETIM 0 Arial,8,N</a:FontList>
<c:SourceSymbol>
<o:UMLObjectSequenceSymbol Ref="o8"/>
</c:SourceSymbol>
<c:DestinationSymbol>
<o:UMLObjectSequenceSymbol Ref="o8"/>
</c:DestinationSymbol>
<c:Object>
<o:Message Ref="o26"/>
</c:Object>
</o:MessageSymbol>
<o:MessageSymbol Id="o27">
<a:CreationDate>1400733701</a:CreationDate>
<a:ModificationDate>1400736584</a:ModificationDate>
<a:Rect>((-18504,-8629), (254,-6109))</a:Rect>
<a:ListOfPoints>((254,-8329),(-18504,-8329))</a:ListOfPoints>
<a:ArrowStyle>8</a:ArrowStyle>
<a:LineColor>12615808</a:LineColor>
<a:DashStyle>2</a:DashStyle>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>DISPNAME 0 Arial,8,N
BTIM 0 Arial,8,N
ETIM 0 Arial,8,N</a:FontList>
<c:SourceSymbol>
<o:UMLObjectSequenceSymbol Ref="o8"/>
<o:UMLObjectSequenceSymbol Ref="o8"/>
</c:SourceSymbol>
<c:DestinationSymbol>
<o:ActorSequenceSymbol Ref="o9"/>
</c:DestinationSymbol>
<c:Object>
<o:Message Ref="o28"/>
</c:Object>
</o:MessageSymbol>
<o:MessageSymbol Id="o29">
<a:CreationDate>1400733558</a:CreationDate>
<a:ModificationDate>1400736584</a:ModificationDate>
<a:Rect>((-18504,-2001), (254,-455))</a:Rect>
<a:ListOfPoints>((254,-1701),(-18504,-1701))</a:ListOfPoints>
<a:ArrowStyle>8</a:ArrowStyle>
<a:LineColor>12615808</a:LineColor>
<a:DashStyle>2</a:DashStyle>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>DISPNAME 0 Arial,8,N
BTIM 0 Arial,8,N
ETIM 0 Arial,8,N</a:FontList>
<c:SourceSymbol>
<o:UMLObjectSequenceSymbol Ref="o8"/>
</c:SourceSymbol>
<c:DestinationSymbol>
<o:ActorSequenceSymbol Ref="o9"/>
</c:DestinationSymbol>
<c:Object>
<o:Message Ref="o30"/>
</c:Object>
</o:MessageSymbol>
<o:MessageSymbol Id="o31">
<a:CreationDate>1400733504</a:CreationDate>
<a:ModificationDate>1400736584</a:ModificationDate>
<a:CenterTextOffset>(-602, 1810)</a:CenterTextOffset>
<a:Rect>((254,-1222), (6139,1975))</a:Rect>
<a:ListOfPoints>((254,378),(3854,378),(3854,-1222),(254,-1222))</a:ListOfPoints>
<a:ArrowStyle>8</a:ArrowStyle>
<a:LineColor>12615808</a:LineColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>DISPNAME 0 Arial,8,N
BTIM 0 Arial,8,N
ETIM 0 Arial,8,N</a:FontList>
<c:SourceSymbol>
<o:UMLObjectSequenceSymbol Ref="o8"/>
</c:SourceSymbol>
<c:DestinationSymbol>
<o:UMLObjectSequenceSymbol Ref="o8"/>
</c:DestinationSymbol>
<c:Object>
<o:Message Ref="o32"/>
</c:Object>
</o:MessageSymbol>
<o:MessageSymbol Id="o33">
<a:CreationDate>1400731968</a:CreationDate>
<a:ModificationDate>1400736584</a:ModificationDate>
<a:Rect>((254,6612), (15074,8158))</a:Rect>
<a:ListOfPoints>((15074,6912),(254,6912))</a:ListOfPoints>
<a:ArrowStyle>8</a:ArrowStyle>
<a:LineColor>12615808</a:LineColor>
<a:DashStyle>2</a:DashStyle>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>DISPNAME 0 Arial,8,N
BTIM 0 Arial,8,N
ETIM 0 Arial,8,N</a:FontList>
<c:SourceSymbol>
<o:UMLObjectSequenceSymbol Ref="o34"/>
</c:SourceSymbol>
<c:DestinationSymbol>
<o:UMLObjectSequenceSymbol Ref="o8"/>
</c:DestinationSymbol>
<c:Object>
<o:Message Ref="o35"/>
</c:Object>
</o:MessageSymbol>
<o:MessageSymbol Id="o36">
<a:CreationDate>1400731949</a:CreationDate>
<a:ModificationDate>1400736584</a:ModificationDate>
<a:Rect>((-23,9638), (15351,12158))</a:Rect>
<a:ListOfPoints>((254,9938),(15074,9938))</a:ListOfPoints>
<a:ArrowStyle>8</a:ArrowStyle>
<a:LineColor>12615808</a:LineColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>DISPNAME 0 Arial,8,N
BTIM 0 Arial,8,N
ETIM 0 Arial,8,N</a:FontList>
<c:SourceSymbol>
<o:UMLObjectSequenceSymbol Ref="o8"/>
</c:SourceSymbol>
<c:DestinationSymbol>
<o:UMLObjectSequenceSymbol Ref="o34"/>
</c:DestinationSymbol>
<c:Object>
<o:Message Ref="o37"/>
</c:Object>
</o:MessageSymbol>
<o:MessageSymbol Id="o38">
<a:CreationDate>1400727516</a:CreationDate>
<a:ModificationDate>1400736584</a:ModificationDate>
<a:Rect>((254,13982), (15074,15528))</a:Rect>
<a:ListOfPoints>((15074,14282),(254,14282))</a:ListOfPoints>
<a:ArrowStyle>8</a:ArrowStyle>
<a:LineColor>12615808</a:LineColor>
<a:DashStyle>2</a:DashStyle>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>DISPNAME 0 Arial,8,N
BTIM 0 Arial,8,N
ETIM 0 Arial,8,N</a:FontList>
<c:SourceSymbol>
<o:UMLObjectSequenceSymbol Ref="o34"/>
</c:SourceSymbol>
<c:DestinationSymbol>
<o:UMLObjectSequenceSymbol Ref="o8"/>
</c:DestinationSymbol>
<c:Object>
<o:Message Ref="o39"/>
</c:Object>
</o:MessageSymbol>
<o:MessageSymbol Id="o40">
<a:CreationDate>1400727462</a:CreationDate>
<a:ModificationDate>1400736584</a:ModificationDate>
<a:Rect>((254,15531), (15074,17077))</a:Rect>
<a:ListOfPoints>((254,15831),(15074,15831))</a:ListOfPoints>
<a:ArrowStyle>8</a:ArrowStyle>
<a:LineColor>12615808</a:LineColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>DISPNAME 0 Arial,8,N
BTIM 0 Arial,8,N
ETIM 0 Arial,8,N</a:FontList>
<c:SourceSymbol>
<o:UMLObjectSequenceSymbol Ref="o8"/>
</c:SourceSymbol>
<c:DestinationSymbol>
<o:UMLObjectSequenceSymbol Ref="o34"/>
</c:DestinationSymbol>
<c:Object>
<o:Message Ref="o41"/>
</c:Object>
</o:MessageSymbol>
<o:MessageSymbol Id="o42">
<a:CreationDate>1400726363</a:CreationDate>
<a:ModificationDate>1400736632</a:ModificationDate>
<a:CenterTextOffset>(368, 369)</a:CenterTextOffset>
<a:Rect>((-18504,-37067), (254,-35152))</a:Rect>
<a:ListOfPoints>((-18504,-36767),(254,-36767))</a:ListOfPoints>
<a:ArrowStyle>8</a:ArrowStyle>
<a:LineColor>12615808</a:LineColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>DISPNAME 0 Arial,8,N
BTIM 0 Arial,8,N
ETIM 0 Arial,8,N</a:FontList>
<c:SourceSymbol>
<o:ActorSequenceSymbol Ref="o9"/>
</c:SourceSymbol>
<c:DestinationSymbol>
<o:UMLObjectSequenceSymbol Ref="o8"/>
</c:DestinationSymbol>
<c:Object>
<o:Message Ref="o43"/>
</c:Object>
</o:MessageSymbol>
<o:MessageSymbol Id="o44">
<a:CreationDate>1400726358</a:CreationDate>
<a:ModificationDate>1400736584</a:ModificationDate>
<a:CenterTextOffset>(336, 671)</a:CenterTextOffset>
<a:Rect>((-18504,-29282), (254,-27065))</a:Rect>
<a:ListOfPoints>((-18504,-28982),(254,-28982))</a:ListOfPoints>
<a:ArrowStyle>8</a:ArrowStyle>
<a:LineColor>12615808</a:LineColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>DISPNAME 0 Arial,8,N
BTIM 0 Arial,8,N
ETIM 0 Arial,8,N</a:FontList>
<c:SourceSymbol>
<o:ActorSequenceSymbol Ref="o9"/>
</c:SourceSymbol>
<c:DestinationSymbol>
<o:UMLObjectSequenceSymbol Ref="o8"/>
</c:DestinationSymbol>
<c:Object>
<o:Message Ref="o45"/>
</c:Object>
</o:MessageSymbol>
<o:MessageSymbol Id="o46">
<a:CreationDate>1400726351</a:CreationDate>
<a:ModificationDate>1400736584</a:ModificationDate>
<a:Rect>((-18504,-16272), (254,-14726))</a:Rect>
<a:ListOfPoints>((-18504,-15972),(254,-15972))</a:ListOfPoints>
<a:ArrowStyle>8</a:ArrowStyle>
<a:LineColor>12615808</a:LineColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>DISPNAME 0 Arial,8,N
BTIM 0 Arial,8,N
ETIM 0 Arial,8,N</a:FontList>
<c:SourceSymbol>
<o:ActorSequenceSymbol Ref="o9"/>
</c:SourceSymbol>
<c:DestinationSymbol>
<o:UMLObjectSequenceSymbol Ref="o8"/>
</c:DestinationSymbol>
<c:Object>
<o:Message Ref="o47"/>
</c:Object>
</o:MessageSymbol>
<o:MessageSymbol Id="o48">
<a:CreationDate>1400726346</a:CreationDate>
<a:ModificationDate>1400736584</a:ModificationDate>
<a:Rect>((-18504,124), (254,1670))</a:Rect>
<a:ListOfPoints>((-18504,424),(254,424))</a:ListOfPoints>
<a:ArrowStyle>8</a:ArrowStyle>
<a:LineColor>12615808</a:LineColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>DISPNAME 0 Arial,8,N
BTIM 0 Arial,8,N
ETIM 0 Arial,8,N</a:FontList>
<c:SourceSymbol>
<o:ActorSequenceSymbol Ref="o9"/>
</c:SourceSymbol>
<c:DestinationSymbol>
<o:UMLObjectSequenceSymbol Ref="o8"/>
</c:DestinationSymbol>
<c:Object>
<o:Message Ref="o49"/>
</c:Object>
</o:MessageSymbol>
<o:MessageSymbol Id="o50">
<a:CreationDate>1400726340</a:CreationDate>
<a:ModificationDate>1400736584</a:ModificationDate>
<a:Rect>((-18504,9106), (254,10652))</a:Rect>
<a:ListOfPoints>((-18504,9406),(254,9406))</a:ListOfPoints>
<a:ArrowStyle>8</a:ArrowStyle>
<a:LineColor>12615808</a:LineColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>DISPNAME 0 Arial,8,N
BTIM 0 Arial,8,N
ETIM 0 Arial,8,N</a:FontList>
<c:SourceSymbol>
<o:ActorSequenceSymbol Ref="o9"/>
</c:SourceSymbol>
<c:DestinationSymbol>
<o:UMLObjectSequenceSymbol Ref="o8"/>
</c:DestinationSymbol>
<c:Object>
<o:Message Ref="o51"/>
</c:Object>
</o:MessageSymbol>
<o:MessageSymbol Id="o52">
<a:CreationDate>1400726327</a:CreationDate>
<a:ModificationDate>1400736584</a:ModificationDate>
<a:CenterTextOffset>(-222, 590)</a:CenterTextOffset>
<a:Rect>((-18504,15663), (254,17799))</a:Rect>
<a:ListOfPoints>((-18504,15963),(254,15963))</a:ListOfPoints>
<a:ArrowStyle>8</a:ArrowStyle>
<a:LineColor>12615808</a:LineColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>DISPNAME 0 Arial,8,N
BTIM 0 Arial,8,N
ETIM 0 Arial,8,N</a:FontList>
<c:SourceSymbol>
<o:ActorSequenceSymbol Ref="o9"/>
</c:SourceSymbol>
<c:DestinationSymbol>
<o:UMLObjectSequenceSymbol Ref="o8"/>
</c:DestinationSymbol>
<c:Object>
<o:Message Ref="o53"/>
</c:Object>
</o:MessageSymbol>
<o:MessageSymbol Id="o54">
<a:CreationDate>1400723713</a:CreationDate>
<a:ModificationDate>1400736639</a:ModificationDate>
<a:Rect>((-18504,-68733), (254,-66213))</a:Rect>
<a:ListOfPoints>((254,-68433),(-18504,-68433))</a:ListOfPoints>
<a:ArrowStyle>8</a:ArrowStyle>
<a:LineColor>12615808</a:LineColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>DISPNAME 0 Arial,8,N
BTIM 0 Arial,8,N
ETIM 0 Arial,8,N</a:FontList>
<c:SourceSymbol>
<o:UMLObjectSequenceSymbol Ref="o8"/>
</c:SourceSymbol>
<c:DestinationSymbol>
<o:ActorSequenceSymbol Ref="o9"/>
</c:DestinationSymbol>
<c:Object>
<o:Message Ref="o55"/>
</c:Object>
</o:MessageSymbol>
<o:MessageSymbol Id="o56">
<a:CreationDate>1400722168</a:CreationDate>
<a:ModificationDate>1400736584</a:ModificationDate>
<a:Rect>((549,23644), (15074,25190))</a:Rect>
<a:ListOfPoints>((15074,23944),(549,23944))</a:ListOfPoints>
<a:ArrowStyle>8</a:ArrowStyle>
<a:LineColor>12615808</a:LineColor>
<a:DashStyle>2</a:DashStyle>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>DISPNAME 0 Arial,8,N
BTIM 0 Arial,8,N
ETIM 0 Arial,8,N</a:FontList>
<c:SourceSymbol>
<o:UMLObjectSequenceSymbol Ref="o34"/>
</c:SourceSymbol>
<c:DestinationSymbol>
<o:ActivationSymbol Ref="o57"/>
</c:DestinationSymbol>
<c:Object>
<o:Message Ref="o58"/>
</c:Object>
</o:MessageSymbol>
<o:MessageSymbol Id="o59">
<a:CreationDate>1400722160</a:CreationDate>
<a:ModificationDate>1400736584</a:ModificationDate>
<a:Rect>((399,25369), (15074,26915))</a:Rect>
<a:ListOfPoints>((399,25669),(15074,25669))</a:ListOfPoints>
<a:ArrowStyle>8</a:ArrowStyle>
<a:LineColor>12615808</a:LineColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>DISPNAME 0 Arial,8,N
BTIM 0 Arial,8,N
ETIM 0 Arial,8,N</a:FontList>
<c:SourceSymbol>
<o:ActivationSymbol Ref="o57"/>
</c:SourceSymbol>
<c:DestinationSymbol>
<o:UMLObjectSequenceSymbol Ref="o34"/>
</c:DestinationSymbol>
<c:Object>
<o:Message Ref="o60"/>
</c:Object>
</o:MessageSymbol>
<o:MessageSymbol Id="o61">
<a:CreationDate>1400721642</a:CreationDate>
<a:ModificationDate>1400736584</a:ModificationDate>
<a:Rect>((-18504,22144), (324,23690))</a:Rect>
<a:ListOfPoints>((324,22444),(-18504,22444))</a:ListOfPoints>
<a:ArrowStyle>8</a:ArrowStyle>
<a:LineColor>12615808</a:LineColor>
<a:DashStyle>2</a:DashStyle>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>DISPNAME 0 Arial,8,N
BTIM 0 Arial,8,N
ETIM 0 Arial,8,N</a:FontList>
<c:SourceSymbol>
<o:ActivationSymbol Ref="o57"/>
</c:SourceSymbol>
<c:DestinationSymbol>
<o:ActorSequenceSymbol Ref="o9"/>
</c:DestinationSymbol>
<c:Object>
<o:Message Ref="o62"/>
</c:Object>
</o:MessageSymbol>
<o:MessageSymbol Id="o63">
<a:CreationDate>1399483172</a:CreationDate>
<a:ModificationDate>1400736584</a:ModificationDate>
<a:Rect>((-18504,26091), (254,27637))</a:Rect>
<a:ListOfPoints>((-18504,26391),(254,26391))</a:ListOfPoints>
<a:ArrowStyle>8</a:ArrowStyle>
<a:LineColor>12615808</a:LineColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>DISPNAME 0 Arial,8,N
BTIM 0 Arial,8,N
ETIM 0 Arial,8,N</a:FontList>
<c:SourceSymbol>
<o:ActorSequenceSymbol Ref="o9"/>
</c:SourceSymbol>
<c:DestinationSymbol>
<o:UMLObjectSequenceSymbol Ref="o8"/>
</c:DestinationSymbol>
<c:Object>
<o:Message Ref="o64"/>
</c:Object>
</o:MessageSymbol>
<o:ActorSequenceSymbol Id="o9">
<a:CreationDate>1399482107</a:CreationDate>
<a:ModificationDate>1400736584</a:ModificationDate>
<a:IconMode>-1</a:IconMode>
<a:Rect>((-20904,29916), (-16105,33515))</a:Rect>
<a:LineColor>16744448</a:LineColor>
<a:FillColor>12648447</a:FillColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>STRN 0 Arial,8,N
DISPNAME 0 Arial,8,N</a:FontList>
<a:BrushStyle>6</a:BrushStyle>
<a:GradientFillMode>65</a:GradientFillMode>
<a:GradientEndColor>16777215</a:GradientEndColor>
<c:SlaveSubSymbols>
<o:LifelineSymbol Id="o65">
<a:ModificationDate>1400736444</a:ModificationDate>
<a:Rect>((-18504,-75137), (-18404,29916))</a:Rect>
<a:ListOfPoints>((-18504,29916),(-18504,-75137))</a:ListOfPoints>
<a:ArrowStyle>0</a:ArrowStyle>
<a:LineColor>16744448</a:LineColor>
<a:DashStyle>3</a:DashStyle>
<a:ShadowColor>8421504</a:ShadowColor>
</o:LifelineSymbol>
</c:SlaveSubSymbols>
<c:Object>
<o:Actor Ref="o66"/>
</c:Object>
</o:ActorSequenceSymbol>
<o:UMLObjectSequenceSymbol Id="o8">
<a:CreationDate>1399482112</a:CreationDate>
<a:ModificationDate>1400736584</a:ModificationDate>
<a:Rect>((-2146,29916), (2654,33515))</a:Rect>
<a:LineColor>16744448</a:LineColor>
<a:FillColor>16775660</a:FillColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>OBJSTRN 0 Arial,8,N
DISPNAME 0 Arial,8,U</a:FontList>
<a:BrushStyle>6</a:BrushStyle>
<a:GradientFillMode>65</a:GradientFillMode>
<a:GradientEndColor>16777215</a:GradientEndColor>
<c:SlaveSubSymbols>
<o:LifelineSymbol Id="o67">
<a:ModificationDate>1400736444</a:ModificationDate>
<a:Rect>((254,-75137), (354,29916))</a:Rect>
<a:ListOfPoints>((254,29916),(254,-75137))</a:ListOfPoints>
<a:ArrowStyle>0</a:ArrowStyle>
<a:LineColor>16744448</a:LineColor>
<a:DashStyle>3</a:DashStyle>
<a:ShadowColor>8421504</a:ShadowColor>
</o:LifelineSymbol>
<o:ActivationSymbol Id="o57">
<a:CreationDate>1400720672</a:CreationDate>
<a:ModificationDate>1400721642</a:ModificationDate>
<a:Rect>((-196,22444), (704,26827))</a:Rect>
<a:AutoAdjustToText>0</a:AutoAdjustToText>
<a:LineColor>8388608</a:LineColor>
<a:FillColor>16765136</a:FillColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:BrushStyle>6</a:BrushStyle>
<a:GradientFillMode>65</a:GradientFillMode>
<a:GradientEndColor>16777215</a:GradientEndColor>
<a:ManuallyResized>1</a:ManuallyResized>
</o:ActivationSymbol>
</c:SlaveSubSymbols>
<c:Object>
<o:UMLObject Ref="o68"/>
</c:Object>
</o:UMLObjectSequenceSymbol>
<o:UMLObjectSequenceSymbol Id="o34">
<a:CreationDate>1399482526</a:CreationDate>
<a:ModificationDate>1400736584</a:ModificationDate>
<a:Rect>((11625,29916), (18523,33515))</a:Rect>
<a:LineColor>16744448</a:LineColor>
<a:FillColor>16775660</a:FillColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>OBJSTRN 0 Arial,8,N
DISPNAME 0 Arial,8,U</a:FontList>
<a:BrushStyle>6</a:BrushStyle>
<a:GradientFillMode>65</a:GradientFillMode>
<a:GradientEndColor>16777215</a:GradientEndColor>
<c:SlaveSubSymbols>
<o:LifelineSymbol Id="o69">
<a:ModificationDate>1400736444</a:ModificationDate>
<a:Rect>((15074,-75137), (15174,29916))</a:Rect>
<a:ListOfPoints>((15074,29916),(15074,-75137))</a:ListOfPoints>
<a:ArrowStyle>0</a:ArrowStyle>
<a:LineColor>16744448</a:LineColor>
<a:DashStyle>3</a:DashStyle>
<a:ShadowColor>8421504</a:ShadowColor>
</o:LifelineSymbol>
</c:SlaveSubSymbols>
<c:Object>
<o:UMLObject Ref="o70"/>
</c:Object>
</o:UMLObjectSequenceSymbol>
<o:InteractionFragmentSymbol Id="o71">
<a:CreationDate>1400722385</a:CreationDate>
<a:ModificationDate>1400736639</a:ModificationDate>
<a:RegionConditionPositionList>((2500,300),(300,300))</a:RegionConditionPositionList>
<a:Rect>((-24004,-71157), (22606,22301))</a:Rect>
<a:AutoAdjustToText>0</a:AutoAdjustToText>
<a:LineColor>15257808</a:LineColor>
<a:LineWidth>1</a:LineWidth>
<a:FillColor>16777215</a:FillColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>KWRD 0 Arial,8,N</a:FontList>
<a:BrushStyle>4</a:BrushStyle>
<a:GradientFillMode>65</a:GradientFillMode>
<a:GradientEndColor>15257808</a:GradientEndColor>
<a:ManuallyResized>1</a:ManuallyResized>
<c:AttachedLifelines>
<o:ActorSequenceSymbol Ref="o9"/>
</c:AttachedLifelines>
<c:Object>
<o:InteractionFragment Ref="o72"/>
</c:Object>
</o:InteractionFragmentSymbol>
<o:InteractionFragmentSymbol Id="o73">
<a:CreationDate>1400727381</a:CreationDate>
<a:ModificationDate>1400736584</a:ModificationDate>
<a:RegionConditionPositionList>((2500,300))</a:RegionConditionPositionList>
<a:Rect>((-20720,-32576), (21018,19212))</a:Rect>
<a:AutoAdjustToText>0</a:AutoAdjustToText>
<a:LineColor>15257808</a:LineColor>
<a:LineWidth>1</a:LineWidth>
<a:FillColor>16777215</a:FillColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>KWRD 0 Arial,8,N</a:FontList>
<a:BrushStyle>4</a:BrushStyle>
<a:GradientFillMode>65</a:GradientFillMode>
<a:GradientEndColor>15257808</a:GradientEndColor>
<a:ManuallyResized>1</a:ManuallyResized>
<c:AttachedLifelines>
<o:ActorSequenceSymbol Ref="o9"/>
</c:AttachedLifelines>
<c:Object>
<o:InteractionFragment Ref="o74"/>
</c:Object>
</o:InteractionFragmentSymbol>
<o:InteractionFragmentSymbol Id="o75">
<a:CreationDate>1400732909</a:CreationDate>
<a:ModificationDate>1400736584</a:ModificationDate>
<a:RegionConditionPositionList>((2500,300),(300,300))</a:RegionConditionPositionList>
<a:Rect>((-18718,-10131), (17417,4394))</a:Rect>
<a:AutoAdjustToText>0</a:AutoAdjustToText>
<a:LineColor>15257808</a:LineColor>
<a:LineWidth>1</a:LineWidth>
<a:FillColor>16777215</a:FillColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>KWRD 0 Arial,8,N</a:FontList>
<a:BrushStyle>4</a:BrushStyle>
<a:GradientFillMode>65</a:GradientFillMode>
<a:GradientEndColor>15257808</a:GradientEndColor>
<c:AttachedLifelines>
<o:ActorSequenceSymbol Ref="o9"/>
<o:UMLObjectSequenceSymbol Ref="o34"/>
</c:AttachedLifelines>
<c:Object>
<o:InteractionFragment Ref="o76"/>
</c:Object>
</o:InteractionFragmentSymbol>
<o:InteractionFragmentSymbol Id="o77">
<a:CreationDate>1400733789</a:CreationDate>
<a:ModificationDate>1400736584</a:ModificationDate>
<a:RegionConditionPositionList>((2500,300))</a:RegionConditionPositionList>
<a:Rect>((-19646,-13961), (19103,12252))</a:Rect>
<a:AutoAdjustToText>0</a:AutoAdjustToText>
<a:LineColor>15257808</a:LineColor>
<a:LineWidth>1</a:LineWidth>
<a:FillColor>16777215</a:FillColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>KWRD 0 Arial,8,N</a:FontList>
<a:BrushStyle>4</a:BrushStyle>
<a:GradientFillMode>65</a:GradientFillMode>
<a:GradientEndColor>15257808</a:GradientEndColor>
<c:AttachedLifelines>
<o:ActorSequenceSymbol Ref="o9"/>
<o:UMLObjectSequenceSymbol Ref="o34"/>
</c:AttachedLifelines>
<c:Object>
<o:InteractionFragment Ref="o78"/>
</c:Object>
</o:InteractionFragmentSymbol>
<o:InteractionFragmentSymbol Id="o79">
<a:CreationDate>1400734186</a:CreationDate>
<a:ModificationDate>1400736584</a:ModificationDate>
<a:RegionConditionPositionList>((2500,300))</a:RegionConditionPositionList>
<a:Rect>((-18976,-26272), (18500,-19380))</a:Rect>
<a:AutoAdjustToText>0</a:AutoAdjustToText>
<a:LineColor>15257808</a:LineColor>
<a:LineWidth>1</a:LineWidth>
<a:FillColor>16777215</a:FillColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>KWRD 0 Arial,8,N</a:FontList>
<a:BrushStyle>4</a:BrushStyle>
<a:GradientFillMode>65</a:GradientFillMode>
<a:GradientEndColor>15257808</a:GradientEndColor>
<a:ManuallyResized>1</a:ManuallyResized>
<c:AttachedLifelines>
<o:ActorSequenceSymbol Ref="o9"/>
<o:UMLObjectSequenceSymbol Ref="o34"/>
</c:AttachedLifelines>
<c:Object>
<o:InteractionFragment Ref="o80"/>
</c:Object>
</o:InteractionFragmentSymbol>
<o:InteractionFragmentSymbol Id="o81">
<a:CreationDate>1400734776</a:CreationDate>
<a:ModificationDate>1400736622</a:ModificationDate>
<a:RegionConditionPositionList>((2500,300))</a:RegionConditionPositionList>
<a:Rect>((-21195,-34587), (21173,17792))</a:Rect>
<a:AutoAdjustToText>0</a:AutoAdjustToText>
<a:LineColor>15257808</a:LineColor>
<a:LineWidth>1</a:LineWidth>
<a:FillColor>16777215</a:FillColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>KWRD 0 Arial,8,N</a:FontList>
<a:BrushStyle>4</a:BrushStyle>
<a:GradientFillMode>65</a:GradientFillMode>
<a:GradientEndColor>15257808</a:GradientEndColor>
<a:ManuallyResized>1</a:ManuallyResized>
<c:Object>
<o:InteractionFragment Ref="o82"/>
</c:Object>
</o:InteractionFragmentSymbol>
<o:InteractionFragmentSymbol Id="o83">
<a:CreationDate>1400735096</a:CreationDate>
<a:ModificationDate>1400736704</a:ModificationDate>
<a:RegionConditionPositionList>((2500,300),(300,300),(300,300))</a:RegionConditionPositionList>
<a:Rect>((-20158,-62748), (18116,-45187))</a:Rect>
<a:AutoAdjustToText>0</a:AutoAdjustToText>
<a:LineColor>15257808</a:LineColor>
<a:LineWidth>1</a:LineWidth>
<a:FillColor>16777215</a:FillColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>KWRD 0 Arial,8,N</a:FontList>
<a:BrushStyle>4</a:BrushStyle>
<a:GradientFillMode>65</a:GradientFillMode>
<a:GradientEndColor>15257808</a:GradientEndColor>
<a:ManuallyResized>1</a:ManuallyResized>
<c:AttachedLifelines>
<o:ActorSequenceSymbol Ref="o9"/>
<o:UMLObjectSequenceSymbol Ref="o34"/>
</c:AttachedLifelines>
<c:Object>
<o:InteractionFragment Ref="o84"/>
</c:Object>
</o:InteractionFragmentSymbol>
</c:Symbols>
</o:SequenceDiagram>
</c:SequenceDiagrams>
<c:InteractionFragments>
<o:InteractionFragment Id="o72">
<a:ObjectID>02F54755-5472-4F73-AA25-07543DAC221B</a:ObjectID>
<a:CreationDate>1400722385</a:CreationDate>
<a:Creator>stark</a:Creator>
<a:ModificationDate>1400722528</a:ModificationDate>
<a:Modifier>stark</a:Modifier>
<a:Size>14475</a:Size>
<a:FragmentType>alt</a:FragmentType>
<c:Regions>
<o:InteractionFragment Id="o85">
<a:ObjectID>789040A7-85E1-4D52-AF9E-3ACE257CD73B</a:ObjectID>
<a:CreationDate>1400722518</a:CreationDate>
<a:Creator>stark</a:Creator>
<a:ModificationDate>1400736639</a:ModificationDate>
<a:Modifier>stark</a:Modifier>
<a:Size>85869</a:Size>
<a:FragmentType>opt</a:FragmentType>
<a:Condition>choisir un des defauts</a:Condition>
</o:InteractionFragment>
<o:InteractionFragment Id="o86">
<a:ObjectID>8D266936-DB1A-4189-B833-73FB605BAB91</a:ObjectID>
<a:CreationDate>1400722518</a:CreationDate>
<a:Creator>stark</a:Creator>
<a:ModificationDate>1400736436</a:ModificationDate>
<a:Modifier>stark</a:Modifier>
<a:Size>7588</a:Size>
<a:FragmentType>opt</a:FragmentType>
<a:Condition>cliquer sur bouton acceul</a:Condition>
</o:InteractionFragment>
</c:Regions>
</o:InteractionFragment>
<o:InteractionFragment Id="o74">
<a:ObjectID>2B517A69-F420-4839-A0F8-9A2F5ABA699F</a:ObjectID>
<a:CreationDate>1400727381</a:CreationDate>
<a:Creator>stark</a:Creator>
<a:ModificationDate>1400734914</a:ModificationDate>
<a:Modifier>stark</a:Modifier>
<a:Size>51787</a:Size>
<a:FragmentType>loop</a:FragmentType>
<a:Condition>pieces de machine accessibles</a:Condition>
</o:InteractionFragment>
<o:InteractionFragment Id="o76">
<a:ObjectID>B1AB1380-3725-4425-9CAD-E5535DA802A2</a:ObjectID>
<a:CreationDate>1400732909</a:CreationDate>
<a:Creator>stark</a:Creator>
<a:ModificationDate>1400732925</a:ModificationDate>
<a:Modifier>stark</a:Modifier>
<a:Size>1000</a:Size>
<a:FragmentType>alt</a:FragmentType>
<c:Regions>
<o:InteractionFragment Id="o87">
<a:ObjectID>4E8FACF0-BC92-4EDB-B0B5-21B6DE3EEFAE</a:ObjectID>
<a:CreationDate>1400732911</a:CreationDate>
<a:Creator>stark</a:Creator>
<a:ModificationDate>1400733757</a:ModificationDate>
<a:Modifier>stark</a:Modifier>
<a:Size>7844</a:Size>
<a:FragmentType>opt</a:FragmentType>
<a:Condition>resultat test existancce positif</a:Condition>
</o:InteractionFragment>
<o:InteractionFragment Id="o88">
<a:ObjectID>218EFED5-A317-4F70-B84F-F64F04988C0B</a:ObjectID>
<a:CreationDate>1400732911</a:CreationDate>
<a:Creator>stark</a:Creator>
<a:ModificationDate>1400733098</a:ModificationDate>
<a:Modifier>stark</a:Modifier>
<a:Size>6681</a:Size>
<a:FragmentType>opt</a:FragmentType>
<a:Condition>resultat test existancce negatif</a:Condition>
</o:InteractionFragment>
</c:Regions>
</o:InteractionFragment>
<o:InteractionFragment Id="o78">
<a:ObjectID>1C489EAE-E642-48E4-B4DB-47CF7B98B227</a:ObjectID>
<a:CreationDate>1400733789</a:CreationDate>
<a:Creator>stark</a:Creator>
<a:ModificationDate>1400734025</a:ModificationDate>
<a:Modifier>stark</a:Modifier>
<a:Size>1000</a:Size>
<a:FragmentType>loop</a:FragmentType>
<a:Condition>remedes accessibles</a:Condition>
</o:InteractionFragment>
<o:InteractionFragment Id="o80">
<a:ObjectID>FE806285-A2AC-4EA5-8A03-623B35607F08</a:ObjectID>
<a:CreationDate>1400734186</a:CreationDate>
<a:Creator>stark</a:Creator>
<a:ModificationDate>1400734655</a:ModificationDate>
<a:Modifier>stark</a:Modifier>
<a:Size>6892</a:Size>
<a:FragmentType>break</a:FragmentType>
<a:Condition>reponce affirmative</a:Condition>
</o:InteractionFragment>
<o:InteractionFragment Id="o82">
<a:ObjectID>E858DF7C-DAAC-4B4D-8AE3-B71BCCDB6610</a:ObjectID>
<a:CreationDate>1400734776</a:CreationDate>
<a:Creator>stark</a:Creator>
<a:ModificationDate>1400736622</a:ModificationDate>
<a:Modifier>stark</a:Modifier>
<a:Size>52379</a:Size>
<a:FragmentType>opt</a:FragmentType>
<a:Condition>defaut encore existant</a:Condition>
</o:InteractionFragment>
<o:InteractionFragment Id="o84">
<a:ObjectID>F3177470-E948-4B28-8D6B-0AC993EC0B88</a:ObjectID>
<a:CreationDate>1400735096</a:CreationDate>
<a:Creator>stark</a:Creator>
<a:ModificationDate>1400735230</a:ModificationDate>
<a:Modifier>stark</a:Modifier>
<a:Size>1000</a:Size>
<a:FragmentType>alt</a:FragmentType>
<c:Regions>
<o:InteractionFragment Id="o89">
<a:ObjectID>5D6C2506-3C09-4C82-9355-0E95D5BDBF68</a:ObjectID>
<a:CreationDate>1400735110</a:CreationDate>
<a:Creator>stark</a:Creator>
<a:ModificationDate>1400736643</a:ModificationDate>
<a:Modifier>stark</a:Modifier>
<a:Size>9309</a:Size>
<a:FragmentType>opt</a:FragmentType>
<a:Condition>choix retourner au liste des defauts</a:Condition>
</o:InteractionFragment>
<o:InteractionFragment Id="o90">
<a:ObjectID>9D5F121D-9BE4-4188-9D48-22849FB9AD14</a:ObjectID>
<a:CreationDate>1400735110</a:CreationDate>
<a:Creator>stark</a:Creator>
<a:ModificationDate>1400736695</a:ModificationDate>
<a:Modifier>stark</a:Modifier>
<a:Size>6487</a:Size>
<a:FragmentType>opt</a:FragmentType>
<a:Condition>choix de retourner à l&#39;acceuil de Stagiaire</a:Condition>
</o:InteractionFragment>
<o:InteractionFragment Id="o91">
<a:ObjectID>F833CD4A-7F3F-4E71-A649-86867A4EA327</a:ObjectID>
<a:CreationDate>1400735142</a:CreationDate>
<a:Creator>stark</a:Creator>
<a:ModificationDate>1400736704</a:ModificationDate>
<a:Modifier>stark</a:Modifier>
<a:Stereotype>choisir d&#39;annuler</a:Stereotype>
<a:Size>3378</a:Size>
<a:FragmentType>opt</a:FragmentType>
<a:Condition>Condition</a:Condition>
</o:InteractionFragment>
</c:Regions>
</o:InteractionFragment>
</c:InteractionFragments>
<c:Actors>
<o:Actor Id="o92">
<a:ObjectID>5DF5FAA8-0B71-4EE4-A98D-9377259CC06D</a:ObjectID>
<a:Name>utilisateur</a:Name>
<a:Code>utilisateur</a:Code>
<a:CreationDate>1399224869</a:CreationDate>
<a:Creator>HP</a:Creator>
<a:ModificationDate>1399398388</a:ModificationDate>
<a:Modifier>HP</a:Modifier>
</o:Actor>
<o:Actor Id="o66">
<a:ObjectID>7FECCAEA-0D84-4986-AA23-75E4CC4B23BA</a:ObjectID>
<a:Name>Stagiaire</a:Name>
<a:Code>Stagiaire</a:Code>
<a:CreationDate>1399482107</a:CreationDate>
<a:Creator>HP</a:Creator>
<a:ModificationDate>1400732128</a:ModificationDate>
<a:Modifier>stark</a:Modifier>
</o:Actor>
</c:Actors>
<c:Model.Objects>
<o:UMLObject Id="o93">
<a:ObjectID>FA428491-C068-462D-A481-84EEE62C41DB</a:ObjectID>
<a:Name>&lt;&lt; système d&#39;authentification &gt;&gt;</a:Name>
<a:Code>&lt;&lt;_systeme_&gt;&gt;_____</a:Code>
<a:CreationDate>1399224878</a:CreationDate>
<a:Creator>HP</a:Creator>
<a:ModificationDate>1399398413</a:ModificationDate>
<a:Modifier>HP</a:Modifier>
</o:UMLObject>
<o:UMLObject Id="o68">
<a:ObjectID>64FC3BBD-5DB5-41AF-AE1C-8E56940CF70E</a:ObjectID>
<a:Name>système</a:Name>
<a:Code>systeme</a:Code>
<a:CreationDate>1399482112</a:CreationDate>
<a:Creator>HP</a:Creator>
<a:ModificationDate>1400732128</a:ModificationDate>
<a:Modifier>stark</a:Modifier>
</o:UMLObject>
<o:UMLObject Id="o70">
<a:ObjectID>035E777A-AF00-4D39-9993-1CADFB258CBF</a:ObjectID>
<a:Name>base des données</a:Name>
<a:Code>base_des_donnees</a:Code>
<a:CreationDate>1399482526</a:CreationDate>
<a:Creator>HP</a:Creator>
<a:ModificationDate>1400732128</a:ModificationDate>
<a:Modifier>stark</a:Modifier>
</o:UMLObject>
</c:Model.Objects>
<c:Messages>
<o:Message Id="o94">
<a:ObjectID>C1373063-8CD1-4F67-B9AA-F6FAE2F02671</a:ObjectID>
<a:Name>formulaire d&#39;authentification</a:Name>
<a:Code>formulaire_d_authentification</a:Code>
<a:CreationDate>1399225835</a:CreationDate>
<a:Creator>HP</a:Creator>
<a:ModificationDate>1399400134</a:ModificationDate>
<a:Modifier>HP</a:Modifier>
<c:Object1>
<o:Actor Ref="o92"/>
</c:Object1>
<c:Object2>
<o:UMLObject Ref="o93"/>
</c:Object2>
</o:Message>
<o:Message Id="o95">
<a:ObjectID>427E8C9F-C0AB-4659-BF51-11E4221D3AB2</a:ObjectID>
<a:Name>saisir login/mot de passe</a:Name>
<a:Code>saisir_login_mot_de_passe</a:Code>
<a:CreationDate>1399226151</a:CreationDate>
<a:Creator>HP</a:Creator>
<a:ModificationDate>1399399558</a:ModificationDate>
<a:Modifier>HP</a:Modifier>
<c:Object1>
<o:UMLObject Ref="o93"/>
</c:Object1>
<c:Object2>
<o:Actor Ref="o92"/>
</c:Object2>
</o:Message>
<o:Message Id="o96">
<a:ObjectID>BF47068D-4929-423A-B2C2-F090BDEC2898</a:ObjectID>
<a:Name>vérifier les données saisies</a:Name>
<a:Code>verifier_les_donnees_saisies</a:Code>
<a:CreationDate>1399226273</a:CreationDate>
<a:Creator>HP</a:Creator>
<a:ModificationDate>1399226281</a:ModificationDate>
<a:Modifier>HP</a:Modifier>
<a:Delay>1</a:Delay>
<c:Object1>
<o:UMLObject Ref="o93"/>
</c:Object1>
<c:Object2>
<o:UMLObject Ref="o93"/>
</c:Object2>
</o:Message>
<o:Message Id="o97">
<a:ObjectID>077612A6-63D6-45D0-A231-86745800270F</a:ObjectID>
<a:Name>ouverture d&#39;acceuil : utilisateur connecté</a:Name>
<a:Code>ouverture_d_acceuil_:_utilisateur_connecte</a:Code>
<a:CreationDate>1399397696</a:CreationDate>
<a:Creator>HP</a:Creator>
<a:ModificationDate>1399479723</a:ModificationDate>
<a:Modifier>HP</a:Modifier>
<a:ControlFlow>R</a:ControlFlow>
<c:Object1>
<o:Actor Ref="o92"/>
</c:Object1>
<c:Object2>
<o:UMLObject Ref="o93"/>
</c:Object2>
</o:Message>
<o:Message Id="o98">
<a:ObjectID>A2B5C3EC-AC7F-4F54-90AD-4E0F2977A7D8</a:ObjectID>
<a:Name>message d&#39;erreur</a:Name>
<a:Code>message_d_erreur</a:Code>
<a:CreationDate>1399397794</a:CreationDate>
<a:Creator>HP</a:Creator>
<a:ModificationDate>1399397809</a:ModificationDate>
<a:Modifier>HP</a:Modifier>
<a:ControlFlow>R</a:ControlFlow>
<c:Object1>
<o:Actor Ref="o92"/>
</c:Object1>
<c:Object2>
<o:UMLObject Ref="o93"/>
</c:Object2>
</o:Message>
<o:Message Id="o99">
<a:ObjectID>F616A345-E8C4-4619-B178-AEF342528BDC</a:ObjectID>
<a:Name>valider</a:Name>
<a:Code>valider</a:Code>
<a:CreationDate>1399399591</a:CreationDate>
<a:Creator>HP</a:Creator>
<a:ModificationDate>1399399598</a:ModificationDate>
<a:Modifier>HP</a:Modifier>
<c:Object1>
<o:UMLObject Ref="o93"/>
</c:Object1>
<c:Object2>
<o:Actor Ref="o92"/>
</c:Object2>
</o:Message>
<o:Message Id="o100">
<a:ObjectID>F9508D1E-7500-4F9D-A607-0155763AC670</a:ObjectID>
<a:Name>formulaire d&#39;authentification ( nv essaie)</a:Name>
<a:Code>formulaire_d_authentification___nv_essaie_</a:Code>
<a:CreationDate>1399400153</a:CreationDate>
<a:Creator>HP</a:Creator>
<a:ModificationDate>1399400771</a:ModificationDate>
<a:Modifier>HP</a:Modifier>
<c:Object1>
<o:Actor Ref="o92"/>
</c:Object1>
<c:Object2>
<o:UMLObject Ref="o93"/>
</c:Object2>
</o:Message>
<o:Message Id="o64">
<a:ObjectID>12B4842A-F842-4261-8C7A-C40EDFE7F2CA</a:ObjectID>
<a:Name>demender liste des defauts</a:Name>
<a:Code>demender_liste_des_defauts</a:Code>
<a:CreationDate>1399483172</a:CreationDate>
<a:Creator>HP</a:Creator>
<a:ModificationDate>1400720191</a:ModificationDate>
<a:Modifier>stark</a:Modifier>
<c:Object1>
<o:UMLObject Ref="o68"/>
</c:Object1>
<c:Object2>
<o:Actor Ref="o66"/>
</c:Object2>
</o:Message>
<o:Message Id="o62">
<a:ObjectID>816E6507-65D8-4F07-A8BA-96305E4D689C</a:ObjectID>
<a:Name>afficher la liste des defauts</a:Name>
<a:Code>afficher_la_liste_des_defauts</a:Code>
<a:CreationDate>1400721642</a:CreationDate>
<a:Creator>stark</a:Creator>
<a:ModificationDate>1400721659</a:ModificationDate>
<a:Modifier>stark</a:Modifier>
<a:ControlFlow>R</a:ControlFlow>
<c:Object1>
<o:Actor Ref="o66"/>
</c:Object1>
<c:Object2>
<o:UMLObject Ref="o68"/>
</c:Object2>
</o:Message>
<o:Message Id="o60">
<a:ObjectID>59CDA949-D363-418E-A0D7-A15F459E450E</a:ObjectID>
<a:Name>demande des images des defauts</a:Name>
<a:Code>demande_des_images_des_defauts</a:Code>
<a:CreationDate>1400722160</a:CreationDate>
<a:Creator>stark</a:Creator>
<a:ModificationDate>1400722193</a:ModificationDate>
<a:Modifier>stark</a:Modifier>
<c:Object1>
<o:UMLObject Ref="o70"/>
</c:Object1>
<c:Object2>
<o:UMLObject Ref="o68"/>
</c:Object2>
</o:Message>
<o:Message Id="o58">
<a:ObjectID>58596D38-C770-421E-925D-A8093E1E59E1</a:ObjectID>
<a:Name>charger les images dans le formulaire</a:Name>
<a:Code>charger_les_images_dans_le_formulaire</a:Code>
<a:CreationDate>1400722168</a:CreationDate>
<a:Creator>stark</a:Creator>
<a:ModificationDate>1400722249</a:ModificationDate>
<a:Modifier>stark</a:Modifier>
<a:ControlFlow>R</a:ControlFlow>
<c:Object1>
<o:UMLObject Ref="o68"/>
</c:Object1>
<c:Object2>
<o:UMLObject Ref="o70"/>
</c:Object2>
</o:Message>
<o:Message Id="o55">
<a:ObjectID>2CFBA01C-9E3A-4BCC-A90B-C883BE18B91F</a:ObjectID>
<a:Name>Afficher Acceuil Stagiaire et fermeture de fenetre courante</a:Name>
<a:Code>Afficher_Acceuil_Stagiaire_et_fermeture_de_fenetre_courante</a:Code>
<a:CreationDate>1400723713</a:CreationDate>
<a:Creator>stark</a:Creator>
<a:ModificationDate>1400723740</a:ModificationDate>
<a:Modifier>stark</a:Modifier>
<c:Object1>
<o:Actor Ref="o66"/>
</c:Object1>
<c:Object2>
<o:UMLObject Ref="o68"/>
</c:Object2>
</o:Message>
<o:Message Id="o53">
<a:ObjectID>56EF3B0E-EEEA-43C9-B290-D2AC83DB50A1</a:ObjectID>
<a:Name>consulter une piece de machine</a:Name>
<a:Code>consulter_une_piece_de_machine</a:Code>
<a:CreationDate>1400726327</a:CreationDate>
<a:Creator>stark</a:Creator>
<a:ModificationDate>1400726418</a:ModificationDate>
<a:Modifier>stark</a:Modifier>
<c:Object1>
<o:UMLObject Ref="o68"/>
</c:Object1>
<c:Object2>
<o:Actor Ref="o66"/>
</c:Object2>
</o:Message>
<o:Message Id="o51">
<a:ObjectID>AEA02AE6-C41A-43DC-BAFB-512EF16D620A</a:ObjectID>
<a:Name>choisir remede</a:Name>
<a:Code>choisir_remede</a:Code>
<a:CreationDate>1400726340</a:CreationDate>
<a:Creator>stark</a:Creator>
<a:ModificationDate>1400727194</a:ModificationDate>
<a:Modifier>stark</a:Modifier>
<c:Object1>
<o:UMLObject Ref="o68"/>
</c:Object1>
<c:Object2>
<o:Actor Ref="o66"/>
</c:Object2>
</o:Message>
<o:Message Id="o49">
<a:ObjectID>B68F6B5D-8C5A-407C-8ED8-4BCAF575D686</a:ObjectID>
<a:Name>parametrer remede</a:Name>
<a:Code>parametrer_remede</a:Code>
<a:CreationDate>1400726346</a:CreationDate>
<a:Creator>stark</a:Creator>
<a:ModificationDate>1400727205</a:ModificationDate>
<a:Modifier>stark</a:Modifier>
<c:Object1>
<o:UMLObject Ref="o68"/>
</c:Object1>
<c:Object2>
<o:Actor Ref="o66"/>
</c:Object2>
</o:Message>
<o:Message Id="o47">
<a:ObjectID>D4EDC322-40D8-494D-85F7-867C08AA2A00</a:ObjectID>
<a:Name>valider</a:Name>
<a:Code>valider</a:Code>
<a:CreationDate>1400726351</a:CreationDate>
<a:Creator>stark</a:Creator>
<a:ModificationDate>1400727213</a:ModificationDate>
<a:Modifier>stark</a:Modifier>
<c:Object1>
<o:UMLObject Ref="o68"/>
</c:Object1>
<c:Object2>
<o:Actor Ref="o66"/>
</c:Object2>
</o:Message>
<o:Message Id="o45">
<a:ObjectID>0C41D9EE-108D-426C-808E-86A52B763F55</a:ObjectID>
<a:Name>consulter etat de defaut</a:Name>
<a:Code>consulter_etat_de_defaut</a:Code>
<a:CreationDate>1400726358</a:CreationDate>
<a:Creator>stark</a:Creator>
<a:ModificationDate>1400727234</a:ModificationDate>
<a:Modifier>stark</a:Modifier>
<c:Object1>
<o:UMLObject Ref="o68"/>
</c:Object1>
<c:Object2>
<o:Actor Ref="o66"/>
</c:Object2>
</o:Message>
<o:Message Id="o43">
<a:ObjectID>9A759259-B47D-44A1-8C39-CA0431062F51</a:ObjectID>
<a:Name>demande de Quitter</a:Name>
<a:Code>demande_de_Quitter</a:Code>
<a:CreationDate>1400726363</a:CreationDate>
<a:Creator>stark</a:Creator>
<a:ModificationDate>1400734946</a:ModificationDate>
<a:Modifier>stark</a:Modifier>
<c:Object1>
<o:UMLObject Ref="o68"/>
</c:Object1>
<c:Object2>
<o:Actor Ref="o66"/>
</c:Object2>
</o:Message>
<o:Message Id="o41">
<a:ObjectID>D47CC537-E944-493B-9EE6-866B58573C75</a:ObjectID>
<a:Name>chercher les parametre des remedes</a:Name>
<a:Code>chercher_les_parametre_des_remedes</a:Code>
<a:CreationDate>1400727462</a:CreationDate>
<a:Creator>stark</a:Creator>
<a:ModificationDate>1400727509</a:ModificationDate>
<a:Modifier>stark</a:Modifier>
<c:Object1>
<o:UMLObject Ref="o70"/>
</c:Object1>
<c:Object2>
<o:UMLObject Ref="o68"/>
</c:Object2>
</o:Message>
<o:Message Id="o39">
<a:ObjectID>41A70893-7E37-4C73-B7D4-6D6BD23A9C1E</a:ObjectID>
<a:Name>charger les parametre des remedes</a:Name>
<a:Code>charger_les_parametre_des_remedes</a:Code>
<a:CreationDate>1400727516</a:CreationDate>
<a:Creator>stark</a:Creator>
<a:ModificationDate>1400731913</a:ModificationDate>
<a:Modifier>stark</a:Modifier>
<a:ControlFlow>R</a:ControlFlow>
<c:Object1>
<o:UMLObject Ref="o68"/>
</c:Object1>
<c:Object2>
<o:UMLObject Ref="o70"/>
</c:Object2>
</o:Message>
<o:Message Id="o37">
<a:ObjectID>7DBE9A5B-B8E2-48EB-9761-B4372DE80527</a:ObjectID>
<a:Name>teste d&#39;existance de rememde pour ce defaut</a:Name>
<a:Code>teste_d_existance_de_rememde_pour_ce_defaut</a:Code>
<a:CreationDate>1400731949</a:CreationDate>
<a:Creator>stark</a:Creator>
<a:ModificationDate>1400732002</a:ModificationDate>
<a:Modifier>stark</a:Modifier>
<c:Object1>
<o:UMLObject Ref="o70"/>
</c:Object1>
<c:Object2>
<o:UMLObject Ref="o68"/>
</c:Object2>
</o:Message>
<o:Message Id="o35">
<a:ObjectID>E85E6C24-C111-4A42-8088-EB98A8521F3F</a:ObjectID>
<a:Name>repence de teste</a:Name>
<a:Code>repence_de_teste</a:Code>
<a:CreationDate>1400731968</a:CreationDate>
<a:Creator>stark</a:Creator>
<a:ModificationDate>1400732128</a:ModificationDate>
<a:Modifier>stark</a:Modifier>
<a:ControlFlow>R</a:ControlFlow>
<c:Object1>
<o:UMLObject Ref="o68"/>
</c:Object1>
<c:Object2>
<o:UMLObject Ref="o70"/>
</c:Object2>
</o:Message>
<o:Message Id="o32">
<a:ObjectID>02986481-2D73-4F62-8F69-2DC3C7DB8391</a:ObjectID>
<a:Name>verifier valeurs</a:Name>
<a:Code>verifier_valeurs</a:Code>
<a:CreationDate>1400733504</a:CreationDate>
<a:Creator>stark</a:Creator>
<a:ModificationDate>1400733547</a:ModificationDate>
<a:Modifier>stark</a:Modifier>
<a:Delay>1</a:Delay>
<c:Object1>
<o:UMLObject Ref="o68"/>
</c:Object1>
<c:Object2>
<o:UMLObject Ref="o68"/>
</c:Object2>
</o:Message>
<o:Message Id="o30">
<a:ObjectID>6606DAF2-63A0-475B-BEFD-CB732E87A97F</a:ObjectID>
<a:Name>envoyer message d&#39;indication appropirié</a:Name>
<a:Code>envoyer_message_d_indication_appropirie</a:Code>
<a:CreationDate>1400733558</a:CreationDate>
<a:Creator>stark</a:Creator>
<a:ModificationDate>1400733605</a:ModificationDate>
<a:Modifier>stark</a:Modifier>
<a:ControlFlow>R</a:ControlFlow>
<c:Object1>
<o:Actor Ref="o66"/>
</c:Object1>
<c:Object2>
<o:UMLObject Ref="o68"/>
</c:Object2>
</o:Message>
<o:Message Id="o28">
<a:ObjectID>691438A5-4576-4875-831A-AC6B7EB0192B</a:ObjectID>
<a:Name>envoyer message d&#39;inexistance de remede specifié</a:Name>
<a:Code>envoyer_message_d_inexistance_de_remede_specifie</a:Code>
<a:CreationDate>1400733701</a:CreationDate>
<a:Creator>stark</a:Creator>
<a:ModificationDate>1400733736</a:ModificationDate>
<a:Modifier>stark</a:Modifier>
<a:ControlFlow>R</a:ControlFlow>
<c:Object1>
<o:Actor Ref="o66"/>
</c:Object1>
<c:Object2>
<o:UMLObject Ref="o68"/>
</c:Object2>
</o:Message>
<o:Message Id="o26">
<a:ObjectID>31F92E7B-0D97-439B-9DDE-B60D90CA4D57</a:ObjectID>
<a:Name>enregistrer nombre de remedes traités</a:Name>
<a:Code>enregistrer_nombre_de_remedes_traites</a:Code>
<a:CreationDate>1400733870</a:CreationDate>
<a:Creator>stark</a:Creator>
<a:ModificationDate>1400733964</a:ModificationDate>
<a:Modifier>stark</a:Modifier>
<a:Delay>1</a:Delay>
<c:Object1>
<o:UMLObject Ref="o68"/>
</c:Object1>
<c:Object2>
<o:UMLObject Ref="o68"/>
</c:Object2>
</o:Message>
<o:Message Id="o24">
<a:ObjectID>73E71573-FE36-43DB-A565-6DA354930255</a:ObjectID>
<a:Name>message de confirmation de parametres</a:Name>
<a:Code>message_de_confirmation_de_parametres</a:Code>
<a:CreationDate>1400734040</a:CreationDate>
<a:Creator>stark</a:Creator>
<a:ModificationDate>1400734058</a:ModificationDate>
<a:Modifier>stark</a:Modifier>
<a:ControlFlow>R</a:ControlFlow>
<c:Object1>
<o:Actor Ref="o66"/>
</c:Object1>
<c:Object2>
<o:UMLObject Ref="o68"/>
</c:Object2>
</o:Message>
<o:Message Id="o22">
<a:ObjectID>B6F3C0ED-1C59-40BF-804D-81C97EB7786B</a:ObjectID>
<a:Name>desactivation d&#39;acces au piece de machine</a:Name>
<a:Code>desactivation_d_acces_au_piece_de_machine</a:Code>
<a:CreationDate>1400734278</a:CreationDate>
<a:Creator>stark</a:Creator>
<a:ModificationDate>1400734305</a:ModificationDate>
<a:Modifier>stark</a:Modifier>
<a:Delay>1</a:Delay>
<c:Object1>
<o:UMLObject Ref="o68"/>
</c:Object1>
<c:Object2>
<o:UMLObject Ref="o68"/>
</c:Object2>
</o:Message>
<o:Message Id="o20">
<a:ObjectID>47598300-926D-417B-849C-FE08AC3472AE</a:ObjectID>
<a:Name>desactiver acces au remede et ses parametres</a:Name>
<a:Code>desactiver_acces_au_remede_et_ses_parametres</a:Code>
<a:CreationDate>1400734550</a:CreationDate>
<a:Creator>stark</a:Creator>
<a:ModificationDate>1400734555</a:ModificationDate>
<a:Modifier>stark</a:Modifier>
<a:Delay>1</a:Delay>
<c:Object1>
<o:UMLObject Ref="o68"/>
</c:Object1>
<c:Object2>
<o:UMLObject Ref="o68"/>
</c:Object2>
</o:Message>
<o:Message Id="o18">
<a:ObjectID>A6B1888D-8FD7-40BA-AD36-7DD2B82695B9</a:ObjectID>
<a:Name>affichage fenetre resultat</a:Name>
<a:Code>affichage_fenetre_resultat</a:Code>
<a:CreationDate>1400734879</a:CreationDate>
<a:Creator>stark</a:Creator>
<a:ModificationDate>1400734891</a:ModificationDate>
<a:Modifier>stark</a:Modifier>
<a:ControlFlow>R</a:ControlFlow>
<c:Object1>
<o:Actor Ref="o66"/>
</c:Object1>
<c:Object2>
<o:UMLObject Ref="o68"/>
</c:Object2>
</o:Message>
<o:Message Id="o16">
<a:ObjectID>64867485-14C8-4212-ADBC-E1DDD6E7640D</a:ObjectID>
<a:Name>afficher resultat et demander confirmation quit</a:Name>
<a:Code>afficher_resultat_et_demander_confirmation_quit</a:Code>
<a:CreationDate>1400734952</a:CreationDate>
<a:Creator>stark</a:Creator>
<a:ModificationDate>1400735080</a:ModificationDate>
<a:Modifier>stark</a:Modifier>
<a:ControlFlow>R</a:ControlFlow>
<c:Object1>
<o:Actor Ref="o66"/>
</c:Object1>
<c:Object2>
<o:UMLObject Ref="o68"/>
</c:Object2>
</o:Message>
<o:Message Id="o14">
<a:ObjectID>7F60EE64-D720-4A83-8951-5D84388D8B0C</a:ObjectID>
<a:Name>repondre avec choix pris</a:Name>
<a:Code>repondre_avec_choix_pris</a:Code>
<a:CreationDate>1400735270</a:CreationDate>
<a:Creator>stark</a:Creator>
<a:ModificationDate>1400735282</a:ModificationDate>
<a:Modifier>stark</a:Modifier>
<c:Object1>
<o:UMLObject Ref="o68"/>
</c:Object1>
<c:Object2>
<o:Actor Ref="o66"/>
</c:Object2>
</o:Message>
<o:Message Id="o12">
<a:ObjectID>33DD1E37-19B7-4CB5-9765-9A45989B1745</a:ObjectID>
<a:Name>fermer formulaire courant et ouverture de formulaire lise des defauts</a:Name>
<a:Code>fermer_formulaire_courant_et_ouverture_de_formulaire_lise_des_defauts</a:Code>
<a:CreationDate>1400735290</a:CreationDate>
<a:Creator>stark</a:Creator>
<a:ModificationDate>1400735319</a:ModificationDate>
<a:Modifier>stark</a:Modifier>
<c:Object1>
<o:Actor Ref="o66"/>
</c:Object1>
<c:Object2>
<o:UMLObject Ref="o68"/>
</c:Object2>
</o:Message>
<o:Message Id="o10">
<a:ObjectID>820F034D-A2AD-4C19-812F-FB9A5499054D</a:ObjectID>
<a:Name>fermeture de formulaire courant et affichage de page d&#39;acceuil Stagiaire</a:Name>
<a:Code>fermeture_de_formulaire_courant_et_affichage_de_page_d_acceuil_Stagiaire</a:Code>
<a:CreationDate>1400735334</a:CreationDate>
<a:Creator>stark</a:Creator>
<a:ModificationDate>1400735373</a:ModificationDate>
<a:Modifier>stark</a:Modifier>
<c:Object1>
<o:Actor Ref="o66"/>
</c:Object1>
<c:Object2>
<o:UMLObject Ref="o68"/>
</c:Object2>
</o:Message>
</c:Messages>
<c:TargetModels>
<o:TargetModel Id="o101">
<a:ObjectID>89E724CF-8043-4B36-8742-F9CFA9050815</a:ObjectID>
<a:Name>Java</a:Name>
<a:Code>Java</a:Code>
<a:CreationDate>1399223409</a:CreationDate>
<a:Creator>HP</a:Creator>
<a:ModificationDate>1399803789</a:ModificationDate>
<a:Modifier>HP</a:Modifier>
<a:TargetModelURL>file:///%_OBJLANG%/java5-j2ee14.xol</a:TargetModelURL>
<a:TargetModelID>0DEDDB90-46E2-45A0-886E-411709DA0DC9</a:TargetModelID>
<a:TargetModelClassID>1811206C-1A4B-11D1-83D9-444553540000</a:TargetModelClassID>
<c:SessionShortcuts>
<o:Shortcut Ref="o3"/>
</c:SessionShortcuts>
</o:TargetModel>
<o:TargetModel Id="o102">
<a:ObjectID>E3391B53-C9BA-42BC-979B-A7C776C5C5C8</a:ObjectID>
<a:Name>WSDL for Java</a:Name>
<a:Code>WSDLJava</a:Code>
<a:CreationDate>1399223409</a:CreationDate>
<a:Creator>HP</a:Creator>
<a:ModificationDate>1399803789</a:ModificationDate>
<a:Modifier>HP</a:Modifier>
<a:TargetModelURL>file:///%_XEM%/WSDLJ2EE.xem</a:TargetModelURL>
<a:TargetModelID>C8F5F7B2-CF9D-4E98-8301-959BB6E86C8A</a:TargetModelID>
<a:TargetModelClassID>186C8AC3-D3DC-11D3-881C-00508B03C75C</a:TargetModelClassID>
<c:SessionShortcuts>
<o:Shortcut Ref="o4"/>
</c:SessionShortcuts>
</o:TargetModel>
</c:TargetModels>
</o:Model>
</c:Children>
</o:RootObject>

</Model>