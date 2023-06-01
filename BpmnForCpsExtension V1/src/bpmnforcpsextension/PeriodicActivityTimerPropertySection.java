package bpmnforcpsextension;

import org.eclipse.bpmn2.modeler.core.adapters.ExtendedPropertiesAdapter;
import org.eclipse.bpmn2.modeler.core.adapters.ObjectDescriptor;
import org.eclipse.emf.common.notify.AdapterFactory;

import bpmnforcpsextension.MyModel.MyEventDefinition;
import bpmnforcpsextension.MyModel.PeriodicEvent;

public class PeriodicActivityTimerPropertySection extends  ExtendedPropertiesAdapter<PeriodicEvent> {

	public PeriodicActivityTimerPropertySection (AdapterFactory adapterFactory, PeriodicEvent object) {
		super(adapterFactory, object);
		
		setObjectDescriptor(new ObjectDescriptor<PeriodicEvent> (this, object) {

			public String getType() {
				return object.getType();
			}
		});
	}
}

