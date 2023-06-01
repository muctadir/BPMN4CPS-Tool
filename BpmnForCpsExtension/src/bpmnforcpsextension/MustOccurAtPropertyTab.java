package bpmnforcpsextension;
import org.eclipse.bpmn2.modeler.core.adapters.ExtendedPropertiesAdapter;
import org.eclipse.bpmn2.modeler.core.adapters.ObjectDescriptor;
import org.eclipse.emf.common.notify.AdapterFactory;

import bpmnforcpsextension.MyModel.MOA;
import bpmnforcpsextension.MyModel.MustHappenAtABoundTime;



public class MustOccurAtPropertyTab extends ExtendedPropertiesAdapter<MOA> {

	public MustOccurAtPropertyTab (AdapterFactory adapterFactory, MOA object) {
		super(adapterFactory, object);
		
		setObjectDescriptor(new ObjectDescriptor<MOA> (this, object) {
			
			public String getName() {
				return object.getName();
			}
		});
	}

}

