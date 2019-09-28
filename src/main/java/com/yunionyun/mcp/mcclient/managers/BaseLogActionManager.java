package com.yunionyun.mcp.mcclient.managers;

import com.yunionyun.mcp.mcclient.EndpointType;

public class BaseLogActionManager extends ResourceManager
{

    public BaseLogActionManager(String keyword, String keywordPlural, String[] columns, String[] adminColumns)
    {
        super("log", EndpointType.InternalURL, "v1", columns, adminColumns, keyword, keywordPlural, null);
    }
    public BaseLogActionManager(String keyword, String keywordPlural, EndpointType endpointType, String[] columns, String[] adminColumns){
        super("log",endpointType, "v1", columns, adminColumns, keyword, keywordPlural, null);
    }
}
