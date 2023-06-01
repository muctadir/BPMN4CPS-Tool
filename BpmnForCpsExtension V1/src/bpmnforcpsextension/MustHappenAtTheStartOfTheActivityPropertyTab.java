package bpmnforcpsextension;

import org.eclipse.bpmn2.modeler.core.adapters.ExtendedPropertiesAdapter;
import org.eclipse.bpmn2.modeler.core.adapters.ObjectDescriptor;
import org.eclipse.emf.common.notify.AdapterFactory;

import bpmnforcpsextension.MyModel.MustHappenAtTheStartOfTheActivity;



public class MustHappenAtTheStartOfTheActivityPropertyTab extends ExtendedPropertiesAdapter<MustHappenAtTheStartOfTheActivity> {

	public MustHappenAtTheStartOfTheActivityPropertyTab (AdapterFactory adapterFactory, MustHappenAtTheStartOfTheActivity object) {
		super(adapterFactory, object);
		
		setObjectDescriptor(new ObjectDescriptor<MustHappenAtTheStartOfTheActivity> (this, object) {

			public String getName() {
				return object.getName();
			}
		});
	}
}
