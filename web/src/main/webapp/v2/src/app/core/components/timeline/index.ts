
import { NgModule } from '@angular/core';

import { SharedModule } from 'app/shared';
import { TimelineComponent } from './timeline.component';
import { AgentInspectorTimelineContainerComponent } from './agent-inspector-timeline-container.component';
import { ApplicationInspectorTimelineContainerComponent } from './application-inspector-timeline-container.component';
import { AgentTimelineDataService } from './agent-timeline-data.service';

@NgModule({
    declarations: [
        TimelineComponent,
        AgentInspectorTimelineContainerComponent,
        ApplicationInspectorTimelineContainerComponent
    ],
    imports: [
        SharedModule
    ],
    exports: [
        AgentInspectorTimelineContainerComponent,
        ApplicationInspectorTimelineContainerComponent
    ],
    providers: [
        AgentTimelineDataService
    ]
})
export class TimelineModule { }
