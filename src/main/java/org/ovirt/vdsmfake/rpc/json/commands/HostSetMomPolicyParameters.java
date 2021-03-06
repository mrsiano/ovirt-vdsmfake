package org.ovirt.vdsmfake.rpc.json.commands;

import java.io.IOException;
import java.util.Map;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.ovirt.vdsm.jsonrpc.client.ResponseBuilder;
import org.ovirt.vdsmfake.service.ResultCodes;

@SuppressWarnings({ "rawtypes" })
public class HostSetMomPolicyParameters extends JsonCommand {

    @Override
    public ResponseBuilder run(JsonNode params, ResponseBuilder builder) {
        return builder.withResult(ResultCodes.OK.map());
    }

    @Override
    public String fieldName() {
        return null;
    }

    @Override
    protected Map activateApi(JsonNode params) throws JsonParseException, JsonMappingException, IOException {
        return null;
    }

}
