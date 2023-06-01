package bpmnforcpsextension;

import org.eclipse.bpmn2.Activity;
import org.eclipse.bpmn2.modeler.core.adapters.ExtendedPropertiesAdapter;
import org.eclipse.bpmn2.modeler.core.adapters.ObjectDescriptor;
import org.eclipse.emf.common.notify.AdapterFactory;

import bpmnforcpsextension.MyModel.Duration;
import bpmnforcpsextension.MyModel.Timer_Type;
public class DurationPropertySection extends ExtendedPropertiesAdapter<Duration> {

	public DurationPropertySection (AdapterFactory adapterFactory, Duration object) {
		super(adapterFactory, object);
		
		setObjectDescriptor(new ObjectDescriptor<Duration> (this, object) {
			
			public String getName() {
				return object.getName();
			}
			/*public Activity getTraget() {
				return object.getTarget();
			}
			public String getMinTimeDuration() {
				return object.getMin_time_duration();
			}
			public String getMaxTimeDuration() {
				return object.getMax_time_duration();
			}
			public Timer_Type getTimeType() {
				return object.getTime_Type();
			}*/
		});
	}

}