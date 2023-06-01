package bpmnforcpsextension;

import org.eclipse.bpmn2.modeler.core.adapters.ExtendedPropertiesAdapter;
import org.eclipse.bpmn2.modeler.core.adapters.ObjectDescriptor;
import org.eclipse.emf.common.notify.AdapterFactory;

import bpmnforcpsextension.MyModel.MustNeverHappenAtTheStartOfTheActivity;



public class MustNeverHappenAtTheStartOfTheActivityPropertyTab extends ExtendedPropertiesAdapter<MustNeverHappenAtTheStartOfTheActivity> {

	public MustNeverHappenAtTheStartOfTheActivityPropertyTab (AdapterFactory adapterFactory, MustNeverHappenAtTheStartOfTheActivity object) {
		super(adapterFactory, object);
		
		setObjectDescriptor(new ObjectDescriptor<MustNeverHappenAtTheStartOfTheActivity> (this, object) {

			public String getName() {
				return object.getName();
			}
		});
	}
}

