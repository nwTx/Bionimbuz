package br.unb.cic.bionimbus.rest.request;

import javax.ws.rs.FormParam;
import javax.ws.rs.core.MediaType;
import org.jboss.resteasy.annotations.providers.multipart.PartType;
import br.unb.cic.bionimbus.rest.model.UploadedFileInfo;

/**
 * Defines an upload request to be used in a REST request
 * @author Vinicius
 */
public class UploadRequest implements RequestInfo {

    private byte[] data;
    private UploadedFileInfo fileInfo;

    public UploadRequest() {
    }

    public byte[] getData() {
        return data;
    }

    public UploadedFileInfo getFileInfo() {
        return fileInfo;
    }

    @FormParam("file")
    @PartType(MediaType.APPLICATION_OCTET_STREAM)
    public void setData(byte[] data) {
        this.data = data;
    }

    @FormParam("file_info")
    @PartType(MediaType.APPLICATION_JSON)
    public void setFileInfo(UploadedFileInfo fileInfo) {
        this.fileInfo = fileInfo;
    }

}
