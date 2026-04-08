import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.xsd.ecore.ECoreGenXsdProcessorsCapabilityFactory;

module org.nasdanika.models.xsd.ecore {
		
	requires transitive org.nasdanika.models.ecore.graph;
	requires org.eclipse.xsd;
			
	exports org.nasdanika.models.xsd.ecore;
	opens org.nasdanika.models.xsd.ecore; // For loading resources

	provides CapabilityFactory with	ECoreGenXsdProcessorsCapabilityFactory; 		
	
}
