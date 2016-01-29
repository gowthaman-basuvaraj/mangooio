## Version 2.3.1

**Released at 27.01.2016**

* Fxed bug when config injector was initialized in application start

## Version 2.3.0

**Released at 26.01.2016**

* https://github.com/svenkubiak/mangooio/issues/126[#126] Added i18n cookie to LocaleHandler (MrDunne)
* https://github.com/svenkubiak/mangooio/issues/118[#118] Refactored request chaining for custom handlers (svenkubiak, MarkVink)
* https://github.com/svenkubiak/mangooio/issues/122[#122] Fixed inconsistency configuration controller package (MrDunne)
* https://github.com/svenkubiak/mangooio/issues/109[#109] Refactored Config (svenkubiak)
* https://github.com/svenkubiak/mangooio/issues/120[#120] Added getAcceptLangauge to Request (MrDunne)
* https://github.com/svenkubiak/mangooio/issues/121[#121] Updated readme (MrDunne)
* Added an option to add a custom cookie in test utilities request method (svenkubiak)
* Removed Mangoo.TEST enum in test utilities (svenkubiak)
* Removed cache provider (svenkubiak)
* Refactored LocaleHandler (svenkubiak)
* Sonar refactorings (svenkubiak)
* Updated documentation (svenkubiak)
* Version bumps (svenkubiak)
	* undertow-core 1.3.12.Final -> 1.3.15.Final
	* mockito 2.0.36-Beta -> 2.0.40-Beta
	* dsiutils 2.2.5 -> 2.2.6

## Version 2.2.0

**Released at 10.01.2016**

* https://github.com/svenkubiak/mangooio/issues/110[#110] Added X-Response-Header (svenkubiak)
* https://github.com/svenkubiak/mangooio/issues/108[#108] Refactored RequestHandler (svenkubiak)
* https://github.com/svenkubiak/mangooio/issues/98[#98] Improved RequestHandler (svenkubiak)
* Added LocalDateTime timestamp of application start (svenkubiak)
* Added new Benchmark project (svenkubiak)
* Improved application startup time (svenkubiak)
* Updated documentation (svenkubiak)
* Version bumps (svenkubiak)
	* undertow-core 1.3.10.Final -> 1.3.12.Final
	* bcprov-jdk15on 1.53 -> 1.54
	* mockito 2.0.33-Beta -> 2.0.36-Beta

## Version 2.1.0

**Released at 21.12.2015**

* https://github.com/svenkubiak/mangooio/issues/103[#103] Fixed bug when cookie encryption was enabled (svenkubiak)
* https://github.com/svenkubiak/mangooio/issues/102[#102] Made Cache eviction configurable (svenkubiak)
* https://github.com/svenkubiak/mangooio/issues/101[#101] Fixed keys in archetype (MarkVink)
* https://github.com/svenkubiak/mangooio/issues/97[#97] Fixed incorrect Form documentation (svenkubiak, MarkVink)
* https://github.com/svenkubiak/mangooio/issues/94[#95] Added new @memory administrative URL (svenkubiak)
* https://github.com/svenkubiak/mangooio/issues/94[#94] Added new @system administrative URL (svenkubiak)
* https://github.com/svenkubiak/mangooio/issues/93[#93] Improved DispatcherHandler/RequestHandler (svenkubiak)
* Updated documentation (svenkubiak, MarkVink)
* Version bumps (svenkubiak)
	* log4j 2.4.1 -> 2.5
	* mockito 2.0.31-Beta -> 2.0.33-Beta

## Version 2.0.2

**Released at 17.12.2015**

* https://github.com/svenkubiak/mangooio/issues/91[#91] Added numeric validation (svenkubiak)
* https://github.com/svenkubiak/mangooio/issues/90[#90] Added JSONUtils for custom serialization with annotations (svenkubiak)
* https://github.com/svenkubiak/mangooio/issues/89[#89] Added Internal Server Error to Response class (svenkubiak)
* Sonar refactorings (svenkubiak)
* Updated documentation (svenkubiak)

## Version 2.0.1

**Released at 13.12.2015**

* Fixed bug in documentation asciidoc file (svenkubiak)

