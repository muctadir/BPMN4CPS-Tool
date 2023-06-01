package bpmnforcpsextension;

import org.eclipse.bpmn2.Activity;
import org.eclipse.bpmn2.modeler.core.adapters.ExtendedPropertiesAdapter;
import org.eclipse.bpmn2.modeler.core.adapters.ObjectDescriptor;
import org.eclipse.emf.common.notify.AdapterFactory;

import bpmnforcpsextension.MyModel.MSI;



public class MustStartInPropertyTab extends ExtendedPropertiesAdapter<MSI> {

	public MustStartInPropertyTab (AdapterFactory adapterFactory, MSI object) {
		super(adapterFactory, object);
		
		setObjectDescriptor(new ObjectDescriptor<MSI> (this, object) {
			
			public String getName() {
				return object.getName();
			}
		});
	}

}

