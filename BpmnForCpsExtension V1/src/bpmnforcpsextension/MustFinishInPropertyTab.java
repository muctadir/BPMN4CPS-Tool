package bpmnforcpsextension;

import org.eclipse.bpmn2.modeler.core.adapters.ExtendedPropertiesAdapter;
import org.eclipse.bpmn2.modeler.core.adapters.ObjectDescriptor;
import org.eclipse.emf.common.notify.AdapterFactory;

import bpmnforcpsextension.MyModel.MFI;


public class MustFinishInPropertyTab extends ExtendedPropertiesAdapter<MFI> {

	public MustFinishInPropertyTab (AdapterFactory adapterFactory, MFI object) {
		super(adapterFactory, object);
		
		setObjectDescriptor(new ObjectDescriptor<MFI> (this, object) {
			public String getName() {
				return object.getName();
			}
		});
	}

}
