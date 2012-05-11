
package com.emailvision.apibatchmember.service.api;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.emailvision.apibatchmember.service.api package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetBadFileResponse_QNAME = new QName("http://api.service.apibatchmember.emailvision.com/", "getBadFileResponse");
    private final static QName _CloseApiConnection_QNAME = new QName("http://api.service.apibatchmember.emailvision.com/", "closeApiConnection");
    private final static QName _GetLogFile_QNAME = new QName("http://api.service.apibatchmember.emailvision.com/", "getLogFile");
    private final static QName _MergeUpload_QNAME = new QName("http://api.service.apibatchmember.emailvision.com/", "mergeUpload");
    private final static QName _GetLastUploadResponse_QNAME = new QName("http://api.service.apibatchmember.emailvision.com/", "getLastUploadResponse");
    private final static QName _UploadFileMerge_QNAME = new QName("http://api.service.apibatchmember.emailvision.com/", "uploadFileMerge");
    private final static QName _Mapping_QNAME = new QName("http://api.service.apibatchmember.emailvision.com/", "mapping");
    private final static QName _OpenPartnerConnectionResponse_QNAME = new QName("http://api.service.apibatchmember.emailvision.com/", "openPartnerConnectionResponse");
    private final static QName _CloseApiConnectionResponse_QNAME = new QName("http://api.service.apibatchmember.emailvision.com/", "closeApiConnectionResponse");
    private final static QName _GetLogFileResponse_QNAME = new QName("http://api.service.apibatchmember.emailvision.com/", "getLogFileResponse");
    private final static QName _UploadFileInsert_QNAME = new QName("http://api.service.apibatchmember.emailvision.com/", "uploadFileInsert");
    private final static QName _UploadFileMergeResponse_QNAME = new QName("http://api.service.apibatchmember.emailvision.com/", "uploadFileMergeResponse");
    private final static QName _UploadFileInsertResponse_QNAME = new QName("http://api.service.apibatchmember.emailvision.com/", "uploadFileInsertResponse");
    private final static QName _GetLastUpload_QNAME = new QName("http://api.service.apibatchmember.emailvision.com/", "getLastUpload");
    private final static QName _OpenApiConnection_QNAME = new QName("http://api.service.apibatchmember.emailvision.com/", "openApiConnection");
    private final static QName _UploadInfo_QNAME = new QName("http://api.service.apibatchmember.emailvision.com/", "uploadInfo");
    private final static QName _InsertUpload_QNAME = new QName("http://api.service.apibatchmember.emailvision.com/", "insertUpload");
    private final static QName _GetBadFile_QNAME = new QName("http://api.service.apibatchmember.emailvision.com/", "getBadFile");
    private final static QName _UploadStatus_QNAME = new QName("http://api.service.apibatchmember.emailvision.com/", "uploadStatus");
    private final static QName _GetUploadStatus_QNAME = new QName("http://api.service.apibatchmember.emailvision.com/", "getUploadStatus");
    private final static QName _ExceptionDetails_QNAME = new QName("http://api.service.apibatchmember.emailvision.com/", "exceptionDetails");
    private final static QName _Dedup_QNAME = new QName("http://api.service.apibatchmember.emailvision.com/", "dedup");
    private final static QName _OpenApiConnectionResponse_QNAME = new QName("http://api.service.apibatchmember.emailvision.com/", "openApiConnectionResponse");
    private final static QName _PartnerConnectionResult_QNAME = new QName("http://api.service.apibatchmember.emailvision.com/", "partnerConnectionResult");
    private final static QName _OpenPartnerConnection_QNAME = new QName("http://api.service.apibatchmember.emailvision.com/", "openPartnerConnection");
    private final static QName _GetUploadStatusResponse_QNAME = new QName("http://api.service.apibatchmember.emailvision.com/", "getUploadStatusResponse");
    private final static QName _Column_QNAME = new QName("http://api.service.apibatchmember.emailvision.com/", "column");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.emailvision.apibatchmember.service.api
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Column }
     * 
     */
    public Column createColumn() {
        return new Column();
    }

    /**
     * Create an instance of {@link GetUploadStatus }
     * 
     */
    public GetUploadStatus createGetUploadStatus() {
        return new GetUploadStatus();
    }

    /**
     * Create an instance of {@link CloseApiConnectionResponse }
     * 
     */
    public CloseApiConnectionResponse createCloseApiConnectionResponse() {
        return new CloseApiConnectionResponse();
    }

    /**
     * Create an instance of {@link OpenApiConnection }
     * 
     */
    public OpenApiConnection createOpenApiConnection() {
        return new OpenApiConnection();
    }

    /**
     * Create an instance of {@link GetLogFile }
     * 
     */
    public GetLogFile createGetLogFile() {
        return new GetLogFile();
    }

    /**
     * Create an instance of {@link GetLastUploadResponse }
     * 
     */
    public GetLastUploadResponse createGetLastUploadResponse() {
        return new GetLastUploadResponse();
    }

    /**
     * Create an instance of {@link GetLogFileResponse }
     * 
     */
    public GetLogFileResponse createGetLogFileResponse() {
        return new GetLogFileResponse();
    }

    /**
     * Create an instance of {@link GetBadFileResponse }
     * 
     */
    public GetBadFileResponse createGetBadFileResponse() {
        return new GetBadFileResponse();
    }

    /**
     * Create an instance of {@link BatchMemberExceptionDetails }
     * 
     */
    public BatchMemberExceptionDetails createBatchMemberExceptionDetails() {
        return new BatchMemberExceptionDetails();
    }

    /**
     * Create an instance of {@link UploadStatus }
     * 
     */
    public UploadStatus createUploadStatus() {
        return new UploadStatus();
    }

    /**
     * Create an instance of {@link UploadFileInsert }
     * 
     */
    public UploadFileInsert createUploadFileInsert() {
        return new UploadFileInsert();
    }

    /**
     * Create an instance of {@link ApiPartnerConnectionResult }
     * 
     */
    public ApiPartnerConnectionResult createApiPartnerConnectionResult() {
        return new ApiPartnerConnectionResult();
    }

    /**
     * Create an instance of {@link GetLastUpload }
     * 
     */
    public GetLastUpload createGetLastUpload() {
        return new GetLastUpload();
    }

    /**
     * Create an instance of {@link OpenPartnerConnection }
     * 
     */
    public OpenPartnerConnection createOpenPartnerConnection() {
        return new OpenPartnerConnection();
    }

    /**
     * Create an instance of {@link Dedup }
     * 
     */
    public Dedup createDedup() {
        return new Dedup();
    }

    /**
     * Create an instance of {@link UploadFileMergeResponse }
     * 
     */
    public UploadFileMergeResponse createUploadFileMergeResponse() {
        return new UploadFileMergeResponse();
    }

    /**
     * Create an instance of {@link Mapping }
     * 
     */
    public Mapping createMapping() {
        return new Mapping();
    }

    /**
     * Create an instance of {@link CloseApiConnection }
     * 
     */
    public CloseApiConnection createCloseApiConnection() {
        return new CloseApiConnection();
    }

    /**
     * Create an instance of {@link InsertUpload }
     * 
     */
    public InsertUpload createInsertUpload() {
        return new InsertUpload();
    }

    /**
     * Create an instance of {@link ConnectionExceptionDetails }
     * 
     */
    public ConnectionExceptionDetails createConnectionExceptionDetails() {
        return new ConnectionExceptionDetails();
    }

    /**
     * Create an instance of {@link UploadFileInsertResponse }
     * 
     */
    public UploadFileInsertResponse createUploadFileInsertResponse() {
        return new UploadFileInsertResponse();
    }

    /**
     * Create an instance of {@link OpenPartnerConnectionResponse }
     * 
     */
    public OpenPartnerConnectionResponse createOpenPartnerConnectionResponse() {
        return new OpenPartnerConnectionResponse();
    }

    /**
     * Create an instance of {@link GetUploadStatusResponse }
     * 
     */
    public GetUploadStatusResponse createGetUploadStatusResponse() {
        return new GetUploadStatusResponse();
    }

    /**
     * Create an instance of {@link MergeUpload }
     * 
     */
    public MergeUpload createMergeUpload() {
        return new MergeUpload();
    }

    /**
     * Create an instance of {@link UploadInfo }
     * 
     */
    public UploadInfo createUploadInfo() {
        return new UploadInfo();
    }

    /**
     * Create an instance of {@link OpenApiConnectionResponse }
     * 
     */
    public OpenApiConnectionResponse createOpenApiConnectionResponse() {
        return new OpenApiConnectionResponse();
    }

    /**
     * Create an instance of {@link GetBadFile }
     * 
     */
    public GetBadFile createGetBadFile() {
        return new GetBadFile();
    }

    /**
     * Create an instance of {@link UploadFileMerge }
     * 
     */
    public UploadFileMerge createUploadFileMerge() {
        return new UploadFileMerge();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBadFileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apibatchmember.emailvision.com/", name = "getBadFileResponse")
    public JAXBElement<GetBadFileResponse> createGetBadFileResponse(GetBadFileResponse value) {
        return new JAXBElement<GetBadFileResponse>(_GetBadFileResponse_QNAME, GetBadFileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CloseApiConnection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apibatchmember.emailvision.com/", name = "closeApiConnection")
    public JAXBElement<CloseApiConnection> createCloseApiConnection(CloseApiConnection value) {
        return new JAXBElement<CloseApiConnection>(_CloseApiConnection_QNAME, CloseApiConnection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLogFile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apibatchmember.emailvision.com/", name = "getLogFile")
    public JAXBElement<GetLogFile> createGetLogFile(GetLogFile value) {
        return new JAXBElement<GetLogFile>(_GetLogFile_QNAME, GetLogFile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MergeUpload }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apibatchmember.emailvision.com/", name = "mergeUpload")
    public JAXBElement<MergeUpload> createMergeUpload(MergeUpload value) {
        return new JAXBElement<MergeUpload>(_MergeUpload_QNAME, MergeUpload.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLastUploadResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apibatchmember.emailvision.com/", name = "getLastUploadResponse")
    public JAXBElement<GetLastUploadResponse> createGetLastUploadResponse(GetLastUploadResponse value) {
        return new JAXBElement<GetLastUploadResponse>(_GetLastUploadResponse_QNAME, GetLastUploadResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadFileMerge }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apibatchmember.emailvision.com/", name = "uploadFileMerge")
    public JAXBElement<UploadFileMerge> createUploadFileMerge(UploadFileMerge value) {
        return new JAXBElement<UploadFileMerge>(_UploadFileMerge_QNAME, UploadFileMerge.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Mapping }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apibatchmember.emailvision.com/", name = "mapping")
    public JAXBElement<Mapping> createMapping(Mapping value) {
        return new JAXBElement<Mapping>(_Mapping_QNAME, Mapping.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpenPartnerConnectionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apibatchmember.emailvision.com/", name = "openPartnerConnectionResponse")
    public JAXBElement<OpenPartnerConnectionResponse> createOpenPartnerConnectionResponse(OpenPartnerConnectionResponse value) {
        return new JAXBElement<OpenPartnerConnectionResponse>(_OpenPartnerConnectionResponse_QNAME, OpenPartnerConnectionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CloseApiConnectionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apibatchmember.emailvision.com/", name = "closeApiConnectionResponse")
    public JAXBElement<CloseApiConnectionResponse> createCloseApiConnectionResponse(CloseApiConnectionResponse value) {
        return new JAXBElement<CloseApiConnectionResponse>(_CloseApiConnectionResponse_QNAME, CloseApiConnectionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLogFileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apibatchmember.emailvision.com/", name = "getLogFileResponse")
    public JAXBElement<GetLogFileResponse> createGetLogFileResponse(GetLogFileResponse value) {
        return new JAXBElement<GetLogFileResponse>(_GetLogFileResponse_QNAME, GetLogFileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadFileInsert }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apibatchmember.emailvision.com/", name = "uploadFileInsert")
    public JAXBElement<UploadFileInsert> createUploadFileInsert(UploadFileInsert value) {
        return new JAXBElement<UploadFileInsert>(_UploadFileInsert_QNAME, UploadFileInsert.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadFileMergeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apibatchmember.emailvision.com/", name = "uploadFileMergeResponse")
    public JAXBElement<UploadFileMergeResponse> createUploadFileMergeResponse(UploadFileMergeResponse value) {
        return new JAXBElement<UploadFileMergeResponse>(_UploadFileMergeResponse_QNAME, UploadFileMergeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadFileInsertResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apibatchmember.emailvision.com/", name = "uploadFileInsertResponse")
    public JAXBElement<UploadFileInsertResponse> createUploadFileInsertResponse(UploadFileInsertResponse value) {
        return new JAXBElement<UploadFileInsertResponse>(_UploadFileInsertResponse_QNAME, UploadFileInsertResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLastUpload }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apibatchmember.emailvision.com/", name = "getLastUpload")
    public JAXBElement<GetLastUpload> createGetLastUpload(GetLastUpload value) {
        return new JAXBElement<GetLastUpload>(_GetLastUpload_QNAME, GetLastUpload.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpenApiConnection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apibatchmember.emailvision.com/", name = "openApiConnection")
    public JAXBElement<OpenApiConnection> createOpenApiConnection(OpenApiConnection value) {
        return new JAXBElement<OpenApiConnection>(_OpenApiConnection_QNAME, OpenApiConnection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apibatchmember.emailvision.com/", name = "uploadInfo")
    public JAXBElement<UploadInfo> createUploadInfo(UploadInfo value) {
        return new JAXBElement<UploadInfo>(_UploadInfo_QNAME, UploadInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertUpload }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apibatchmember.emailvision.com/", name = "insertUpload")
    public JAXBElement<InsertUpload> createInsertUpload(InsertUpload value) {
        return new JAXBElement<InsertUpload>(_InsertUpload_QNAME, InsertUpload.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBadFile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apibatchmember.emailvision.com/", name = "getBadFile")
    public JAXBElement<GetBadFile> createGetBadFile(GetBadFile value) {
        return new JAXBElement<GetBadFile>(_GetBadFile_QNAME, GetBadFile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apibatchmember.emailvision.com/", name = "uploadStatus")
    public JAXBElement<UploadStatus> createUploadStatus(UploadStatus value) {
        return new JAXBElement<UploadStatus>(_UploadStatus_QNAME, UploadStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUploadStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apibatchmember.emailvision.com/", name = "getUploadStatus")
    public JAXBElement<GetUploadStatus> createGetUploadStatus(GetUploadStatus value) {
        return new JAXBElement<GetUploadStatus>(_GetUploadStatus_QNAME, GetUploadStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConnectionExceptionDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apibatchmember.emailvision.com/", name = "exceptionDetails")
    public JAXBElement<ConnectionExceptionDetails> createExceptionDetails(ConnectionExceptionDetails value) {
        return new JAXBElement<ConnectionExceptionDetails>(_ExceptionDetails_QNAME, ConnectionExceptionDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Dedup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apibatchmember.emailvision.com/", name = "dedup")
    public JAXBElement<Dedup> createDedup(Dedup value) {
        return new JAXBElement<Dedup>(_Dedup_QNAME, Dedup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpenApiConnectionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apibatchmember.emailvision.com/", name = "openApiConnectionResponse")
    public JAXBElement<OpenApiConnectionResponse> createOpenApiConnectionResponse(OpenApiConnectionResponse value) {
        return new JAXBElement<OpenApiConnectionResponse>(_OpenApiConnectionResponse_QNAME, OpenApiConnectionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApiPartnerConnectionResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apibatchmember.emailvision.com/", name = "partnerConnectionResult")
    public JAXBElement<ApiPartnerConnectionResult> createPartnerConnectionResult(ApiPartnerConnectionResult value) {
        return new JAXBElement<ApiPartnerConnectionResult>(_PartnerConnectionResult_QNAME, ApiPartnerConnectionResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpenPartnerConnection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apibatchmember.emailvision.com/", name = "openPartnerConnection")
    public JAXBElement<OpenPartnerConnection> createOpenPartnerConnection(OpenPartnerConnection value) {
        return new JAXBElement<OpenPartnerConnection>(_OpenPartnerConnection_QNAME, OpenPartnerConnection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUploadStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apibatchmember.emailvision.com/", name = "getUploadStatusResponse")
    public JAXBElement<GetUploadStatusResponse> createGetUploadStatusResponse(GetUploadStatusResponse value) {
        return new JAXBElement<GetUploadStatusResponse>(_GetUploadStatusResponse_QNAME, GetUploadStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Column }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apibatchmember.emailvision.com/", name = "column")
    public JAXBElement<Column> createColumn(Column value) {
        return new JAXBElement<Column>(_Column_QNAME, Column.class, null, value);
    }

}
