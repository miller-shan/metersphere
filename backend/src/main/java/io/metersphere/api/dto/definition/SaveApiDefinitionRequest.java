package io.metersphere.api.dto.definition;

import io.metersphere.api.dto.definition.request.MsTestElement;
import io.metersphere.api.dto.definition.response.Response;
import io.metersphere.base.domain.Schedule;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class SaveApiDefinitionRequest {

    private String id;

    private String reportId;

    private String projectId;

    private String name;

    private String path;

    private String protocol;

    private String moduleId;

    private String status;

    private String description;

    private String modulePath;

    private String method;
    
    private MsTestElement request;

    private Response response;

    private String environmentId;

    private String userId;

    private Schedule schedule;

    private String triggerMode;

    private List<String> bodyUploadIds;

    private List<String> tags = new ArrayList<>();
}
