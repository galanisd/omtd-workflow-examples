#!/usr/bin/env groovy

@Grab('eu.openminted.script:openminted-script-groovy:0.0.1-SNAPSHOT')
@groovy.transform.BaseScript eu.openminted.script.groovy.ScriptBase scriptBase

catalog "DKPro":'classpath:/CatalogBase/engines.json'
catalog "DKPro":'classpath:/CatalogBase/formats.json'

read 'String' language 'en' params([
    documentText: 'This is a test.'])
apply 'OpenNlpSegmenter'
apply 'OpenPosTagger'
write 'Conll2006'
