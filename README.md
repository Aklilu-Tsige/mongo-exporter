<<< mongodb-exporter-service>>>
<<<<<<< java exporter class implemention >>>>>>>>>>>>>>

<<< Exporters >>>
<<<<<exporter.jar file >

<<<Mounting>>>>
-   - ./config/application.yaml:/usr/local/zeebe/config/application.yaml
    - ./exporters/mongodb-exporter-0.0.1-SNAPSHOT.jar:/usr/local/zeebe/lib/mongodb-exporter-0.0.1-SNAPSHOT.jar
 
      
- Zeebe config [application.yaml]
- zeebe:
  broker:
    exporters:
      mongo:
        # Mongo Exporter ----------
        # An example configuration for the mongo exporter:
        #

        className: com.demo.zeebemongoexporter.MongoExporter
        jarPath: /usr/local/zeebe/lib/mongodb-exporter-0.0.1-SNAPSHOT.jar
  
