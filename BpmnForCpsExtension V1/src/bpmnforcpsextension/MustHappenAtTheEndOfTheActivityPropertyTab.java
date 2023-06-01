package bpmnforcpsextension;

import org.eclipse.bpmn2.modeler.core.adapters.ExtendedPropertiesAdapter;
import org.eclipse.bpmn2.modeler.core.adapters.ObjectDescriptor;
import org.eclipse.emf.common.notify.AdapterFactory;

import bpmnforcpsextension.MyModel.MustHappenAtTheEndOfTheActivity;



public class MustHappenAtTheEndOfTheActivityPropertyTab extends ExtendedPropertiesAdapter<MustHappenAtTheEndOfTheActivity> {

	public MustHappenAtTheEndOfTheActivityPropertyTab (AdapterFactory adapterFactory, MustHappenAtTheEndOfTheActivity object) {
		super(adapterFactory, object);
		
		setObjectDescriptor(new ObjectDescriptor<MustHappenAtTheEndOfTheActivity> (this, object) {

			public String getName() {
				return object.getName();
			}
		});
	}
}