## Version 2.0.0

**Released at 13.12.2015**

* https://github.com/svenkubiak/mangooio/issues/79[#79] Add Server-Sent Events handler (svenkubiak)
* https://github.com/svenkubiak/mangooio/issues/78[#78] Switched to plugin and dependency management in root pom.xml (svenkubiak)
* https://github.com/svenkubiak/mangooio/issues/69[#69] Restructured integration tests (svenkubiak)
* https://github.com/svenkubiak/mangooio/issues/76[#76] Improved handling of values in forms (svenkubiak)
* https://github.com/svenkubiak/mangooio/issues/77[#77] Added option for adding custom cookies (svenkubiak)
* https://github.com/svenkubiak/mangooio/issues/75[#75] Fixed bug that did not handle remember in authentication correctly (svenkubiak)
* https://github.com/svenkubiak/mangooio/issues/74[#74] Refactored test utilities (svenkubiak)
* https://github.com/svenkubiak/mangooio/issues/64[#64] Move to log4j2 for logging (svenkubiak)
* https://github.com/svenkubiak/mangooio/issues/53[#53] Extracted Mailer to own extension (svenkubiak)
* https://github.com/svenkubiak/mangooio/issues/66[#66] Removed all redundant legacy code  (svenkubiak)
* https://github.com/svenkubiak/mangooio/issues/45[#45] Removed all @deprecated methods and classes (svenkubiak)
* Refactored routing mechanism to routes.yaml file (svenkubiak)
* Code cleanup, refactorings and more JavaDoc (svenkubiak)
* Updated Documentation (svenkubiak)
* Version bumps (svenkubiak)
	* undertow-core 1.3.3.Final -> 1.3.10.Final
	* guava 18.0 -> 19.0
	* fluent-hc 4.4.1 -> 4.5.1
	* fluentlenium-core 0.10.3 -> 0.10.8
	* json-path 2.0.0 -> 2.1.0

## Version 1.3.2

**Released at 19.11.2015**

* Fixed NPE in maven plugin (svenkubiak)

## Version 1.3.1

**Released at 25.10.2015**

* Fixed bug that displayed the wrong previous firing time on @scheduler page (svenkubiak)
* Fixed bug in table that displayed schedule job on @scheduler page (svenkubiak)

## Version 1.3.0

**Released at 22.10.2015**

* https://github.com/svenkubiak/mangooio/issues/73[#73] Added Basic HTTP authentication for administrative URLs (svenkubiak)
* https://github.com/svenkubiak/mangooio/issues/72[#72] Added @scheduler administrative URL (svenkubiak)
* https://github.com/svenkubiak/mangooio/issues/71[#71] Added autostart option to scheduler (svenkubiak)
* Code cleanup, refactorings and more javadoc (svenkubiak)
* Updated Documentation (svenkubiak)
* Version bumps (svenkubiak)
	* undertow 1.3.0.Final -> 1.3.3.Final
	* bcprov-jdk15on 1.52 -> 1.53

## Version 1.2.0

**Released at 17.10.2015**

* https://github.com/svenkubiak/mangooio/issues/33[#33] Added Cookie versioning (svenkubiak)
* https://github.com/svenkubiak/mangooio/issues/57[#57] Added OAuth to authentication (svenkubiak)
* https://github.com/svenkubiak/mangooio/issues/61[#61] Move Body to Request (svenkubiak)
* https://github.com/svenkubiak/mangooio/issues/58[#58] Added @metrics administrative URL (svenkubiak)
* Added PUT and DELETE to MangooRequest in test utilities (svenkuibiak)
* Fixed typo in MangooRequestFilter interface (svenkubiak)
* Updated Documentation (svenkubiak)
* Version bumps (svenkubiak)
	* undertow 1.2.12.Final -> 1.3.0.Final
	* quartz 2.2.1 -> 2.2.2
	* jetty-websocket 8.1.17.v20150415 -> 8.1.18.v20150929

## Version 1.1.4

**Released at 04.10.2015**

* Fixed bug when sending binary content (svenkubiak)
* ExceptionHandler now preserves root cause when exception occurs (svenkubiak)

