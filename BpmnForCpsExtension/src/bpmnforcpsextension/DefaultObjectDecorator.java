package bpmnforcpsextension;


import org.eclipse.bpmn2.modeler.core.runtime.IObjectDecorator;
import org.eclipse.bpmn2.modeler.ui.diagram.Bpmn2FeatureMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

/**
 *
 */
public class DefaultObjectDecorator implements IObjectDecorator {

	/**
	 * 
	 */
	public DefaultObjectDecorator() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see org.eclipse.bpmn2.modeler.core.runtime.IObjectDecorator#canApply(org.eclipse.emf.ecore.resource.Resource, org.eclipse.emf.ecore.EObject)
	 */
	@Override
	public boolean canApply(String id, Resource resource, EObject object) {
		return Bpmn2FeatureMap.ALL_SHAPES.contains(object.eClass().getInstanceClass());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.bpmn2.modeler.core.runtime.IObjectDecorator#apply(org.eclipse.emf.ecore.resource.Resource, java.lang.Object)
	 */
	@Override
	public boolean apply(String id, Resource resource, Object object) {
		return true;
	}
}