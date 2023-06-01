package bpmnforcpsextension;

import org.eclipse.bpmn2.modeler.core.adapters.ExtendedPropertiesAdapter;
import org.eclipse.bpmn2.modeler.core.adapters.ObjectDescriptor;
import org.eclipse.emf.common.notify.AdapterFactory;

import bpmnforcpsextension.MyModel.MFA;


public class MustFinishAtPropertyTab extends ExtendedPropertiesAdapter<MFA> {

	public MustFinishAtPropertyTab (AdapterFactory adapterFactory, MFA object) {
		super(adapterFactory, object);
		
		setObjectDescriptor(new ObjectDescriptor<MFA> (this, object) {
			
			public String getName() {
				return object.getName();
			}
		});
	}

}