## Version 1.1.3

**Released at 21.09.2015**

* https://github.com/svenkubiak/mangooio/issues/62[#62] Set default encoding (UTF-8) to form parsing (svenkubiak)
* https://github.com/svenkubiak/mangooio/issues/59[#59] Fixed a NPE when template exception was caught (svenkubiak)

## Version 1.1.2

**Released at 17.09.2015**

* Fixed a NPE when a Request object and JSON was required in a controller method (svenkubiak)
* Refactored dev mode exception template (svenkubiak)
* Fixed bug that did not show exception in frontend in dev mode (svenkubiak)
* Fixed typo in ContentType enum (svenkubiak)

## Version 1.1.1

**Released at 15.09.2015**

* Updated Documentation (svenkubiak)

## Version 1.1.0

**Released at 14.09.2015**

* Refactored RequestHandler (svenkubiak)
* Refactored EhCache to Guava Cache (svenkubiak)
* Added ETag support for dynamic content (svenkubiak)
* Added a method for adding a complete content map to a template (svenkubiak)
* Added administrative URLs @health, @routes, @cache and @config (svenkubiak)
* Updated Documentation (svenkubiak)
* https://github.com/svenkubiak/mangooio/issues/52[#52] Refactored filters (svenkubiak)
* https://github.com/svenkubiak/mangooio/issues/40[#40] Added handling of multiple parameters in controller method (svenkubiak)
* https://github.com/svenkubiak/mangooio/issues/39[#39] Added methods for parameter validation (svenkubiak)
* https://github.com/svenkubiak/mangooio/issues/37[#37] Added option to set the secure flag for session and auth cookie (svenkubiak)
* https://github.com/svenkubiak/mangooio/issues/35[#35] Added method for regular expression to validation (svenkubiak)
* https://github.com/svenkubiak/mangooio/issues/34[#34] Added LocalDate and LocalDateTime as request parameter (svenkubiak)
* https://github.com/svenkubiak/mangooio/issues/36[#36] Validation now works for numeric values (svenkubiak)
* Version bumps (svenkubiak)
	* doctester-core 1.1.6 -> 1.1.8
	* snakeyaml 1.15 -> 1.16
	* junit-toolbox 2.1 -> 2.2
	* undertow 1.2.9.Final -> 1.2.12.Final

## Version 1.0.1

**Released at 05.08.2015**

* Fixed typo in archetype that prevented archetype from building (svenkubiak)

## Version 1.0.0

**Released at 31.07.2015**

* Updated documentation (svenkubiak)

## Version 1.0.0-RC5

**Released at 23.07.2015**

* Fixed bug, that prevented dev mode from starting (svenkubiak)
* Updated documentation (svenkubiak)

## Version 1.0.0-RC4

**Released at 23.07.2015**

* Refactored packaging from mangoo.io to io.mangoo (svenkubiak)
* Updated documentation (svenkubiak)
* Sonar refactorings (svenkubiak)
* Added more JavaDoc (svenkubiak)

## Version 1.0.0-RC3

**Released at 10.07.2015**

* Added dispatcher handler and refactored invoking of requesthandler (svenkubiak)
* Added X-XSS-Protection, X-Content-Type-Options and X-Frame-Options headers (svenkubiak)

## Version 1.0.0-RC2

**Released at 07.07.2015**#

* Added some more javadoc (svenkubiak)
* Template engine does not throw generic exception anymore, throws specific ones instead (svenkubiak)
* Version bumps (svenkubiak)
	* undertow-core 1.2.7.Final -> 1.2.8.Final
	* freemarker 2.3.22 -> 2.3.23

## Version 1.0.0-RC1

**Released at 03.07.2015**

* Sonar Refactorings (svenkubiak)
* https://github.com/svenkubiak/mangooio/issues/32[#32] Switched to Java8 DateTime API (svenkubiak)

## Version 1.0.0-Beta5

**Released at 01.07.2015**

