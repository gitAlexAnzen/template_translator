//This script create structure of business locations 

//To build a geospatial 2d index 
db.geoLocations.ensureIndex( { position: "2d" });

//Init specific information about all companies. This structure depend of logic business.
db.geoLocations.insert({"_id" : "33",
	"_class" : "mx.com.anzen.app.abanking.coredata.service.impl.nosql.mongodb.model.GeoLocation",
	"position" : {
		"x" : -99.1377,
		"y" : 19.298
	},
"name" : "ACOXPA",
"information" : {
    "streetNumber": "Av. Acoxpa 430",
    "colony" : "Ex Hacienda Coapa",
    "zipCode" : "14300",
    "reference" : "",
    "delegation" : "Tlalpan",
    "state" : "Ciudad de México",
    "city" : "Ciudad de México",
    "territory" : "",
    "type" : "BCH",
    "weekSchedule" : "09:00 a 17:00",
    "weekendSchedule" : "No cuenta con servicio en fin de semana"
	}
});
