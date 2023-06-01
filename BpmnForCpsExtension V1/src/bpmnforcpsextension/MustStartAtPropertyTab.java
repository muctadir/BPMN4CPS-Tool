package bpmnforcpsextension;

import org.eclipse.bpmn2.Activity;
import org.eclipse.bpmn2.modeler.core.adapters.ExtendedPropertiesAdapter;
import org.eclipse.bpmn2.modeler.core.adapters.ObjectDescriptor;
import org.eclipse.emf.common.notify.AdapterFactory;

import bpmnforcpsextension.MyModel.MSA;



public class MustStartAtPropertyTab extends ExtendedPropertiesAdapter<MSA> {

	public MustStartAtPropertyTab (AdapterFactory adapterFactory, MSA object) {
		super(adapterFactory, object);
		
		setObjectDescriptor(new ObjectDescriptor<MSA> (this, object) {
			
			public String getName() {
				return object.getName();
			}
			public Activity getTraget() {
			return object.getTarget();
		}
		public String getType() {
			return object.getType();
		}
		public String getValue() {
			return object.getValue();
		}
			
					});
	}

}


