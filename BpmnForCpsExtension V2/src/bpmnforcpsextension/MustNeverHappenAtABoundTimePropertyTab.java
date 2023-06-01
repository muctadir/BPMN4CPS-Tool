package bpmnforcpsextension;

import org.eclipse.bpmn2.modeler.core.adapters.ExtendedPropertiesAdapter;
import org.eclipse.bpmn2.modeler.core.adapters.ObjectDescriptor;
import org.eclipse.emf.common.notify.AdapterFactory;

import bpmnforcpsextension.MyModel.MustNeverHappenAtABoundTime;



public class MustNeverHappenAtABoundTimePropertyTab extends ExtendedPropertiesAdapter<MustNeverHappenAtABoundTime> {

	public MustNeverHappenAtABoundTimePropertyTab (AdapterFactory adapterFactory, MustNeverHappenAtABoundTime object) {
		super(adapterFactory, object);
		
		setObjectDescriptor(new ObjectDescriptor<MustNeverHappenAtABoundTime> (this, object) {

			public String getName() {
				return object.getName();
			}
		});
	}

}

