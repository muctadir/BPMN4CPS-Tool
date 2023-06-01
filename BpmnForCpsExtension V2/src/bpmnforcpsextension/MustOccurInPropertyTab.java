package bpmnforcpsextension;

import org.eclipse.bpmn2.modeler.core.adapters.ExtendedPropertiesAdapter;
import org.eclipse.bpmn2.modeler.core.adapters.ObjectDescriptor;
import org.eclipse.emf.common.notify.AdapterFactory;

import bpmnforcpsextension.MyModel.MOI;


public class MustOccurInPropertyTab extends ExtendedPropertiesAdapter<MOI> {

	public MustOccurInPropertyTab (AdapterFactory adapterFactory, MOI object) {
		super(adapterFactory, object);
		
		setObjectDescriptor(new ObjectDescriptor<MOI> (this, object) {
			public String getName() {
				return object.getName();
			}
		});
	}

}
