#!/usr/bin/env groovy

@Grab('eu.openminted.script:openminted-script-groovy:0.0.1-SNAPSHOT')
@groovy.transform.BaseScript eu.openminted.script.groovy.ScriptBase scriptBase

catalog "DKPro":'classpath:/CatalogBase/engines.json'
catalog "DKPro":'classpath:/CatalogBase/formats.json'

read 'String' from language 'en' from './testInput/*.pdf'
write 'Xmi' to './testOutput/'