* https://github.com/svenkubiak/mangooio/issues/29[#29] Fixed bug in authentication and session cookie generation (svenkubiak)
* https://github.com/svenkubiak/mangooio/issues/28[#28] Changed default expire of authentication to one hour (svenkubiak)
* https://github.com/svenkubiak/mangooio/issues/26[#26] Added option to pass an external configuration path (svenkubiak)
* https://github.com/svenkubiak/mangooio/issues/23[#23] Added form unit tests and more bindings tests (svenkubiak)
* https://github.com/svenkubiak/mangooio/issues/20[#20] Added convinent methods for retrieving default config values (svenkubiak)
* https://github.com/svenkubiak/mangooio/issues/24[#24] Switched from properties to yaml configuration (svenkubiak)
* https://github.com/svenkubiak/mangooio/issues/17[#17] Added preparsing of routes (svenkubiak)

## Version 1.0.0-Beta4

**Released at 29.07.2015**

* https://github.com/svenkubiak/mangooio/issues/19[#19] Fixed MangooFluent and refactored testing utilities (svenkubiak)
* https://github.com/svenkubiak/mangooio/issues/18[#18] Added default validation messages for form handling (svenkubiak)
* Better exception handling when in dev mode (svenkubiak)
* Fixed bug that prevented flash from bein passed to next request (svenkubiak)
* Optimized the shade plugin to create smaller JAR files (svenkubiak)

## Version 1.0.0-Beta3

**Released at 26.07.2015**

* Fixed bug that did not set the correct cookie for authentication (svenkubiak)
* Fixed bug in authentication which caused an error when authentication was injected (svenkubiak)
* Fixed bug in cache that throw an NPE when getType was called and value was not in cache (svenkubiak)
* Added method to add additional content to template with a filter (svenkubiak)
* Added missing interfaces methods to maven archetype (svenkubiak)

## Version 1.0.0-Beta2

**Released at 23.07.2015**

* https://github.com/svenkubiak/mangooio/issues/9[#9] Refactored dev mode exception page (svenkubiak)
* https://github.com/svenkubiak/mangooio/issues/15[#15] Added version tag to documentation (PDF and HTML) (svenkubiak)
* https://github.com/svenkubiak/mangooio/issues/16[#16] Fixed bug that result in wrong compilation when in dev mode (svenkubiak)
* Cache is not autostarted anymore (svenkubiak)
* Fixed bug that throw NumberFormatException when passing an empty request parameter (svenkubiak)

## Version 1.0.0-Beta1

**Released at 17.07.2015**

* Added server "Undertow" token to response (svenkubiak)
* Added new lifecycle hook "applicationInitialized" (svenkubiak)
* Fixed bug that checked mode for testing incorrectly (svenkubiak)
* https://github.com/svenkubiak/mangooio/issues/10[#10] Added option to add additional headers to response (svenkubiak)
* https://github.com/svenkubiak/mangooio/issues/12[#12] Added option to autocast cache values (svenkubiak)
* https://github.com/svenkubiak/mangooio/issues/11[#11] Application name and secret is now generated from user input (svenkubiak)
* https://github.com/svenkubiak/mangooio/issues/13[#13] Archetype now takes root project version on generation (svenkubiak)
* Updated documentation (svenkubiak)
* Sonar refactorings (svenkubiak)

## Version 1.0.0-Alpha3

**Released at 15.06.2015**

* https://github.com/svenkubiak/mangooio/issues/2[#2] Fixed flash passing between requests (svenkubiak)
* https://github.com/svenkubiak/mangooio/issues/1[#1] Fixed failing parameter tests (svenkubiak)
* https://github.com/svenkubiak/mangooio/issues/6[#6] Version bump (svenkubiak)
* https://github.com/svenkubiak/mangooio/issues/5[#5] Added option for sending binary content (svenkubiak)
* Added HtmlUnitDriver to MangooUnit (svenkubiak)
* Removed changelog from documentation and added to seperate file (svenkubiak)
* Fixed bug that did not pass request parameter when project was generated from archetype (svenkubiak)

## Version 1.0.0-Alpha2

**Released at 11.06.2015**

* Added asciidoc documentation to mangooio-core (svenkubiak)

## Version 1.0.0-Alpha1

**Released at 11.06.2015**

* Initial release (svenkubiak)