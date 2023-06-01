package bpmnforcpsextension;

import org.eclipse.bpmn2.modeler.core.adapters.ExtendedPropertiesAdapter;
import org.eclipse.bpmn2.modeler.core.adapters.ObjectDescriptor;
import org.eclipse.emf.common.notify.AdapterFactory;

import bpmnforcpsextension.MyModel.MustNeverHappenAtAnInfiniteTime;



public class MustNeverHappenAtAnInfiniteTimePropertyTab extends ExtendedPropertiesAdapter<MustNeverHappenAtAnInfiniteTime> {

	public MustNeverHappenAtAnInfiniteTimePropertyTab (AdapterFactory adapterFactory, MustNeverHappenAtAnInfiniteTime object) {
		super(adapterFactory, object);
		
		setObjectDescriptor(new ObjectDescriptor<MustNeverHappenAtAnInfiniteTime> (this, object) {

			public String getName() {
				return object.getName();
			}
		});
	}

}
