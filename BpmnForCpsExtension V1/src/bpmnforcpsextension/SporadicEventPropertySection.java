package bpmnforcpsextension;

import org.eclipse.bpmn2.modeler.core.adapters.ExtendedPropertiesAdapter;
import org.eclipse.bpmn2.modeler.core.adapters.ObjectDescriptor;
import org.eclipse.emf.common.notify.AdapterFactory;

import bpmnforcpsextension.MyModel.PeriodicEvent;
import bpmnforcpsextension.MyModel.SporadicEvent;

public class SporadicEventPropertySection extends  ExtendedPropertiesAdapter<SporadicEvent> {

	public SporadicEventPropertySection (AdapterFactory adapterFactory, SporadicEvent object) {
		super(adapterFactory, object);
		
		setObjectDescriptor(new ObjectDescriptor<SporadicEvent> (this, object) {

			public String getType() {
				return object.getType();
			}
		});
	}
}

