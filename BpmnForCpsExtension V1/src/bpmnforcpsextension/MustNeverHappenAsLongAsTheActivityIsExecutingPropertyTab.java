package bpmnforcpsextension;

import org.eclipse.bpmn2.modeler.core.adapters.ExtendedPropertiesAdapter;
import org.eclipse.bpmn2.modeler.core.adapters.ObjectDescriptor;
import org.eclipse.emf.common.notify.AdapterFactory;

import bpmnforcpsextension.MyModel.MustNeverHappenAsLongAsTheActivityIsExecuting;
public class MustNeverHappenAsLongAsTheActivityIsExecutingPropertyTab extends ExtendedPropertiesAdapter<MustNeverHappenAsLongAsTheActivityIsExecuting> {

	public MustNeverHappenAsLongAsTheActivityIsExecutingPropertyTab (AdapterFactory adapterFactory, MustNeverHappenAsLongAsTheActivityIsExecuting object) {
		super(adapterFactory, object);
		
		setObjectDescriptor(new ObjectDescriptor<MustNeverHappenAsLongAsTheActivityIsExecuting> (this, object) {

			public String getName() {
				return object.getName();
			}
		});
	}

}