package com.alibaba.dubbo.common.serialize;
import com.alibaba.dubbo.common.extension.ExtensionLoader;

import java.io.IOException;

public class Serialization$Adpative implements com.alibaba.dubbo.common.serialize.Serialization {
    public java.lang.String getContentType() {throw new UnsupportedOperationException("method public abstract java.lang.String com.alibaba.dubbo.common.serialize.Serialization.getContentType() of interface com.alibaba.dubbo.common.serialize.Serialization is not adaptive method!");
    }
    public com.alibaba.dubbo.common.serialize.ObjectOutput serialize(com.alibaba.dubbo.common.URL arg0, java.io.OutputStream arg1) throws IOException {
        if (arg0 == null) throw new IllegalArgumentException("url == null");
        com.alibaba.dubbo.common.URL url = arg0;
        String extName = url.getParameter("serialization", "hessian2");
        if(extName == null) throw new IllegalStateException("Fail to get extension(com.alibaba.dubbo.common.serialize.Serialization) name from url(" + url.toString() + ") use keys([serialization])");
        com.alibaba.dubbo.common.serialize.Serialization extension = (com.alibaba.dubbo.common.serialize.Serialization)ExtensionLoader.getExtensionLoader(com.alibaba.dubbo.common.serialize.Serialization.class).getExtension(extName);
        return extension.serialize(arg0, arg1);
    }
    public com.alibaba.dubbo.common.serialize.ObjectInput deserialize(com.alibaba.dubbo.common.URL arg0, java.io.InputStream arg1) throws IOException {
        if (arg0 == null) throw new IllegalArgumentException("url == null");
        com.alibaba.dubbo.common.URL url = arg0;
        String extName = url.getParameter("serialization", "hessian2");
        if(extName == null) throw new IllegalStateException("Fail to get extension(com.alibaba.dubbo.common.serialize.Serialization) name from url(" + url.toString() + ") use keys([serialization])");
        com.alibaba.dubbo.common.serialize.Serialization extension = (com.alibaba.dubbo.common.serialize.Serialization)ExtensionLoader.getExtensionLoader(com.alibaba.dubbo.common.serialize.Serialization.class).getExtension(extName);
        return extension.deserialize(arg0, arg1);
    }
    public byte getContentTypeId() {throw new UnsupportedOperationException("method public abstract byte com.alibaba.dubbo.common.serialize.Serialization.getContentTypeId() of interface com.alibaba.dubbo.common.serialize.Serialization is not adaptive method!");
    }
}