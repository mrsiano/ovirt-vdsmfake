package org.ovirt.vdsmfake.rpc.json.commands;

import java.util.Map;

import org.codehaus.jackson.JsonNode;

@SuppressWarnings("rawtypes")
public class GetCapabilitiesCommand extends JsonCommand {

    @Override
    public String fieldName() {
        return "info";
    }

    @Override
    protected Map activateApi(JsonNode params) {
        return api.getVdsCapabilities();
    }
}
