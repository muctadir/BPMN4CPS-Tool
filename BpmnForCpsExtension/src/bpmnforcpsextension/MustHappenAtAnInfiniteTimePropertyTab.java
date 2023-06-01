package bpmnforcpsextension;

import java.util.List;

import org.eclipse.bpmn2.Task;
import org.eclipse.bpmn2.modeler.core.adapters.ExtendedPropertiesAdapter;
import org.eclipse.bpmn2.modeler.core.adapters.ObjectDescriptor;
import org.eclipse.bpmn2.modeler.core.model.ModelDecorator;
import org.eclipse.bpmn2.modeler.core.runtime.CustomTaskDescriptor;
import org.eclipse.bpmn2.modeler.core.runtime.TargetRuntime;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import bpmnforcpsextension.MyModel.MustHappenAtAnInfiniteTime;



public class MustHappenAtAnInfiniteTimePropertyTab extends ExtendedPropertiesAdapter<MustHappenAtAnInfiniteTime> {

	public MustHappenAtAnInfiniteTimePropertyTab (AdapterFactory adapterFactory, MustHappenAtAnInfiniteTime object) {
		super(adapterFactory, object);
		
		setObjectDescriptor(new ObjectDescriptor<MustHappenAtAnInfiniteTime> (this, object) {
			public String getName() {
				return object.getName();
			}
		});
	}

}
