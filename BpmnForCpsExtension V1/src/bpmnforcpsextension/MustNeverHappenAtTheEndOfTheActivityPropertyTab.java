package bpmnforcpsextension;

import org.eclipse.bpmn2.modeler.core.adapters.ExtendedPropertiesAdapter;
import org.eclipse.bpmn2.modeler.core.adapters.ObjectDescriptor;
import org.eclipse.emf.common.notify.AdapterFactory;

import bpmnforcpsextension.MyModel.MustNeverHappenAtTheEndOfTheActivity;



public class MustNeverHappenAtTheEndOfTheActivityPropertyTab extends ExtendedPropertiesAdapter<MustNeverHappenAtTheEndOfTheActivity> {

	public MustNeverHappenAtTheEndOfTheActivityPropertyTab (AdapterFactory adapterFactory, MustNeverHappenAtTheEndOfTheActivity object) {
		super(adapterFactory, object);
		
		setObjectDescriptor(new ObjectDescriptor<MustNeverHappenAtTheEndOfTheActivity> (this, object) {

			public String getName() {
				return object.getName();
			}
		});
	}
}

