package bpmnforcpsextension;
import org.eclipse.bpmn2.modeler.core.adapters.ExtendedPropertiesAdapter;
import org.eclipse.bpmn2.modeler.core.adapters.ObjectDescriptor;
import org.eclipse.emf.common.notify.AdapterFactory;

import bpmnforcpsextension.MyModel.MustHappenAtABoundTime;



public class MustHappenAtABoundTimePropertyTab extends ExtendedPropertiesAdapter<MustHappenAtABoundTime> {

	public MustHappenAtABoundTimePropertyTab (AdapterFactory adapterFactory, MustHappenAtABoundTime object) {
		super(adapterFactory, object);
		
		setObjectDescriptor(new ObjectDescriptor<MustHappenAtABoundTime> (this, object) {
			
			public String getName() {
				return object.getName();
			}
		});
	}

}

