package bpmnforcpsextension;

import org.eclipse.bpmn2.modeler.core.adapters.ExtendedPropertiesAdapter;
import org.eclipse.bpmn2.modeler.core.adapters.ObjectDescriptor;
import org.eclipse.emf.common.notify.AdapterFactory;

import bpmnforcpsextension.MyModel.MustHappenAsLongAsTheActivityIsExecuting;

public class MustHappenAsLongAsTheActivityIsExecutingPropertyTab extends ExtendedPropertiesAdapter<MustHappenAsLongAsTheActivityIsExecuting> {

	public MustHappenAsLongAsTheActivityIsExecutingPropertyTab (AdapterFactory adapterFactory, MustHappenAsLongAsTheActivityIsExecuting object) {
		super(adapterFactory, object);
		
		setObjectDescriptor(new ObjectDescriptor<MustHappenAsLongAsTheActivityIsExecuting> (this, object) {
			public String getName() {
				return object.getName();
			}
		});
	}

}

