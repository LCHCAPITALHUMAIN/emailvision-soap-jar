
package com.emailvision.apiccmd.service.api;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.emailvision.apiccmd.service.api package. 
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

    private final static QName _CreateAndAddPersonalisedBannerLinkResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "createAndAddPersonalisedBannerLinkResponse");
    private final static QName _SegmentationUpdateStringDemographicCriteriaByObjResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "segmentationUpdateStringDemographicCriteriaByObjResponse");
    private final static QName _CreateBanner_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "createBanner");
    private final static QName _GetCampaignReport_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "getCampaignReport");
    private final static QName _CreateMailingListByObj_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "createMailingListByObj");
    private final static QName _SegmentationAddCampaignTrackableLinkCriteriaByObj_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "segmentationAddCampaignTrackableLinkCriteriaByObj");
    private final static QName _GetMailingListsByPeriod_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "getMailingListsByPeriod");
    private final static QName _CreateUnsubscribeUrlResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "createUnsubscribeUrlResponse");
    private final static QName _GetLastEmailMessagesResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "getLastEmailMessagesResponse");
    private final static QName _UpdateMessageByObjResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "updateMessageByObjResponse");
    private final static QName _CreatePersonalisedUrl_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "createPersonalisedUrl");
    private final static QName _PersoFragCriteria_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "persoFragCriteria");
    private final static QName _CreatePersonalisedBannerLink_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "createPersonalisedBannerLink");
    private final static QName _TestEmailMessageByGroup_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "testEmailMessageByGroup");
    private final static QName _TestEmailMessageByMember_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "testEmailMessageByMember");
    private final static QName _GetTestMembers_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "getTestMembers");
    private final static QName _GetSmsMessagesByFieldResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "getSmsMessagesByFieldResponse");
    private final static QName _SegmentationAddCampaignActionCriteriaByObjResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "segmentationAddCampaignActionCriteriaByObjResponse");
    private final static QName _DateDemographicCriteria_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "dateDemographicCriteria");
    private final static QName _CreateUpdateBannerLinkResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "createUpdateBannerLinkResponse");
    private final static QName _RemoveSegmentResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "removeSegmentResponse");
    private final static QName _SegmentationDeleteCriteria_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "segmentationDeleteCriteria");
    private final static QName _SortOption_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "sortOption");
    private final static QName _CreateMailingListResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "createMailingListResponse");
    private final static QName _AddSegment_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "addSegment");
    private final static QName _CreateSmsMessageByObj_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "createSmsMessageByObj");
    private final static QName _TestCampaignByGroup_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "testCampaignByGroup");
    private final static QName _SegmentationGetPersoFragListResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "segmentationGetPersoFragListResponse");
    private final static QName _DeleteCampaign_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "deleteCampaign");
    private final static QName _GetAllUnusedBannerTrackedLinks_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "getAllUnusedBannerTrackedLinks");
    private final static QName _GetEmailMessagePreview_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "getEmailMessagePreview");
    private final static QName _DeleteTestGroupResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "deleteTestGroupResponse");
    private final static QName _DeleteMailingListResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "deleteMailingListResponse");
    private final static QName _GetSegmentSummaryList_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "getSegmentSummaryList");
    private final static QName _Message_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "message");
    private final static QName _CreateAndAddActionUrlResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "createAndAddActionUrlResponse");
    private final static QName _GetCampaignSnapshotResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "getCampaignSnapshotResponse");
    private final static QName _CloneMessage_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "cloneMessage");
    private final static QName _CloneBannerResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "cloneBannerResponse");
    private final static QName _GetSegmentSummaryListResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "getSegmentSummaryListResponse");
    private final static QName _CreateMirrorUrl_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "createMirrorUrl");
    private final static QName _GetBannerPreview_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "getBannerPreview");
    private final static QName _GetDefaultSenderResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "getDefaultSenderResponse");
    private final static QName _GetMessage_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "getMessage");
    private final static QName _CreateMailingList_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "createMailingList");
    private final static QName _OpenApiConnection_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "openApiConnection");
    private final static QName _MailingListDistinctCount_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "mailingListDistinctCount");
    private final static QName _GetLastEmailMessages_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "getLastEmailMessages");
    private final static QName _SegmentationUpdateSerieTrackableLinkCriteriaByObjResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "segmentationUpdateSerieTrackableLinkCriteriaByObjResponse");
    private final static QName _GetCampaignSummaryList_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "getCampaignSummaryList");
    private final static QName _CreateUnsubscribeUrl_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "createUnsubscribeUrl");
    private final static QName _Search_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "search");
    private final static QName _GetMessagesByPeriodResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "getMessagesByPeriodResponse");
    private final static QName _UntrackAllLinksResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "untrackAllLinksResponse");
    private final static QName _NumericDemographicCriteria_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "numericDemographicCriteria");
    private final static QName _CreateBannerResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "createBannerResponse");
    private final static QName _GetAllUnusedBannerTrackedLinksResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "getAllUnusedBannerTrackedLinksResponse");
    private final static QName _TestCampaignByGroupResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "testCampaignByGroupResponse");
    private final static QName _GetCampaignsByField_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "getCampaignsByField");
    private final static QName _MailingListDistinctCountResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "mailingListDistinctCountResponse");
    private final static QName _GetMailingList_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "getMailingList");
    private final static QName _SegmentationGetSegmentCriterias_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "segmentationGetSegmentCriterias");
    private final static QName _SegmentationCreateSegment_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "segmentationCreateSegment");
    private final static QName _CreateMirrorBannerLink_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "createMirrorBannerLink");
    private final static QName _CreateBasicSegmentResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "createBasicSegmentResponse");
    private final static QName _SegmentationDeleteCriteriaResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "segmentationDeleteCriteriaResponse");
    private final static QName _RemoveTestMember_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "removeTestMember");
    private final static QName _GetMessageResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "getMessageResponse");
    private final static QName _SegmentationUpdateNumericDemographicCriteriaByObjResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "segmentationUpdateNumericDemographicCriteriaByObjResponse");
    private final static QName _PauseCampaignResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "pauseCampaignResponse");
    private final static QName _Testgroup_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "testgroup");
    private final static QName _SegmentationAddDateDemographicCriteriaByObjResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "segmentationAddDateDemographicCriteriaByObjResponse");
    private final static QName _GetLastSegments_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "getLastSegments");
    private final static QName _UpdateMailingListByObjResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "updateMailingListByObjResponse");
    private final static QName _CreateAndAddPersonalisedUrl_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "createAndAddPersonalisedUrl");
    private final static QName _CloneMessageResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "cloneMessageResponse");
    private final static QName _GetClientTestGroups_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "getClientTestGroups");
    private final static QName _DeleteTestMember_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "deleteTestMember");
    private final static QName _GetUrlByOrderResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "getUrlByOrderResponse");
    private final static QName _UpdateSegmentByObj_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "updateSegmentByObj");
    private final static QName _GetAllTrackedLinks_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "getAllTrackedLinks");
    private final static QName _UpdateSegment_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "updateSegment");
    private final static QName _SegmentationAddCampaignActionCriteriaByObj_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "segmentationAddCampaignActionCriteriaByObj");
    private final static QName _PostCampaignResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "postCampaignResponse");
    private final static QName _MailingList_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "mailingList");
    private final static QName _SegmentationAddSocialNetworkCriteriaByObjResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "segmentationAddSocialNetworkCriteriaByObjResponse");
    private final static QName _GetCampaignStatusResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "getCampaignStatusResponse");
    private final static QName _GetMessagesByPeriod_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "getMessagesByPeriod");
    private final static QName _CreateAndAddUpdateBannerLinkResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "createAndAddUpdateBannerLinkResponse");
    private final static QName _SegmentationAddDataMartCriteriaByObj_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "segmentationAddDataMartCriteriaByObj");
    private final static QName _ExceptionDetails_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "exceptionDetails");
    private final static QName _GetCampaignResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "getCampaignResponse");
    private final static QName _UnpauseCampaign_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "unpauseCampaign");
    private final static QName _SegmentationAddSerieActionCriteriaByObjResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "segmentationAddSerieActionCriteriaByObjResponse");
    private final static QName _CloneMailingListResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "cloneMailingListResponse");
    private final static QName _SegmentationDistinctCountResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "segmentationDistinctCountResponse");
    private final static QName _SegmentationAddNumericDemographicCriteriaByObj_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "segmentationAddNumericDemographicCriteriaByObj");
    private final static QName _CreateBasicSegment_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "createBasicSegment");
    private final static QName _CloneMailingList_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "cloneMailingList");
    private final static QName _GetCampaign_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "getCampaign");
    private final static QName _Segmentation_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "segmentation");
    private final static QName _CreateSQLSegmentByObjResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "createSQLSegmentByObjResponse");
    private final static QName _TrackBannerLinkByPositionResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "trackBannerLinkByPositionResponse");
    private final static QName _CreateAndAddUpdateUrl_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "createAndAddUpdateUrl");
    private final static QName _Segment_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "segment");
    private final static QName _CreateCampaignByObj_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "createCampaignByObj");
    private final static QName _ActionCriteria_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "actionCriteria");
    private final static QName _GetMailingListsByPeriodResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "getMailingListsByPeriodResponse");
    private final static QName _UpdateSegmentByObjResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "updateSegmentByObjResponse");
    private final static QName _GetNotValidatedSendersResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "getNotValidatedSendersResponse");
    private final static QName _CreateAndAddPersonalisedBannerLink_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "createAndAddPersonalisedBannerLink");
    private final static QName _GetCampaignStatus_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "getCampaignStatus");
    private final static QName _GetCampaignsByStatus_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "getCampaignsByStatus");
    private final static QName _SegmentationUpdateStringDemographicCriteriaByObj_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "segmentationUpdateStringDemographicCriteriaByObj");
    private final static QName _IsHtmlValidResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "isHtmlValidResponse");
    private final static QName _SegmentationUpdateSocialNetworkCriteriaByObjResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "segmentationUpdateSocialNetworkCriteriaByObjResponse");
    private final static QName _SegmentationUpdateDataMartCriteriaByObjResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "segmentationUpdateDataMartCriteriaByObjResponse");
    private final static QName _CreateCampaign_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "createCampaign");
    private final static QName _GetLastMailingLists_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "getLastMailingLists");
    private final static QName _UntrackBannerLinkByOrder_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "untrackBannerLinkByOrder");
    private final static QName _SegmentationUpdateNumericDemographicCriteriaByObj_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "segmentationUpdateNumericDemographicCriteriaByObj");
    private final static QName _CreateSQLSegment_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "createSQLSegment");
    private final static QName _Apiurl_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "apiurl");
    private final static QName _CreateTestMember_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "createTestMember");
    private final static QName _GetCampaignsByPeriodResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "getCampaignsByPeriodResponse");
    private final static QName _TrackAllBannerLinks_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "trackAllBannerLinks");
    private final static QName _CreatePersonalisedBannerLinkResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "createPersonalisedBannerLinkResponse");
    private final static QName _DistinctMembersCount_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "distinctMembersCount");
    private final static QName _GetSegmentsByField_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "getSegmentsByField");
    private final static QName _List_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "list");
    private final static QName _GetLastCampaigns_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "getLastCampaigns");
    private final static QName _CreateAndAddMirrorBannerLink_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "createAndAddMirrorBannerLink");
    private final static QName _MembersCount_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "membersCount");
    private final static QName _CreateMailingListByObjResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "createMailingListByObjResponse");
    private final static QName _GetTestGroup_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "getTestGroup");
    private final static QName _CreateMirrorUrlResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "createMirrorUrlResponse");
    private final static QName _UpdateTestGroupByObjResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "updateTestGroupByObjResponse");
    private final static QName _DeleteMessage_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "deleteMessage");
    private final static QName _UpdateUrlByField_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "updateUrlByField");
    private final static QName _TrackAllLinksResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "trackAllLinksResponse");
    private final static QName _ListOptions_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "listOptions");
    private final static QName _CreateTestGroup_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "createTestGroup");
    private final static QName _SegmentationUpdateDateDemographicCriteriaByObjResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "segmentationUpdateDateDemographicCriteriaByObjResponse");
    private final static QName _CreateAndAddUnsubscribeBannerLinkResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "createAndAddUnsubscribeBannerLinkResponse");
    private final static QName _SegmentationUpdateCampaignTrackableLinkCriteriaByObjResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "segmentationUpdateCampaignTrackableLinkCriteriaByObjResponse");
    private final static QName _CreateSQLSegmentResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "createSQLSegmentResponse");
    private final static QName _UpdateBanner_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "updateBanner");
    private final static QName _SegmentationDistinctCount_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "segmentationDistinctCount");
    private final static QName _SegmentationUpdateSocialNetworkCriteriaByObj_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "segmentationUpdateSocialNetworkCriteriaByObj");
    private final static QName _PauseCampaign_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "pauseCampaign");
    private final static QName _DeleteMailingList_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "deleteMailingList");
    private final static QName _UpdateCampaign_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "updateCampaign");
    private final static QName _SegmentationUpdateRecencyCriteriaByObjResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "segmentationUpdateRecencyCriteriaByObjResponse");
    private final static QName _CreateSmsMessageResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "createSmsMessageResponse");
    private final static QName _GetMailingListResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "getMailingListResponse");
    private final static QName _CreateEmailMessageResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "createEmailMessageResponse");
    private final static QName _SegmentSummary_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "segmentSummary");
    private final static QName _CreateAndAddMirrorUrlResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "createAndAddMirrorUrlResponse");
    private final static QName _Banner_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "banner");
    private final static QName _DeleteTestMemberResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "deleteTestMemberResponse");
    private final static QName _UntrackLinkByOrder_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "untrackLinkByOrder");
    private final static QName _SegmentationAddNumericDemographicCriteriaByObjResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "segmentationAddNumericDemographicCriteriaByObjResponse");
    private final static QName _GetSegmentsByFieldResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "getSegmentsByFieldResponse");
    private final static QName _CreateSmsMessage_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "createSmsMessage");
    private final static QName _TestSmsMessage_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "testSmsMessage");
    private final static QName _SegmentationUpdateSegment_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "segmentationUpdateSegment");
    private final static QName _DeleteUrl_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "deleteUrl");
    private final static QName _CloneBanner_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "cloneBanner");
    private final static QName _SegmentationUpdateCampaignActionCriteriaByObjResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "segmentationUpdateCampaignActionCriteriaByObjResponse");
    private final static QName _CreateCampaignResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "createCampaignResponse");
    private final static QName _CreateAndAddMirrorBannerLinkResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "createAndAddMirrorBannerLinkResponse");
    private final static QName _Segments_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "segments");
    private final static QName _DeleteMessageResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "deleteMessageResponse");
    private final static QName _GetTestMember_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "getTestMember");
    private final static QName _DeleteBannerResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "deleteBannerResponse");
    private final static QName _DistinctMembersCountResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "distinctMembersCountResponse");
    private final static QName _BannerSummary_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "bannerSummary");
    private final static QName _UpdateSegmentResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "updateSegmentResponse");
    private final static QName _UpdateBannerByObjResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "updateBannerByObjResponse");
    private final static QName _CreateAndAddStandardUrl_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "createAndAddStandardUrl");
    private final static QName _GetSegment_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "getSegment");
    private final static QName _TrackLinkByPosition_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "trackLinkByPosition");
    private final static QName _CreateAndAddActionBannerLinkResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "createAndAddActionBannerLinkResponse");
    private final static QName _SegmentationAddRecencyCriteriaByObjResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "segmentationAddRecencyCriteriaByObjResponse");
    private final static QName _SegmentationAddSocialNetworkCriteriaByObj_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "segmentationAddSocialNetworkCriteriaByObj");
    private final static QName _UpdateTestGroupByObj_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "updateTestGroupByObj");
    private final static QName _UnpostCampaignResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "unpostCampaignResponse");
    private final static QName _GetClientTestGroupsResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "getClientTestGroupsResponse");
    private final static QName _Testmembers_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "testmembers");
    private final static QName _DataMartCriteria_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "dataMartCriteria");
    private final static QName _GetMessageSummaryListResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "getMessageSummaryListResponse");
    private final static QName _CcmdExceptionDetails_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails");
    private final static QName _CreatePersonalisedUrlResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "createPersonalisedUrlResponse");
    private final static QName _GetAllBannerTrackedLinks_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "getAllBannerTrackedLinks");
    private final static QName _RemoveSegment_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "removeSegment");
    private final static QName _SegmentationUpdateDataMartCriteriaByObj_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "segmentationUpdateDataMartCriteriaByObj");
    private final static QName _UpdateCampaignByObjResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "updateCampaignByObjResponse");
    private final static QName _GetAllTrackedLinksResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "getAllTrackedLinksResponse");
    private final static QName _GetEmailMessagesByFieldResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "getEmailMessagesByFieldResponse");
    private final static QName _GetAllTrackableLinksResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "getAllTrackableLinksResponse");
    private final static QName _DeleteBanner_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "deleteBanner");
    private final static QName _SegmentationAddSerieTrackableLinkCriteriaByObjResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "segmentationAddSerieTrackableLinkCriteriaByObjResponse");
    private final static QName _GetDefaultSender_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "getDefaultSender");
    private final static QName _GetCampaignsByPeriod_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "getCampaignsByPeriod");
    private final static QName _CreateActionBannerLink_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "createActionBannerLink");
    private final static QName _TestEmailMessageByMemberResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "testEmailMessageByMemberResponse");
    private final static QName _UntrackAllLinks_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "untrackAllLinks");
    private final static QName _GetCampaignSummaryListResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "getCampaignSummaryListResponse");
    private final static QName _CreateAndAddUpdateUrlResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "createAndAddUpdateUrlResponse");
    private final static QName _SegmentationAddStringDemographicCriteriaByObj_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "segmentationAddStringDemographicCriteriaByObj");
    private final static QName _GetAllBannerTrackableLinks_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "getAllBannerTrackableLinks");
    private final static QName _UpdateCampaignByObj_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "updateCampaignByObj");
    private final static QName _GetNotValidatedSenders_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "getNotValidatedSenders");
    private final static QName _GetBannerSummaryList_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "getBannerSummaryList");
    private final static QName _RemoveTestMemberResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "removeTestMemberResponse");
    private final static QName _TestCampaignByMember_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "testCampaignByMember");
    private final static QName _SegmentationUpdateRecencyCriteriaByObj_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "segmentationUpdateRecencyCriteriaByObj");
    private final static QName _GetCampaignsByStatusResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "getCampaignsByStatusResponse");
    private final static QName _CreateActionUrl_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "createActionUrl");
    private final static QName _CreateTestGroupByObjResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "createTestGroupByObjResponse");
    private final static QName _CloseApiConnection_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "closeApiConnection");
    private final static QName _CreateUpdateBannerLink_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "createUpdateBannerLink");
    private final static QName _UntrackLinkByOrderResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "untrackLinkByOrderResponse");
    private final static QName _CreateCampaignWithAnalyticsResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "createCampaignWithAnalyticsResponse");
    private final static QName _GetCampaignSnapshot_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "getCampaignSnapshot");
    private final static QName _GetLastBannersResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "getLastBannersResponse");
    private final static QName _IsHtmlValid_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "isHtmlValid");
    private final static QName _SegmentationDeleteSegmentResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "segmentationDeleteSegmentResponse");
    private final static QName _GetMailingListsByField_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "getMailingListsByField");
    private final static QName _GetBannerResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "getBannerResponse");
    private final static QName _DeleteSegmentResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "deleteSegmentResponse");
    private final static QName _GetAllTrackableLinks_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "getAllTrackableLinks");
    private final static QName _PartnerConnectionResult_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "partnerConnectionResult");
    private final static QName _GetLastMailingListsResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "getLastMailingListsResponse");
    private final static QName _CreateCombinedSegment_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "createCombinedSegment");
    private final static QName _CreateSmsMessageByObjResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "createSmsMessageByObjResponse");
    private final static QName _BannerLink_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "bannerLink");
    private final static QName _SegmentationGetSegmentList_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "segmentationGetSegmentList");
    private final static QName _CreateBannerByObj_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "createBannerByObj");
    private final static QName _SegmentationCountResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "segmentationCountResponse");
    private final static QName _GetCampaignReportResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "getCampaignReportResponse");
    private final static QName _DeleteTestGroup_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "deleteTestGroup");
    private final static QName _GetLastSegmentsResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "getLastSegmentsResponse");
    private final static QName _SegmentationCreateInclusionExclusionCriteriaByObjResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "segmentationCreateInclusionExclusionCriteriaByObjResponse");
    private final static QName _CreateCampaignWithAnalytics_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "createCampaignWithAnalytics");
    private final static QName _GetTestMembersResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "getTestMembersResponse");
    private final static QName _DeleteSegment_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "deleteSegment");
    private final static QName _TrackableLinkCriteria_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "trackableLinkCriteria");
    private final static QName _SegmentationDeleteSegment_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "segmentationDeleteSegment");
    private final static QName _GetTestMemberResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "getTestMemberResponse");
    private final static QName _GetValidatedAltSendersResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "getValidatedAltSendersResponse");
    private final static QName _UntrackBannerLinkByOrderResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "untrackBannerLinkByOrderResponse");
    private final static QName _CreateStandardUrlResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "createStandardUrlResponse");
    private final static QName _SegmentationCreateInclusionExclusionCriteriaByObj_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "segmentationCreateInclusionExclusionCriteriaByObj");
    private final static QName _UnpostCampaign_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "unpostCampaign");
    private final static QName _SegmentationAddSerieActionCriteriaByObj_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "segmentationAddSerieActionCriteriaByObj");
    private final static QName _CreateStandardUrl_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "createStandardUrl");
    private final static QName _CreateAndAddActionBannerLink_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "createAndAddActionBannerLink");
    private final static QName _GetMailingListsByFieldResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "getMailingListsByFieldResponse");
    private final static QName _InclusionExclusionCriteria_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "inclusionExclusionCriteria");
    private final static QName _DeleteUrlResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "deleteUrlResponse");
    private final static QName _SegmentationAddRecencyCriteriaByObj_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "segmentationAddRecencyCriteriaByObj");
    private final static QName _SegmentationGetSegmentByIdResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "segmentationGetSegmentByIdResponse");
    private final static QName _CreateAndAddStandardBannerLinkResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "createAndAddStandardBannerLinkResponse");
    private final static QName _SegmentationUpdateDateDemographicCriteriaByObj_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "segmentationUpdateDateDemographicCriteriaByObj");
    private final static QName _CreateBannerByObjResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "createBannerByObjResponse");
    private final static QName _GetEmailMessagePreviewResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "getEmailMessagePreviewResponse");
    private final static QName _CreateUnsubscribeBannerLink_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "createUnsubscribeBannerLink");
    private final static QName _UpdateCampaignResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "updateCampaignResponse");
    private final static QName _CreateAndAddStandardUrlResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "createAndAddStandardUrlResponse");
    private final static QName _GetCampaignsByFieldResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "getCampaignsByFieldResponse");
    private final static QName _GetBannerLinkByOrderResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "getBannerLinkByOrderResponse");
    private final static QName _SegmentationUpdateInclusionExclusionCriteriaByObj_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "segmentationUpdateInclusionExclusionCriteriaByObj");
    private final static QName _CreateSQLSegmentByObj_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "createSQLSegmentByObj");
    private final static QName _CreateActionBannerLinkResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "createActionBannerLinkResponse");
    private final static QName _GetBannerLinkByOrder_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "getBannerLinkByOrder");
    private final static QName _CreateAndAddActionUrl_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "createAndAddActionUrl");
    private final static QName _SegmentationAddCampaignTrackableLinkCriteriaByObjResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "segmentationAddCampaignTrackableLinkCriteriaByObjResponse");
    private final static QName _SegmentationUpdateSerieActionCriteriaByObj_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "segmentationUpdateSerieActionCriteriaByObj");
    private final static QName _TrackAllBannerLinksResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "trackAllBannerLinksResponse");
    private final static QName _CreateEmailMessageByObj_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "createEmailMessageByObj");
    private final static QName _CreateUpdateUrl_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "createUpdateUrl");
    private final static QName _UntrackAllBannerLinks_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "untrackAllBannerLinks");
    private final static QName _GetBanner_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "getBanner");
    private final static QName _UnpauseCampaignResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "unpauseCampaignResponse");
    private final static QName _UpdateMailingList_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "updateMailingList");
    private final static QName _GetEmailMessagesByField_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "getEmailMessagesByField");
    private final static QName _TestEmailMessageByGroupResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "testEmailMessageByGroupResponse");
    private final static QName _CreateAndAddUpdateBannerLink_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "createAndAddUpdateBannerLink");
    private final static QName _MembersCountResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "membersCountResponse");
    private final static QName _GetBannersByPeriod_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "getBannersByPeriod");
    private final static QName _SegmentationUpdateSegmentResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "segmentationUpdateSegmentResponse");
    private final static QName _GetLastCampaignsResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "getLastCampaignsResponse");
    private final static QName _UpdateBannerLinkByField_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "updateBannerLinkByField");
    private final static QName _CloseApiConnectionResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "closeApiConnectionResponse");
    private final static QName _OpenPartnerConnectionResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "openPartnerConnectionResponse");
    private final static QName _SegmentationUpdateCampaignActionCriteriaByObj_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "segmentationUpdateCampaignActionCriteriaByObj");
    private final static QName _AddSegmentResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "addSegmentResponse");
    private final static QName _TestCampaignByMemberResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "testCampaignByMemberResponse");
    private final static QName _PostCampaign_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "postCampaign");
    private final static QName _CreateAndAddPersonalisedUrlResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "createAndAddPersonalisedUrlResponse");
    private final static QName _TestSmsMessageResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "testSmsMessageResponse");
    private final static QName _CreateAndAddUnsubscribeBannerLink_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "createAndAddUnsubscribeBannerLink");
    private final static QName _GetAllBannerTrackedLinksResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "getAllBannerTrackedLinksResponse");
    private final static QName _CreateStandardBannerLink_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "createStandardBannerLink");
    private final static QName _CreateCampaignByObjResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "createCampaignByObjResponse");
    private final static QName _CreateAndAddMirrorUrl_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "createAndAddMirrorUrl");
    private final static QName _CreateUnsubscribeBannerLinkResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "createUnsubscribeBannerLinkResponse");
    private final static QName _CreateUpdateUrlResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "createUpdateUrlResponse");
    private final static QName _CreateEmailMessageByObjResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "createEmailMessageByObjResponse");
    private final static QName _CreateTestGroupByObj_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "createTestGroupByObj");
    private final static QName _GetTestGroupResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "getTestGroupResponse");
    private final static QName _GetBannerSummaryListResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "getBannerSummaryListResponse");
    private final static QName _GetUrlByOrder_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "getUrlByOrder");
    private final static QName _SegmentationAddSerieTrackableLinkCriteriaByObj_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "segmentationAddSerieTrackableLinkCriteriaByObj");
    private final static QName _UpdateBannerResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "updateBannerResponse");
    private final static QName _GetSegmentResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "getSegmentResponse");
    private final static QName _SegmentationUpdateInclusionExclusionCriteriaByObjResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "segmentationUpdateInclusionExclusionCriteriaByObjResponse");
    private final static QName _UpdateMessageResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "updateMessageResponse");
    private final static QName _MailingListCountResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "mailingListCountResponse");
    private final static QName _GetLastBanners_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "getLastBanners");
    private final static QName _AddTestMemberResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "addTestMemberResponse");
    private final static QName _OpenPartnerConnection_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "openPartnerConnection");
    private final static QName _CreateBasicSegmentByObjResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "createBasicSegmentByObjResponse");
    private final static QName _GetBannersByFieldResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "getBannersByFieldResponse");
    private final static QName _GetAllBannerTrackableLinksResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "getAllBannerTrackableLinksResponse");
    private final static QName _CreateAndAddUnsubscribeUrlResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "createAndAddUnsubscribeUrlResponse");
    private final static QName _UpdateMailingListResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "updateMailingListResponse");
    private final static QName _AddShareLink_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "addShareLink");
    private final static QName _GetAllUnusedTrackedLinks_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "getAllUnusedTrackedLinks");
    private final static QName _CreateEmailMessage_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "createEmailMessage");
    private final static QName _SegmentationAddStringDemographicCriteriaByObjResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "segmentationAddStringDemographicCriteriaByObjResponse");
    private final static QName _GetBannersByPeriodResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "getBannersByPeriodResponse");
    private final static QName _CampaignSummary_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "campaignSummary");
    private final static QName _CreateTestMemberResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "createTestMemberResponse");
    private final static QName _RecencyCriteria_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "recencyCriteria");
    private final static QName _SegmentationAddDataMartCriteriaByObjResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "segmentationAddDataMartCriteriaByObjResponse");
    private final static QName _SegmentationAddDateDemographicCriteriaByObj_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "segmentationAddDateDemographicCriteriaByObj");
    private final static QName _SegmentationUpdateSerieActionCriteriaByObjResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "segmentationUpdateSerieActionCriteriaByObjResponse");
    private final static QName _AddTestMember_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "addTestMember");
    private final static QName _GetSmsMessagePreviewResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "getSmsMessagePreviewResponse");
    private final static QName _GetLastSmsMessages_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "getLastSmsMessages");
    private final static QName _TrackAllLinks_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "trackAllLinks");
    private final static QName _SegmentationUpdateCampaignTrackableLinkCriteriaByObj_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "segmentationUpdateCampaignTrackableLinkCriteriaByObj");
    private final static QName _GetSmsMessagePreview_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "getSmsMessagePreview");
    private final static QName _UpdateBannerLinkByFieldResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "updateBannerLinkByFieldResponse");
    private final static QName _AddShareLinkResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "addShareLinkResponse");
    private final static QName _GetBannerPreviewResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "getBannerPreviewResponse");
    private final static QName _GetValidatedAltSenders_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "getValidatedAltSenders");
    private final static QName _SegmentationGetSegmentCriteriasResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "segmentationGetSegmentCriteriasResponse");
    private final static QName _UpdateBannerByObj_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "updateBannerByObj");
    private final static QName _GetBannersByField_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "getBannersByField");
    private final static QName _CreateActionUrlResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "createActionUrlResponse");
    private final static QName _CreateMirrorBannerLinkResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "createMirrorBannerLinkResponse");
    private final static QName _UntrackAllBannerLinksResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "untrackAllBannerLinksResponse");
    private final static QName _SegmentationGetSegmentById_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "segmentationGetSegmentById");
    private final static QName _OpenApiConnectionResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "openApiConnectionResponse");
    private final static QName _StringDemographicCriteria_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "stringDemographicCriteria");
    private final static QName _DeleteCampaignResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "deleteCampaignResponse");
    private final static QName _CreateBasicSegmentByObj_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "createBasicSegmentByObj");
    private final static QName _Campaign_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "campaign");
    private final static QName _CreateAndAddUnsubscribeUrl_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "createAndAddUnsubscribeUrl");
    private final static QName _SegmentationCreateSegmentResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "segmentationCreateSegmentResponse");
    private final static QName _SegmentationCount_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "segmentationCount");
    private final static QName _UpdateMessageByObj_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "updateMessageByObj");
    private final static QName _CreateTestGroupResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "createTestGroupResponse");
    private final static QName _SocialNetworkCriteria_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "socialNetworkCriteria");
    private final static QName _CreateStandardBannerLinkResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "createStandardBannerLinkResponse");
    private final static QName _GetAllUnusedTrackedLinksResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "getAllUnusedTrackedLinksResponse");
    private final static QName _MessageSummary_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "messageSummary");
    private final static QName _CampaignReport_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "CampaignReport");
    private final static QName _TrackBannerLinkByPosition_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "trackBannerLinkByPosition");
    private final static QName _UpdateUrlByFieldResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "updateUrlByFieldResponse");
    private final static QName _UpdateMailingListByObj_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "updateMailingListByObj");
    private final static QName _GetMessageSummaryList_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "getMessageSummaryList");
    private final static QName _MailingListCount_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "mailingListCount");
    private final static QName _GetSmsMessagesByField_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "getSmsMessagesByField");
    private final static QName _GetLastSmsMessagesResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "getLastSmsMessagesResponse");
    private final static QName _UpdateMessage_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "updateMessage");
    private final static QName _SegmentationGetPersoFragList_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "segmentationGetPersoFragList");
    private final static QName _CreateCombinedSegmentResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "createCombinedSegmentResponse");
    private final static QName _CreateAndAddStandardBannerLink_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "createAndAddStandardBannerLink");
    private final static QName _SegmentationUpdateSerieTrackableLinkCriteriaByObj_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "segmentationUpdateSerieTrackableLinkCriteriaByObj");
    private final static QName _SegmentationGetSegmentListResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "segmentationGetSegmentListResponse");
    private final static QName _TrackLinkByPositionResponse_QNAME = new QName("http://api.service.apiccmd.emailvision.com/", "trackLinkByPositionResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.emailvision.apiccmd.service.api
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ApiSegment }
     * 
     */
    public ApiSegment createApiSegment() {
        return new ApiSegment();
    }

    /**
     * Create an instance of {@link SegmentationUpdateSocialNetworkCriteriaByObj }
     * 
     */
    public SegmentationUpdateSocialNetworkCriteriaByObj createSegmentationUpdateSocialNetworkCriteriaByObj() {
        return new SegmentationUpdateSocialNetworkCriteriaByObj();
    }

    /**
     * Create an instance of {@link SegmentationDeleteSegmentResponse }
     * 
     */
    public SegmentationDeleteSegmentResponse createSegmentationDeleteSegmentResponse() {
        return new SegmentationDeleteSegmentResponse();
    }

    /**
     * Create an instance of {@link UpdateBannerLinkByFieldResponse }
     * 
     */
    public UpdateBannerLinkByFieldResponse createUpdateBannerLinkByFieldResponse() {
        return new UpdateBannerLinkByFieldResponse();
    }

    /**
     * Create an instance of {@link CreateCampaign }
     * 
     */
    public CreateCampaign createCreateCampaign() {
        return new CreateCampaign();
    }

    /**
     * Create an instance of {@link SegmentationDeleteCriteriaResponse }
     * 
     */
    public SegmentationDeleteCriteriaResponse createSegmentationDeleteCriteriaResponse() {
        return new SegmentationDeleteCriteriaResponse();
    }

    /**
     * Create an instance of {@link UpdateBannerByObj }
     * 
     */
    public UpdateBannerByObj createUpdateBannerByObj() {
        return new UpdateBannerByObj();
    }

    /**
     * Create an instance of {@link ApiSocialNetworkCriteria }
     * 
     */
    public ApiSocialNetworkCriteria createApiSocialNetworkCriteria() {
        return new ApiSocialNetworkCriteria();
    }

    /**
     * Create an instance of {@link CreateAndAddUnsubscribeBannerLink }
     * 
     */
    public CreateAndAddUnsubscribeBannerLink createCreateAndAddUnsubscribeBannerLink() {
        return new CreateAndAddUnsubscribeBannerLink();
    }

    /**
     * Create an instance of {@link TestEmailMessageByGroupResponse }
     * 
     */
    public TestEmailMessageByGroupResponse createTestEmailMessageByGroupResponse() {
        return new TestEmailMessageByGroupResponse();
    }

    /**
     * Create an instance of {@link AddShareLink }
     * 
     */
    public AddShareLink createAddShareLink() {
        return new AddShareLink();
    }

    /**
     * Create an instance of {@link SegmentationAddSerieActionCriteriaByObj }
     * 
     */
    public SegmentationAddSerieActionCriteriaByObj createSegmentationAddSerieActionCriteriaByObj() {
        return new SegmentationAddSerieActionCriteriaByObj();
    }

    /**
     * Create an instance of {@link TestSmsMessageResponse }
     * 
     */
    public TestSmsMessageResponse createTestSmsMessageResponse() {
        return new TestSmsMessageResponse();
    }

    /**
     * Create an instance of {@link OpenPartnerConnection }
     * 
     */
    public OpenPartnerConnection createOpenPartnerConnection() {
        return new OpenPartnerConnection();
    }

    /**
     * Create an instance of {@link GetCampaignsByStatus }
     * 
     */
    public GetCampaignsByStatus createGetCampaignsByStatus() {
        return new GetCampaignsByStatus();
    }

    /**
     * Create an instance of {@link SegmentationAddRecencyCriteriaByObj }
     * 
     */
    public SegmentationAddRecencyCriteriaByObj createSegmentationAddRecencyCriteriaByObj() {
        return new SegmentationAddRecencyCriteriaByObj();
    }

    /**
     * Create an instance of {@link ApiInclusionExclusionCriteria }
     * 
     */
    public ApiInclusionExclusionCriteria createApiInclusionExclusionCriteria() {
        return new ApiInclusionExclusionCriteria();
    }

    /**
     * Create an instance of {@link GetBannersByPeriodResponse }
     * 
     */
    public GetBannersByPeriodResponse createGetBannersByPeriodResponse() {
        return new GetBannersByPeriodResponse();
    }

    /**
     * Create an instance of {@link SegmentationUpdateStringDemographicCriteriaByObjResponse }
     * 
     */
    public SegmentationUpdateStringDemographicCriteriaByObjResponse createSegmentationUpdateStringDemographicCriteriaByObjResponse() {
        return new SegmentationUpdateStringDemographicCriteriaByObjResponse();
    }

    /**
     * Create an instance of {@link SegmentationAddSerieTrackableLinkCriteriaByObjResponse }
     * 
     */
    public SegmentationAddSerieTrackableLinkCriteriaByObjResponse createSegmentationAddSerieTrackableLinkCriteriaByObjResponse() {
        return new SegmentationAddSerieTrackableLinkCriteriaByObjResponse();
    }

    /**
     * Create an instance of {@link UpdateSegmentResponse }
     * 
     */
    public UpdateSegmentResponse createUpdateSegmentResponse() {
        return new UpdateSegmentResponse();
    }

    /**
     * Create an instance of {@link ApiStringDemographicCriteria }
     * 
     */
    public ApiStringDemographicCriteria createApiStringDemographicCriteria() {
        return new ApiStringDemographicCriteria();
    }

    /**
     * Create an instance of {@link CreateAndAddPersonalisedBannerLinkResponse }
     * 
     */
    public CreateAndAddPersonalisedBannerLinkResponse createCreateAndAddPersonalisedBannerLinkResponse() {
        return new CreateAndAddPersonalisedBannerLinkResponse();
    }

    /**
     * Create an instance of {@link GetCampaignsByPeriodResponse }
     * 
     */
    public GetCampaignsByPeriodResponse createGetCampaignsByPeriodResponse() {
        return new GetCampaignsByPeriodResponse();
    }

    /**
     * Create an instance of {@link SegmentationUpdateDateDemographicCriteriaByObjResponse }
     * 
     */
    public SegmentationUpdateDateDemographicCriteriaByObjResponse createSegmentationUpdateDateDemographicCriteriaByObjResponse() {
        return new SegmentationUpdateDateDemographicCriteriaByObjResponse();
    }

    /**
     * Create an instance of {@link GetMailingListsByPeriod }
     * 
     */
    public GetMailingListsByPeriod createGetMailingListsByPeriod() {
        return new GetMailingListsByPeriod();
    }

    /**
     * Create an instance of {@link CreateTestGroupByObj }
     * 
     */
    public CreateTestGroupByObj createCreateTestGroupByObj() {
        return new CreateTestGroupByObj();
    }

    /**
     * Create an instance of {@link SegmentationAddDataMartCriteriaByObjResponse }
     * 
     */
    public SegmentationAddDataMartCriteriaByObjResponse createSegmentationAddDataMartCriteriaByObjResponse() {
        return new SegmentationAddDataMartCriteriaByObjResponse();
    }

    /**
     * Create an instance of {@link GetDefaultSender }
     * 
     */
    public GetDefaultSender createGetDefaultSender() {
        return new GetDefaultSender();
    }

    /**
     * Create an instance of {@link UpdateMailingList }
     * 
     */
    public UpdateMailingList createUpdateMailingList() {
        return new UpdateMailingList();
    }

    /**
     * Create an instance of {@link UpdateBanner }
     * 
     */
    public UpdateBanner createUpdateBanner() {
        return new UpdateBanner();
    }

    /**
     * Create an instance of {@link UpdateBannerResponse }
     * 
     */
    public UpdateBannerResponse createUpdateBannerResponse() {
        return new UpdateBannerResponse();
    }

    /**
     * Create an instance of {@link APIBannerSummaryList }
     * 
     */
    public APIBannerSummaryList createAPIBannerSummaryList() {
        return new APIBannerSummaryList();
    }

    /**
     * Create an instance of {@link APIBannerSummaryList.BannerSummaryList }
     * 
     */
    public APIBannerSummaryList.BannerSummaryList createAPIBannerSummaryListBannerSummaryList() {
        return new APIBannerSummaryList.BannerSummaryList();
    }

    /**
     * Create an instance of {@link TestMembers }
     * 
     */
    public TestMembers createTestMembers() {
        return new TestMembers();
    }

    /**
     * Create an instance of {@link TrackLinkByPositionResponse }
     * 
     */
    public TrackLinkByPositionResponse createTrackLinkByPositionResponse() {
        return new TrackLinkByPositionResponse();
    }

    /**
     * Create an instance of {@link CreateEmailMessage }
     * 
     */
    public CreateEmailMessage createCreateEmailMessage() {
        return new CreateEmailMessage();
    }

    /**
     * Create an instance of {@link APISegmentSummaryList.SegmentSummaryList }
     * 
     */
    public APISegmentSummaryList.SegmentSummaryList createAPISegmentSummaryListSegmentSummaryList() {
        return new APISegmentSummaryList.SegmentSummaryList();
    }

    /**
     * Create an instance of {@link GetMessagesByPeriodResponse }
     * 
     */
    public GetMessagesByPeriodResponse createGetMessagesByPeriodResponse() {
        return new GetMessagesByPeriodResponse();
    }

    /**
     * Create an instance of {@link GetBannerLinkByOrder }
     * 
     */
    public GetBannerLinkByOrder createGetBannerLinkByOrder() {
        return new GetBannerLinkByOrder();
    }

    /**
     * Create an instance of {@link SegmentationGetSegmentById }
     * 
     */
    public SegmentationGetSegmentById createSegmentationGetSegmentById() {
        return new SegmentationGetSegmentById();
    }

    /**
     * Create an instance of {@link APICampaignSummary }
     * 
     */
    public APICampaignSummary createAPICampaignSummary() {
        return new APICampaignSummary();
    }

    /**
     * Create an instance of {@link GetLastBanners }
     * 
     */
    public GetLastBanners createGetLastBanners() {
        return new GetLastBanners();
    }

    /**
     * Create an instance of {@link APIMessageSummaryList }
     * 
     */
    public APIMessageSummaryList createAPIMessageSummaryList() {
        return new APIMessageSummaryList();
    }

    /**
     * Create an instance of {@link CreateActionUrl }
     * 
     */
    public CreateActionUrl createCreateActionUrl() {
        return new CreateActionUrl();
    }

    /**
     * Create an instance of {@link APICampaignSummaryList.CampaignSummaryList }
     * 
     */
    public APICampaignSummaryList.CampaignSummaryList createAPICampaignSummaryListCampaignSummaryList() {
        return new APICampaignSummaryList.CampaignSummaryList();
    }

    /**
     * Create an instance of {@link CreateSQLSegmentByObj }
     * 
     */
    public CreateSQLSegmentByObj createCreateSQLSegmentByObj() {
        return new CreateSQLSegmentByObj();
    }

    /**
     * Create an instance of {@link GetBannerSummaryListResponse }
     * 
     */
    public GetBannerSummaryListResponse createGetBannerSummaryListResponse() {
        return new GetBannerSummaryListResponse();
    }

    /**
     * Create an instance of {@link SegmentationUpdateNumericDemographicCriteriaByObj }
     * 
     */
    public SegmentationUpdateNumericDemographicCriteriaByObj createSegmentationUpdateNumericDemographicCriteriaByObj() {
        return new SegmentationUpdateNumericDemographicCriteriaByObj();
    }

    /**
     * Create an instance of {@link GetTestMembersResponse }
     * 
     */
    public GetTestMembersResponse createGetTestMembersResponse() {
        return new GetTestMembersResponse();
    }

    /**
     * Create an instance of {@link GetAllUnusedTrackedLinks }
     * 
     */
    public GetAllUnusedTrackedLinks createGetAllUnusedTrackedLinks() {
        return new GetAllUnusedTrackedLinks();
    }

    /**
     * Create an instance of {@link DeleteTestGroup }
     * 
     */
    public DeleteTestGroup createDeleteTestGroup() {
        return new DeleteTestGroup();
    }

    /**
     * Create an instance of {@link SegmentationDistinctCountResponse }
     * 
     */
    public SegmentationDistinctCountResponse createSegmentationDistinctCountResponse() {
        return new SegmentationDistinctCountResponse();
    }

    /**
     * Create an instance of {@link CreateSmsMessage }
     * 
     */
    public CreateSmsMessage createCreateSmsMessage() {
        return new CreateSmsMessage();
    }

    /**
     * Create an instance of {@link GetMailingListsByFieldResponse }
     * 
     */
    public GetMailingListsByFieldResponse createGetMailingListsByFieldResponse() {
        return new GetMailingListsByFieldResponse();
    }

    /**
     * Create an instance of {@link ApiCampaignReport }
     * 
     */
    public ApiCampaignReport createApiCampaignReport() {
        return new ApiCampaignReport();
    }

    /**
     * Create an instance of {@link CreateMirrorUrl }
     * 
     */
    public CreateMirrorUrl createCreateMirrorUrl() {
        return new CreateMirrorUrl();
    }

    /**
     * Create an instance of {@link SegmentationUpdateCampaignTrackableLinkCriteriaByObj }
     * 
     */
    public SegmentationUpdateCampaignTrackableLinkCriteriaByObj createSegmentationUpdateCampaignTrackableLinkCriteriaByObj() {
        return new SegmentationUpdateCampaignTrackableLinkCriteriaByObj();
    }

    /**
     * Create an instance of {@link GetCampaignsByPeriod }
     * 
     */
    public GetCampaignsByPeriod createGetCampaignsByPeriod() {
        return new GetCampaignsByPeriod();
    }

    /**
     * Create an instance of {@link CreateMailingList }
     * 
     */
    public CreateMailingList createCreateMailingList() {
        return new CreateMailingList();
    }

    /**
     * Create an instance of {@link GetMessage }
     * 
     */
    public GetMessage createGetMessage() {
        return new GetMessage();
    }

    /**
     * Create an instance of {@link GetLastEmailMessages }
     * 
     */
    public GetLastEmailMessages createGetLastEmailMessages() {
        return new GetLastEmailMessages();
    }

    /**
     * Create an instance of {@link UpdateMessageResponse }
     * 
     */
    public UpdateMessageResponse createUpdateMessageResponse() {
        return new UpdateMessageResponse();
    }

    /**
     * Create an instance of {@link GetSegmentSummaryListResponse }
     * 
     */
    public GetSegmentSummaryListResponse createGetSegmentSummaryListResponse() {
        return new GetSegmentSummaryListResponse();
    }

    /**
     * Create an instance of {@link CreateAndAddPersonalisedUrl }
     * 
     */
    public CreateAndAddPersonalisedUrl createCreateAndAddPersonalisedUrl() {
        return new CreateAndAddPersonalisedUrl();
    }

    /**
     * Create an instance of {@link CreateAndAddUnsubscribeUrl }
     * 
     */
    public CreateAndAddUnsubscribeUrl createCreateAndAddUnsubscribeUrl() {
        return new CreateAndAddUnsubscribeUrl();
    }

    /**
     * Create an instance of {@link APISegmentListOptions }
     * 
     */
    public APISegmentListOptions createAPISegmentListOptions() {
        return new APISegmentListOptions();
    }

    /**
     * Create an instance of {@link DeleteCampaign }
     * 
     */
    public DeleteCampaign createDeleteCampaign() {
        return new DeleteCampaign();
    }

    /**
     * Create an instance of {@link UpdateMessageByObj }
     * 
     */
    public UpdateMessageByObj createUpdateMessageByObj() {
        return new UpdateMessageByObj();
    }

    /**
     * Create an instance of {@link SegmentationAddCampaignTrackableLinkCriteriaByObj }
     * 
     */
    public SegmentationAddCampaignTrackableLinkCriteriaByObj createSegmentationAddCampaignTrackableLinkCriteriaByObj() {
        return new SegmentationAddCampaignTrackableLinkCriteriaByObj();
    }

    /**
     * Create an instance of {@link APISegmentSortOption }
     * 
     */
    public APISegmentSortOption createAPISegmentSortOption() {
        return new APISegmentSortOption();
    }

    /**
     * Create an instance of {@link APICampaignSortOption }
     * 
     */
    public APICampaignSortOption createAPICampaignSortOption() {
        return new APICampaignSortOption();
    }

    /**
     * Create an instance of {@link CloneMailingListResponse }
     * 
     */
    public CloneMailingListResponse createCloneMailingListResponse() {
        return new CloneMailingListResponse();
    }

    /**
     * Create an instance of {@link SegmentationGetSegmentCriterias }
     * 
     */
    public SegmentationGetSegmentCriterias createSegmentationGetSegmentCriterias() {
        return new SegmentationGetSegmentCriterias();
    }

    /**
     * Create an instance of {@link GetSmsMessagePreviewResponse }
     * 
     */
    public GetSmsMessagePreviewResponse createGetSmsMessagePreviewResponse() {
        return new GetSmsMessagePreviewResponse();
    }

    /**
     * Create an instance of {@link UpdateMessageByObjResponse }
     * 
     */
    public UpdateMessageByObjResponse createUpdateMessageByObjResponse() {
        return new UpdateMessageByObjResponse();
    }

    /**
     * Create an instance of {@link SegmentationDeleteSegment }
     * 
     */
    public SegmentationDeleteSegment createSegmentationDeleteSegment() {
        return new SegmentationDeleteSegment();
    }

    /**
     * Create an instance of {@link SegmentationAddNumericDemographicCriteriaByObj }
     * 
     */
    public SegmentationAddNumericDemographicCriteriaByObj createSegmentationAddNumericDemographicCriteriaByObj() {
        return new SegmentationAddNumericDemographicCriteriaByObj();
    }

    /**
     * Create an instance of {@link UnpauseCampaignResponse }
     * 
     */
    public UnpauseCampaignResponse createUnpauseCampaignResponse() {
        return new UnpauseCampaignResponse();
    }

    /**
     * Create an instance of {@link SegmentationCreateInclusionExclusionCriteriaByObj }
     * 
     */
    public SegmentationCreateInclusionExclusionCriteriaByObj createSegmentationCreateInclusionExclusionCriteriaByObj() {
        return new SegmentationCreateInclusionExclusionCriteriaByObj();
    }

    /**
     * Create an instance of {@link SegmentationCreateSegment }
     * 
     */
    public SegmentationCreateSegment createSegmentationCreateSegment() {
        return new SegmentationCreateSegment();
    }

    /**
     * Create an instance of {@link GetUrlByOrderResponse }
     * 
     */
    public GetUrlByOrderResponse createGetUrlByOrderResponse() {
        return new GetUrlByOrderResponse();
    }

    /**
     * Create an instance of {@link GetBannerSummaryList }
     * 
     */
    public GetBannerSummaryList createGetBannerSummaryList() {
        return new GetBannerSummaryList();
    }

    /**
     * Create an instance of {@link APIBannerSortOption }
     * 
     */
    public APIBannerSortOption createAPIBannerSortOption() {
        return new APIBannerSortOption();
    }

    /**
     * Create an instance of {@link UntrackAllBannerLinks }
     * 
     */
    public UntrackAllBannerLinks createUntrackAllBannerLinks() {
        return new UntrackAllBannerLinks();
    }

    /**
     * Create an instance of {@link UpdateSegment }
     * 
     */
    public UpdateSegment createUpdateSegment() {
        return new UpdateSegment();
    }

    /**
     * Create an instance of {@link GetLastMailingListsResponse }
     * 
     */
    public GetLastMailingListsResponse createGetLastMailingListsResponse() {
        return new GetLastMailingListsResponse();
    }

    /**
     * Create an instance of {@link CreateAndAddMirrorBannerLinkResponse }
     * 
     */
    public CreateAndAddMirrorBannerLinkResponse createCreateAndAddMirrorBannerLinkResponse() {
        return new CreateAndAddMirrorBannerLinkResponse();
    }

    /**
     * Create an instance of {@link CreateAndAddStandardBannerLinkResponse }
     * 
     */
    public CreateAndAddStandardBannerLinkResponse createCreateAndAddStandardBannerLinkResponse() {
        return new CreateAndAddStandardBannerLinkResponse();
    }

    /**
     * Create an instance of {@link CloneBanner }
     * 
     */
    public CloneBanner createCloneBanner() {
        return new CloneBanner();
    }

    /**
     * Create an instance of {@link PauseCampaign }
     * 
     */
    public PauseCampaign createPauseCampaign() {
        return new PauseCampaign();
    }

    /**
     * Create an instance of {@link APISegmentSearchCriteria }
     * 
     */
    public APISegmentSearchCriteria createAPISegmentSearchCriteria() {
        return new APISegmentSearchCriteria();
    }

    /**
     * Create an instance of {@link GetBannerResponse }
     * 
     */
    public GetBannerResponse createGetBannerResponse() {
        return new GetBannerResponse();
    }

    /**
     * Create an instance of {@link ApiSegmentation }
     * 
     */
    public ApiSegmentation createApiSegmentation() {
        return new ApiSegmentation();
    }

    /**
     * Create an instance of {@link CreateBanner }
     * 
     */
    public CreateBanner createCreateBanner() {
        return new CreateBanner();
    }

    /**
     * Create an instance of {@link GetCampaignSnapshotResponse }
     * 
     */
    public GetCampaignSnapshotResponse createGetCampaignSnapshotResponse() {
        return new GetCampaignSnapshotResponse();
    }

    /**
     * Create an instance of {@link GetLastSegments }
     * 
     */
    public GetLastSegments createGetLastSegments() {
        return new GetLastSegments();
    }

    /**
     * Create an instance of {@link GetCampaignsByFieldResponse }
     * 
     */
    public GetCampaignsByFieldResponse createGetCampaignsByFieldResponse() {
        return new GetCampaignsByFieldResponse();
    }

    /**
     * Create an instance of {@link UpdateCampaignResponse }
     * 
     */
    public UpdateCampaignResponse createUpdateCampaignResponse() {
        return new UpdateCampaignResponse();
    }

    /**
     * Create an instance of {@link CreateAndAddActionBannerLink }
     * 
     */
    public CreateAndAddActionBannerLink createCreateAndAddActionBannerLink() {
        return new CreateAndAddActionBannerLink();
    }

    /**
     * Create an instance of {@link GetCampaign }
     * 
     */
    public GetCampaign createGetCampaign() {
        return new GetCampaign();
    }

    /**
     * Create an instance of {@link CreatePersonalisedBannerLinkResponse }
     * 
     */
    public CreatePersonalisedBannerLinkResponse createCreatePersonalisedBannerLinkResponse() {
        return new CreatePersonalisedBannerLinkResponse();
    }

    /**
     * Create an instance of {@link SegmentationUpdateSerieTrackableLinkCriteriaByObj }
     * 
     */
    public SegmentationUpdateSerieTrackableLinkCriteriaByObj createSegmentationUpdateSerieTrackableLinkCriteriaByObj() {
        return new SegmentationUpdateSerieTrackableLinkCriteriaByObj();
    }

    /**
     * Create an instance of {@link CreateUnsubscribeUrl }
     * 
     */
    public CreateUnsubscribeUrl createCreateUnsubscribeUrl() {
        return new CreateUnsubscribeUrl();
    }

    /**
     * Create an instance of {@link CloseApiConnectionResponse }
     * 
     */
    public CloseApiConnectionResponse createCloseApiConnectionResponse() {
        return new CloseApiConnectionResponse();
    }

    /**
     * Create an instance of {@link GetEmailMessagesByField }
     * 
     */
    public GetEmailMessagesByField createGetEmailMessagesByField() {
        return new GetEmailMessagesByField();
    }

    /**
     * Create an instance of {@link APICampaignSummaryList }
     * 
     */
    public APICampaignSummaryList createAPICampaignSummaryList() {
        return new APICampaignSummaryList();
    }

    /**
     * Create an instance of {@link SegmentationUpdateSerieActionCriteriaByObjResponse }
     * 
     */
    public SegmentationUpdateSerieActionCriteriaByObjResponse createSegmentationUpdateSerieActionCriteriaByObjResponse() {
        return new SegmentationUpdateSerieActionCriteriaByObjResponse();
    }

    /**
     * Create an instance of {@link APIMessageListOptions.SortOptions }
     * 
     */
    public APIMessageListOptions.SortOptions createAPIMessageListOptionsSortOptions() {
        return new APIMessageListOptions.SortOptions();
    }

    /**
     * Create an instance of {@link CreateAndAddMirrorBannerLink }
     * 
     */
    public CreateAndAddMirrorBannerLink createCreateAndAddMirrorBannerLink() {
        return new CreateAndAddMirrorBannerLink();
    }

    /**
     * Create an instance of {@link ApiCampaign }
     * 
     */
    public ApiCampaign createApiCampaign() {
        return new ApiCampaign();
    }

    /**
     * Create an instance of {@link SegmentationAddCampaignTrackableLinkCriteriaByObjResponse }
     * 
     */
    public SegmentationAddCampaignTrackableLinkCriteriaByObjResponse createSegmentationAddCampaignTrackableLinkCriteriaByObjResponse() {
        return new SegmentationAddCampaignTrackableLinkCriteriaByObjResponse();
    }

    /**
     * Create an instance of {@link CreateBasicSegmentResponse }
     * 
     */
    public CreateBasicSegmentResponse createCreateBasicSegmentResponse() {
        return new CreateBasicSegmentResponse();
    }

    /**
     * Create an instance of {@link APIBannerSummary }
     * 
     */
    public APIBannerSummary createAPIBannerSummary() {
        return new APIBannerSummary();
    }

    /**
     * Create an instance of {@link CreateSQLSegmentResponse }
     * 
     */
    public CreateSQLSegmentResponse createCreateSQLSegmentResponse() {
        return new CreateSQLSegmentResponse();
    }

    /**
     * Create an instance of {@link GetDefaultSenderResponse }
     * 
     */
    public GetDefaultSenderResponse createGetDefaultSenderResponse() {
        return new GetDefaultSenderResponse();
    }

    /**
     * Create an instance of {@link CloseApiConnection }
     * 
     */
    public CloseApiConnection createCloseApiConnection() {
        return new CloseApiConnection();
    }

    /**
     * Create an instance of {@link UntrackAllBannerLinksResponse }
     * 
     */
    public UntrackAllBannerLinksResponse createUntrackAllBannerLinksResponse() {
        return new UntrackAllBannerLinksResponse();
    }

    /**
     * Create an instance of {@link MembersCountResponse }
     * 
     */
    public MembersCountResponse createMembersCountResponse() {
        return new MembersCountResponse();
    }

    /**
     * Create an instance of {@link CreateUpdateUrlResponse }
     * 
     */
    public CreateUpdateUrlResponse createCreateUpdateUrlResponse() {
        return new CreateUpdateUrlResponse();
    }

    /**
     * Create an instance of {@link CcmdExceptionDetails }
     * 
     */
    public CcmdExceptionDetails createCcmdExceptionDetails() {
        return new CcmdExceptionDetails();
    }

    /**
     * Create an instance of {@link CreateAndAddMirrorUrlResponse }
     * 
     */
    public CreateAndAddMirrorUrlResponse createCreateAndAddMirrorUrlResponse() {
        return new CreateAndAddMirrorUrlResponse();
    }

    /**
     * Create an instance of {@link CreateAndAddUpdateUrlResponse }
     * 
     */
    public CreateAndAddUpdateUrlResponse createCreateAndAddUpdateUrlResponse() {
        return new CreateAndAddUpdateUrlResponse();
    }

    /**
     * Create an instance of {@link SegmentationCreateInclusionExclusionCriteriaByObjResponse }
     * 
     */
    public SegmentationCreateInclusionExclusionCriteriaByObjResponse createSegmentationCreateInclusionExclusionCriteriaByObjResponse() {
        return new SegmentationCreateInclusionExclusionCriteriaByObjResponse();
    }

    /**
     * Create an instance of {@link SegmentationGetSegmentCriteriasResponse }
     * 
     */
    public SegmentationGetSegmentCriteriasResponse createSegmentationGetSegmentCriteriasResponse() {
        return new SegmentationGetSegmentCriteriasResponse();
    }

    /**
     * Create an instance of {@link GetUrlByOrder }
     * 
     */
    public GetUrlByOrder createGetUrlByOrder() {
        return new GetUrlByOrder();
    }

    /**
     * Create an instance of {@link GetCampaignReportResponse }
     * 
     */
    public GetCampaignReportResponse createGetCampaignReportResponse() {
        return new GetCampaignReportResponse();
    }

    /**
     * Create an instance of {@link GetCampaignStatusResponse }
     * 
     */
    public GetCampaignStatusResponse createGetCampaignStatusResponse() {
        return new GetCampaignStatusResponse();
    }

    /**
     * Create an instance of {@link GetClientTestGroups }
     * 
     */
    public GetClientTestGroups createGetClientTestGroups() {
        return new GetClientTestGroups();
    }

    /**
     * Create an instance of {@link SegmentationUpdateSocialNetworkCriteriaByObjResponse }
     * 
     */
    public SegmentationUpdateSocialNetworkCriteriaByObjResponse createSegmentationUpdateSocialNetworkCriteriaByObjResponse() {
        return new SegmentationUpdateSocialNetworkCriteriaByObjResponse();
    }

    /**
     * Create an instance of {@link MailingListDistinctCount }
     * 
     */
    public MailingListDistinctCount createMailingListDistinctCount() {
        return new MailingListDistinctCount();
    }

    /**
     * Create an instance of {@link CreateAndAddActionBannerLinkResponse }
     * 
     */
    public CreateAndAddActionBannerLinkResponse createCreateAndAddActionBannerLinkResponse() {
        return new CreateAndAddActionBannerLinkResponse();
    }

    /**
     * Create an instance of {@link SegmentationAddCampaignActionCriteriaByObj }
     * 
     */
    public SegmentationAddCampaignActionCriteriaByObj createSegmentationAddCampaignActionCriteriaByObj() {
        return new SegmentationAddCampaignActionCriteriaByObj();
    }

    /**
     * Create an instance of {@link GetMessageSummaryListResponse }
     * 
     */
    public GetMessageSummaryListResponse createGetMessageSummaryListResponse() {
        return new GetMessageSummaryListResponse();
    }

    /**
     * Create an instance of {@link SegmentationUpdateInclusionExclusionCriteriaByObjResponse }
     * 
     */
    public SegmentationUpdateInclusionExclusionCriteriaByObjResponse createSegmentationUpdateInclusionExclusionCriteriaByObjResponse() {
        return new SegmentationUpdateInclusionExclusionCriteriaByObjResponse();
    }

    /**
     * Create an instance of {@link GetAllTrackedLinks }
     * 
     */
    public GetAllTrackedLinks createGetAllTrackedLinks() {
        return new GetAllTrackedLinks();
    }

    /**
     * Create an instance of {@link GetBannersByFieldResponse }
     * 
     */
    public GetBannersByFieldResponse createGetBannersByFieldResponse() {
        return new GetBannersByFieldResponse();
    }

    /**
     * Create an instance of {@link CloneMessageResponse }
     * 
     */
    public CloneMessageResponse createCloneMessageResponse() {
        return new CloneMessageResponse();
    }

    /**
     * Create an instance of {@link CreateUnsubscribeBannerLinkResponse }
     * 
     */
    public CreateUnsubscribeBannerLinkResponse createCreateUnsubscribeBannerLinkResponse() {
        return new CreateUnsubscribeBannerLinkResponse();
    }

    /**
     * Create an instance of {@link APISegmentListOptions.SortOptions }
     * 
     */
    public APISegmentListOptions.SortOptions createAPISegmentListOptionsSortOptions() {
        return new APISegmentListOptions.SortOptions();
    }

    /**
     * Create an instance of {@link SegmentationUpdateSerieActionCriteriaByObj }
     * 
     */
    public SegmentationUpdateSerieActionCriteriaByObj createSegmentationUpdateSerieActionCriteriaByObj() {
        return new SegmentationUpdateSerieActionCriteriaByObj();
    }

    /**
     * Create an instance of {@link GetCampaignResponse }
     * 
     */
    public GetCampaignResponse createGetCampaignResponse() {
        return new GetCampaignResponse();
    }

    /**
     * Create an instance of {@link UpdateTestGroupByObj }
     * 
     */
    public UpdateTestGroupByObj createUpdateTestGroupByObj() {
        return new UpdateTestGroupByObj();
    }

    /**
     * Create an instance of {@link TrackAllBannerLinks }
     * 
     */
    public TrackAllBannerLinks createTrackAllBannerLinks() {
        return new TrackAllBannerLinks();
    }

    /**
     * Create an instance of {@link ApiDateDemographicCriteria }
     * 
     */
    public ApiDateDemographicCriteria createApiDateDemographicCriteria() {
        return new ApiDateDemographicCriteria();
    }

    /**
     * Create an instance of {@link GetCampaignSnapshot }
     * 
     */
    public GetCampaignSnapshot createGetCampaignSnapshot() {
        return new GetCampaignSnapshot();
    }

    /**
     * Create an instance of {@link GetBannerPreviewResponse }
     * 
     */
    public GetBannerPreviewResponse createGetBannerPreviewResponse() {
        return new GetBannerPreviewResponse();
    }

    /**
     * Create an instance of {@link DeleteMailingListResponse }
     * 
     */
    public DeleteMailingListResponse createDeleteMailingListResponse() {
        return new DeleteMailingListResponse();
    }

    /**
     * Create an instance of {@link AddSegmentResponse }
     * 
     */
    public AddSegmentResponse createAddSegmentResponse() {
        return new AddSegmentResponse();
    }

    /**
     * Create an instance of {@link CreateAndAddUpdateBannerLinkResponse }
     * 
     */
    public CreateAndAddUpdateBannerLinkResponse createCreateAndAddUpdateBannerLinkResponse() {
        return new CreateAndAddUpdateBannerLinkResponse();
    }

    /**
     * Create an instance of {@link CreatePersonalisedUrl }
     * 
     */
    public CreatePersonalisedUrl createCreatePersonalisedUrl() {
        return new CreatePersonalisedUrl();
    }

    /**
     * Create an instance of {@link SegmentationGetSegmentList }
     * 
     */
    public SegmentationGetSegmentList createSegmentationGetSegmentList() {
        return new SegmentationGetSegmentList();
    }

    /**
     * Create an instance of {@link GetMailingList }
     * 
     */
    public GetMailingList createGetMailingList() {
        return new GetMailingList();
    }

    /**
     * Create an instance of {@link TestCampaignByGroup }
     * 
     */
    public TestCampaignByGroup createTestCampaignByGroup() {
        return new TestCampaignByGroup();
    }

    /**
     * Create an instance of {@link GetAllBannerTrackableLinksResponse }
     * 
     */
    public GetAllBannerTrackableLinksResponse createGetAllBannerTrackableLinksResponse() {
        return new GetAllBannerTrackableLinksResponse();
    }

    /**
     * Create an instance of {@link AddSegment }
     * 
     */
    public AddSegment createAddSegment() {
        return new AddSegment();
    }

    /**
     * Create an instance of {@link CreateCampaignResponse }
     * 
     */
    public CreateCampaignResponse createCreateCampaignResponse() {
        return new CreateCampaignResponse();
    }

    /**
     * Create an instance of {@link GetAllBannerTrackedLinksResponse }
     * 
     */
    public GetAllBannerTrackedLinksResponse createGetAllBannerTrackedLinksResponse() {
        return new GetAllBannerTrackedLinksResponse();
    }

    /**
     * Create an instance of {@link CreateAndAddActionUrlResponse }
     * 
     */
    public CreateAndAddActionUrlResponse createCreateAndAddActionUrlResponse() {
        return new CreateAndAddActionUrlResponse();
    }

    /**
     * Create an instance of {@link CreateUnsubscribeBannerLink }
     * 
     */
    public CreateUnsubscribeBannerLink createCreateUnsubscribeBannerLink() {
        return new CreateUnsubscribeBannerLink();
    }

    /**
     * Create an instance of {@link ConnectionExceptionDetails }
     * 
     */
    public ConnectionExceptionDetails createConnectionExceptionDetails() {
        return new ConnectionExceptionDetails();
    }

    /**
     * Create an instance of {@link GetMessagesByPeriod }
     * 
     */
    public GetMessagesByPeriod createGetMessagesByPeriod() {
        return new GetMessagesByPeriod();
    }

    /**
     * Create an instance of {@link UpdateCampaign }
     * 
     */
    public UpdateCampaign createUpdateCampaign() {
        return new UpdateCampaign();
    }

    /**
     * Create an instance of {@link CreateSmsMessageResponse }
     * 
     */
    public CreateSmsMessageResponse createCreateSmsMessageResponse() {
        return new CreateSmsMessageResponse();
    }

    /**
     * Create an instance of {@link GetCampaignSummaryListResponse }
     * 
     */
    public GetCampaignSummaryListResponse createGetCampaignSummaryListResponse() {
        return new GetCampaignSummaryListResponse();
    }

    /**
     * Create an instance of {@link SegmentationUpdateCampaignActionCriteriaByObj }
     * 
     */
    public SegmentationUpdateCampaignActionCriteriaByObj createSegmentationUpdateCampaignActionCriteriaByObj() {
        return new SegmentationUpdateCampaignActionCriteriaByObj();
    }

    /**
     * Create an instance of {@link UntrackLinkByOrder }
     * 
     */
    public UntrackLinkByOrder createUntrackLinkByOrder() {
        return new UntrackLinkByOrder();
    }

    /**
     * Create an instance of {@link SegmentationAddStringDemographicCriteriaByObj }
     * 
     */
    public SegmentationAddStringDemographicCriteriaByObj createSegmentationAddStringDemographicCriteriaByObj() {
        return new SegmentationAddStringDemographicCriteriaByObj();
    }

    /**
     * Create an instance of {@link GetSegmentsByField }
     * 
     */
    public GetSegmentsByField createGetSegmentsByField() {
        return new GetSegmentsByField();
    }

    /**
     * Create an instance of {@link CreateTestGroup }
     * 
     */
    public CreateTestGroup createCreateTestGroup() {
        return new CreateTestGroup();
    }

    /**
     * Create an instance of {@link PostCampaign }
     * 
     */
    public PostCampaign createPostCampaign() {
        return new PostCampaign();
    }

    /**
     * Create an instance of {@link UpdateUrlByField }
     * 
     */
    public UpdateUrlByField createUpdateUrlByField() {
        return new UpdateUrlByField();
    }

    /**
     * Create an instance of {@link CreateActionUrlResponse }
     * 
     */
    public CreateActionUrlResponse createCreateActionUrlResponse() {
        return new CreateActionUrlResponse();
    }

    /**
     * Create an instance of {@link APICampaignListOptions.SortOptions }
     * 
     */
    public APICampaignListOptions.SortOptions createAPICampaignListOptionsSortOptions() {
        return new APICampaignListOptions.SortOptions();
    }

    /**
     * Create an instance of {@link SegmentationUpdateDataMartCriteriaByObjResponse }
     * 
     */
    public SegmentationUpdateDataMartCriteriaByObjResponse createSegmentationUpdateDataMartCriteriaByObjResponse() {
        return new SegmentationUpdateDataMartCriteriaByObjResponse();
    }

    /**
     * Create an instance of {@link GetAllTrackableLinks }
     * 
     */
    public GetAllTrackableLinks createGetAllTrackableLinks() {
        return new GetAllTrackableLinks();
    }

    /**
     * Create an instance of {@link UpdateCampaignByObj }
     * 
     */
    public UpdateCampaignByObj createUpdateCampaignByObj() {
        return new UpdateCampaignByObj();
    }

    /**
     * Create an instance of {@link GetBanner }
     * 
     */
    public GetBanner createGetBanner() {
        return new GetBanner();
    }

    /**
     * Create an instance of {@link TrackAllLinks }
     * 
     */
    public TrackAllLinks createTrackAllLinks() {
        return new TrackAllLinks();
    }

    /**
     * Create an instance of {@link GetLastEmailMessagesResponse }
     * 
     */
    public GetLastEmailMessagesResponse createGetLastEmailMessagesResponse() {
        return new GetLastEmailMessagesResponse();
    }

    /**
     * Create an instance of {@link GetAllUnusedBannerTrackedLinks }
     * 
     */
    public GetAllUnusedBannerTrackedLinks createGetAllUnusedBannerTrackedLinks() {
        return new GetAllUnusedBannerTrackedLinks();
    }

    /**
     * Create an instance of {@link CreateActionBannerLink }
     * 
     */
    public CreateActionBannerLink createCreateActionBannerLink() {
        return new CreateActionBannerLink();
    }

    /**
     * Create an instance of {@link GetLastMailingLists }
     * 
     */
    public GetLastMailingLists createGetLastMailingLists() {
        return new GetLastMailingLists();
    }

    /**
     * Create an instance of {@link CreateAndAddUnsubscribeBannerLinkResponse }
     * 
     */
    public CreateAndAddUnsubscribeBannerLinkResponse createCreateAndAddUnsubscribeBannerLinkResponse() {
        return new CreateAndAddUnsubscribeBannerLinkResponse();
    }

    /**
     * Create an instance of {@link TestEmailMessageByGroup }
     * 
     */
    public TestEmailMessageByGroup createTestEmailMessageByGroup() {
        return new TestEmailMessageByGroup();
    }

    /**
     * Create an instance of {@link GetNotValidatedSendersResponse }
     * 
     */
    public GetNotValidatedSendersResponse createGetNotValidatedSendersResponse() {
        return new GetNotValidatedSendersResponse();
    }

    /**
     * Create an instance of {@link UpdateSegmentByObj }
     * 
     */
    public UpdateSegmentByObj createUpdateSegmentByObj() {
        return new UpdateSegmentByObj();
    }

    /**
     * Create an instance of {@link ApiDataMartCriteria }
     * 
     */
    public ApiDataMartCriteria createApiDataMartCriteria() {
        return new ApiDataMartCriteria();
    }

    /**
     * Create an instance of {@link PostCampaignResponse }
     * 
     */
    public PostCampaignResponse createPostCampaignResponse() {
        return new PostCampaignResponse();
    }

    /**
     * Create an instance of {@link SegmentationAddRecencyCriteriaByObjResponse }
     * 
     */
    public SegmentationAddRecencyCriteriaByObjResponse createSegmentationAddRecencyCriteriaByObjResponse() {
        return new SegmentationAddRecencyCriteriaByObjResponse();
    }

    /**
     * Create an instance of {@link CreateBasicSegment }
     * 
     */
    public CreateBasicSegment createCreateBasicSegment() {
        return new CreateBasicSegment();
    }

    /**
     * Create an instance of {@link GetAllTrackedLinksResponse }
     * 
     */
    public GetAllTrackedLinksResponse createGetAllTrackedLinksResponse() {
        return new GetAllTrackedLinksResponse();
    }

    /**
     * Create an instance of {@link GetBannersByField }
     * 
     */
    public GetBannersByField createGetBannersByField() {
        return new GetBannersByField();
    }

    /**
     * Create an instance of {@link DeleteCampaignResponse }
     * 
     */
    public DeleteCampaignResponse createDeleteCampaignResponse() {
        return new DeleteCampaignResponse();
    }

    /**
     * Create an instance of {@link GetMailingListsByPeriodResponse }
     * 
     */
    public GetMailingListsByPeriodResponse createGetMailingListsByPeriodResponse() {
        return new GetMailingListsByPeriodResponse();
    }

    /**
     * Create an instance of {@link DeleteBanner }
     * 
     */
    public DeleteBanner createDeleteBanner() {
        return new DeleteBanner();
    }

    /**
     * Create an instance of {@link CreateCampaignWithAnalyticsResponse }
     * 
     */
    public CreateCampaignWithAnalyticsResponse createCreateCampaignWithAnalyticsResponse() {
        return new CreateCampaignWithAnalyticsResponse();
    }

    /**
     * Create an instance of {@link TrackLinkByPosition }
     * 
     */
    public TrackLinkByPosition createTrackLinkByPosition() {
        return new TrackLinkByPosition();
    }

    /**
     * Create an instance of {@link SegmentationUpdateNumericDemographicCriteriaByObjResponse }
     * 
     */
    public SegmentationUpdateNumericDemographicCriteriaByObjResponse createSegmentationUpdateNumericDemographicCriteriaByObjResponse() {
        return new SegmentationUpdateNumericDemographicCriteriaByObjResponse();
    }

    /**
     * Create an instance of {@link CreateUnsubscribeUrlResponse }
     * 
     */
    public CreateUnsubscribeUrlResponse createCreateUnsubscribeUrlResponse() {
        return new CreateUnsubscribeUrlResponse();
    }

    /**
     * Create an instance of {@link CreateUpdateUrl }
     * 
     */
    public CreateUpdateUrl createCreateUpdateUrl() {
        return new CreateUpdateUrl();
    }

    /**
     * Create an instance of {@link SegmentationAddSerieActionCriteriaByObjResponse }
     * 
     */
    public SegmentationAddSerieActionCriteriaByObjResponse createSegmentationAddSerieActionCriteriaByObjResponse() {
        return new SegmentationAddSerieActionCriteriaByObjResponse();
    }

    /**
     * Create an instance of {@link SegmentationGetSegmentByIdResponse }
     * 
     */
    public SegmentationGetSegmentByIdResponse createSegmentationGetSegmentByIdResponse() {
        return new SegmentationGetSegmentByIdResponse();
    }

    /**
     * Create an instance of {@link DistinctMembersCountResponse }
     * 
     */
    public DistinctMembersCountResponse createDistinctMembersCountResponse() {
        return new DistinctMembersCountResponse();
    }

    /**
     * Create an instance of {@link ApiBanner }
     * 
     */
    public ApiBanner createApiBanner() {
        return new ApiBanner();
    }

    /**
     * Create an instance of {@link APIBannerSearchCriteria }
     * 
     */
    public APIBannerSearchCriteria createAPIBannerSearchCriteria() {
        return new APIBannerSearchCriteria();
    }

    /**
     * Create an instance of {@link SegmentationAddSerieTrackableLinkCriteriaByObj }
     * 
     */
    public SegmentationAddSerieTrackableLinkCriteriaByObj createSegmentationAddSerieTrackableLinkCriteriaByObj() {
        return new SegmentationAddSerieTrackableLinkCriteriaByObj();
    }

    /**
     * Create an instance of {@link DeleteUrlResponse }
     * 
     */
    public DeleteUrlResponse createDeleteUrlResponse() {
        return new DeleteUrlResponse();
    }

    /**
     * Create an instance of {@link TestCampaignByGroupResponse }
     * 
     */
    public TestCampaignByGroupResponse createTestCampaignByGroupResponse() {
        return new TestCampaignByGroupResponse();
    }

    /**
     * Create an instance of {@link CreateAndAddStandardUrlResponse }
     * 
     */
    public CreateAndAddStandardUrlResponse createCreateAndAddStandardUrlResponse() {
        return new CreateAndAddStandardUrlResponse();
    }

    /**
     * Create an instance of {@link MailingListCountResponse }
     * 
     */
    public MailingListCountResponse createMailingListCountResponse() {
        return new MailingListCountResponse();
    }

    /**
     * Create an instance of {@link UpdateMailingListResponse }
     * 
     */
    public UpdateMailingListResponse createUpdateMailingListResponse() {
        return new UpdateMailingListResponse();
    }

    /**
     * Create an instance of {@link CreateMirrorUrlResponse }
     * 
     */
    public CreateMirrorUrlResponse createCreateMirrorUrlResponse() {
        return new CreateMirrorUrlResponse();
    }

    /**
     * Create an instance of {@link GetAllTrackableLinksResponse }
     * 
     */
    public GetAllTrackableLinksResponse createGetAllTrackableLinksResponse() {
        return new GetAllTrackableLinksResponse();
    }

    /**
     * Create an instance of {@link RemoveTestMemberResponse }
     * 
     */
    public RemoveTestMemberResponse createRemoveTestMemberResponse() {
        return new RemoveTestMemberResponse();
    }

    /**
     * Create an instance of {@link DeleteTestGroupResponse }
     * 
     */
    public DeleteTestGroupResponse createDeleteTestGroupResponse() {
        return new DeleteTestGroupResponse();
    }

    /**
     * Create an instance of {@link MembersCount }
     * 
     */
    public MembersCount createMembersCount() {
        return new MembersCount();
    }

    /**
     * Create an instance of {@link UpdateMailingListByObjResponse }
     * 
     */
    public UpdateMailingListByObjResponse createUpdateMailingListByObjResponse() {
        return new UpdateMailingListByObjResponse();
    }

    /**
     * Create an instance of {@link RemoveTestMember }
     * 
     */
    public RemoveTestMember createRemoveTestMember() {
        return new RemoveTestMember();
    }

    /**
     * Create an instance of {@link UpdateTestGroupByObjResponse }
     * 
     */
    public UpdateTestGroupByObjResponse createUpdateTestGroupByObjResponse() {
        return new UpdateTestGroupByObjResponse();
    }

    /**
     * Create an instance of {@link SegmentationCreateSegmentResponse }
     * 
     */
    public SegmentationCreateSegmentResponse createSegmentationCreateSegmentResponse() {
        return new SegmentationCreateSegmentResponse();
    }

    /**
     * Create an instance of {@link DeleteSegment }
     * 
     */
    public DeleteSegment createDeleteSegment() {
        return new DeleteSegment();
    }

    /**
     * Create an instance of {@link MailingListCount }
     * 
     */
    public MailingListCount createMailingListCount() {
        return new MailingListCount();
    }

    /**
     * Create an instance of {@link MailingListDistinctCountResponse }
     * 
     */
    public MailingListDistinctCountResponse createMailingListDistinctCountResponse() {
        return new MailingListDistinctCountResponse();
    }

    /**
     * Create an instance of {@link GetAllUnusedTrackedLinksResponse }
     * 
     */
    public GetAllUnusedTrackedLinksResponse createGetAllUnusedTrackedLinksResponse() {
        return new GetAllUnusedTrackedLinksResponse();
    }

    /**
     * Create an instance of {@link SegmentationUpdateInclusionExclusionCriteriaByObj }
     * 
     */
    public SegmentationUpdateInclusionExclusionCriteriaByObj createSegmentationUpdateInclusionExclusionCriteriaByObj() {
        return new SegmentationUpdateInclusionExclusionCriteriaByObj();
    }

    /**
     * Create an instance of {@link SegmentationAddCampaignActionCriteriaByObjResponse }
     * 
     */
    public SegmentationAddCampaignActionCriteriaByObjResponse createSegmentationAddCampaignActionCriteriaByObjResponse() {
        return new SegmentationAddCampaignActionCriteriaByObjResponse();
    }

    /**
     * Create an instance of {@link CreateTestMember }
     * 
     */
    public CreateTestMember createCreateTestMember() {
        return new CreateTestMember();
    }

    /**
     * Create an instance of {@link SegmentationAddDateDemographicCriteriaByObj }
     * 
     */
    public SegmentationAddDateDemographicCriteriaByObj createSegmentationAddDateDemographicCriteriaByObj() {
        return new SegmentationAddDateDemographicCriteriaByObj();
    }

    /**
     * Create an instance of {@link SegmentationAddSocialNetworkCriteriaByObjResponse }
     * 
     */
    public SegmentationAddSocialNetworkCriteriaByObjResponse createSegmentationAddSocialNetworkCriteriaByObjResponse() {
        return new SegmentationAddSocialNetworkCriteriaByObjResponse();
    }

    /**
     * Create an instance of {@link CreateBannerByObj }
     * 
     */
    public CreateBannerByObj createCreateBannerByObj() {
        return new CreateBannerByObj();
    }

    /**
     * Create an instance of {@link ApiMessage }
     * 
     */
    public ApiMessage createApiMessage() {
        return new ApiMessage();
    }

    /**
     * Create an instance of {@link UntrackAllLinks }
     * 
     */
    public UntrackAllLinks createUntrackAllLinks() {
        return new UntrackAllLinks();
    }

    /**
     * Create an instance of {@link TestSmsMessage }
     * 
     */
    public TestSmsMessage createTestSmsMessage() {
        return new TestSmsMessage();
    }

    /**
     * Create an instance of {@link GetBannerLinkByOrderResponse }
     * 
     */
    public GetBannerLinkByOrderResponse createGetBannerLinkByOrderResponse() {
        return new GetBannerLinkByOrderResponse();
    }

    /**
     * Create an instance of {@link ApiBannerLink }
     * 
     */
    public ApiBannerLink createApiBannerLink() {
        return new ApiBannerLink();
    }

    /**
     * Create an instance of {@link CreateBasicSegmentByObj }
     * 
     */
    public CreateBasicSegmentByObj createCreateBasicSegmentByObj() {
        return new CreateBasicSegmentByObj();
    }

    /**
     * Create an instance of {@link GetTestGroup }
     * 
     */
    public GetTestGroup createGetTestGroup() {
        return new GetTestGroup();
    }

    /**
     * Create an instance of {@link SegmentationUpdateSegmentResponse }
     * 
     */
    public SegmentationUpdateSegmentResponse createSegmentationUpdateSegmentResponse() {
        return new SegmentationUpdateSegmentResponse();
    }

    /**
     * Create an instance of {@link CreateAndAddUnsubscribeUrlResponse }
     * 
     */
    public CreateAndAddUnsubscribeUrlResponse createCreateAndAddUnsubscribeUrlResponse() {
        return new CreateAndAddUnsubscribeUrlResponse();
    }

    /**
     * Create an instance of {@link GetSegmentSummaryList }
     * 
     */
    public GetSegmentSummaryList createGetSegmentSummaryList() {
        return new GetSegmentSummaryList();
    }

    /**
     * Create an instance of {@link CreateSQLSegmentByObjResponse }
     * 
     */
    public CreateSQLSegmentByObjResponse createCreateSQLSegmentByObjResponse() {
        return new CreateSQLSegmentByObjResponse();
    }

    /**
     * Create an instance of {@link UpdateMessage }
     * 
     */
    public UpdateMessage createUpdateMessage() {
        return new UpdateMessage();
    }

    /**
     * Create an instance of {@link GetLastSegmentsResponse }
     * 
     */
    public GetLastSegmentsResponse createGetLastSegmentsResponse() {
        return new GetLastSegmentsResponse();
    }

    /**
     * Create an instance of {@link CreateAndAddActionUrl }
     * 
     */
    public CreateAndAddActionUrl createCreateAndAddActionUrl() {
        return new CreateAndAddActionUrl();
    }

    /**
     * Create an instance of {@link GetSegmentsByFieldResponse }
     * 
     */
    public GetSegmentsByFieldResponse createGetSegmentsByFieldResponse() {
        return new GetSegmentsByFieldResponse();
    }

    /**
     * Create an instance of {@link CreateMailingListByObj }
     * 
     */
    public CreateMailingListByObj createCreateMailingListByObj() {
        return new CreateMailingListByObj();
    }

    /**
     * Create an instance of {@link OpenPartnerConnectionResponse }
     * 
     */
    public OpenPartnerConnectionResponse createOpenPartnerConnectionResponse() {
        return new OpenPartnerConnectionResponse();
    }

    /**
     * Create an instance of {@link SegmentationDistinctCount }
     * 
     */
    public SegmentationDistinctCount createSegmentationDistinctCount() {
        return new SegmentationDistinctCount();
    }

    /**
     * Create an instance of {@link RemoveSegment }
     * 
     */
    public RemoveSegment createRemoveSegment() {
        return new RemoveSegment();
    }

    /**
     * Create an instance of {@link SegmentationUpdateRecencyCriteriaByObj }
     * 
     */
    public SegmentationUpdateRecencyCriteriaByObj createSegmentationUpdateRecencyCriteriaByObj() {
        return new SegmentationUpdateRecencyCriteriaByObj();
    }

    /**
     * Create an instance of {@link UpdateSegmentByObjResponse }
     * 
     */
    public UpdateSegmentByObjResponse createUpdateSegmentByObjResponse() {
        return new UpdateSegmentByObjResponse();
    }

    /**
     * Create an instance of {@link CreateEmailMessageByObjResponse }
     * 
     */
    public CreateEmailMessageByObjResponse createCreateEmailMessageByObjResponse() {
        return new CreateEmailMessageByObjResponse();
    }

    /**
     * Create an instance of {@link DeleteBannerResponse }
     * 
     */
    public DeleteBannerResponse createDeleteBannerResponse() {
        return new DeleteBannerResponse();
    }

    /**
     * Create an instance of {@link CreateUpdateBannerLinkResponse }
     * 
     */
    public CreateUpdateBannerLinkResponse createCreateUpdateBannerLinkResponse() {
        return new CreateUpdateBannerLinkResponse();
    }

    /**
     * Create an instance of {@link CreateAndAddPersonalisedBannerLink }
     * 
     */
    public CreateAndAddPersonalisedBannerLink createCreateAndAddPersonalisedBannerLink() {
        return new CreateAndAddPersonalisedBannerLink();
    }

    /**
     * Create an instance of {@link TestCampaignByMember }
     * 
     */
    public TestCampaignByMember createTestCampaignByMember() {
        return new TestCampaignByMember();
    }

    /**
     * Create an instance of {@link GetLastBannersResponse }
     * 
     */
    public GetLastBannersResponse createGetLastBannersResponse() {
        return new GetLastBannersResponse();
    }

    /**
     * Create an instance of {@link CreateMirrorBannerLink }
     * 
     */
    public CreateMirrorBannerLink createCreateMirrorBannerLink() {
        return new CreateMirrorBannerLink();
    }

    /**
     * Create an instance of {@link CreateStandardBannerLinkResponse }
     * 
     */
    public CreateStandardBannerLinkResponse createCreateStandardBannerLinkResponse() {
        return new CreateStandardBannerLinkResponse();
    }

    /**
     * Create an instance of {@link SegmentationUpdateStringDemographicCriteriaByObj }
     * 
     */
    public SegmentationUpdateStringDemographicCriteriaByObj createSegmentationUpdateStringDemographicCriteriaByObj() {
        return new SegmentationUpdateStringDemographicCriteriaByObj();
    }

    /**
     * Create an instance of {@link CreateBannerByObjResponse }
     * 
     */
    public CreateBannerByObjResponse createCreateBannerByObjResponse() {
        return new CreateBannerByObjResponse();
    }

    /**
     * Create an instance of {@link UnpostCampaign }
     * 
     */
    public UnpostCampaign createUnpostCampaign() {
        return new UnpostCampaign();
    }

    /**
     * Create an instance of {@link OpenApiConnection }
     * 
     */
    public OpenApiConnection createOpenApiConnection() {
        return new OpenApiConnection();
    }

    /**
     * Create an instance of {@link GetCampaignReport }
     * 
     */
    public GetCampaignReport createGetCampaignReport() {
        return new GetCampaignReport();
    }

    /**
     * Create an instance of {@link ApiPartnerConnectionResult }
     * 
     */
    public ApiPartnerConnectionResult createApiPartnerConnectionResult() {
        return new ApiPartnerConnectionResult();
    }

    /**
     * Create an instance of {@link TrackBannerLinkByPosition }
     * 
     */
    public TrackBannerLinkByPosition createTrackBannerLinkByPosition() {
        return new TrackBannerLinkByPosition();
    }

    /**
     * Create an instance of {@link GetEmailMessagePreview }
     * 
     */
    public GetEmailMessagePreview createGetEmailMessagePreview() {
        return new GetEmailMessagePreview();
    }

    /**
     * Create an instance of {@link CreateStandardUrlResponse }
     * 
     */
    public CreateStandardUrlResponse createCreateStandardUrlResponse() {
        return new CreateStandardUrlResponse();
    }

    /**
     * Create an instance of {@link CreateStandardBannerLink }
     * 
     */
    public CreateStandardBannerLink createCreateStandardBannerLink() {
        return new CreateStandardBannerLink();
    }

    /**
     * Create an instance of {@link CreateBasicSegmentByObjResponse }
     * 
     */
    public CreateBasicSegmentByObjResponse createCreateBasicSegmentByObjResponse() {
        return new CreateBasicSegmentByObjResponse();
    }

    /**
     * Create an instance of {@link SegmentationUpdateSerieTrackableLinkCriteriaByObjResponse }
     * 
     */
    public SegmentationUpdateSerieTrackableLinkCriteriaByObjResponse createSegmentationUpdateSerieTrackableLinkCriteriaByObjResponse() {
        return new SegmentationUpdateSerieTrackableLinkCriteriaByObjResponse();
    }

    /**
     * Create an instance of {@link CreateCampaignByObj }
     * 
     */
    public CreateCampaignByObj createCreateCampaignByObj() {
        return new CreateCampaignByObj();
    }

    /**
     * Create an instance of {@link UpdateBannerByObjResponse }
     * 
     */
    public UpdateBannerByObjResponse createUpdateBannerByObjResponse() {
        return new UpdateBannerByObjResponse();
    }

    /**
     * Create an instance of {@link APIMessageSummary }
     * 
     */
    public APIMessageSummary createAPIMessageSummary() {
        return new APIMessageSummary();
    }

    /**
     * Create an instance of {@link ApiPersoFragCriteria }
     * 
     */
    public ApiPersoFragCriteria createApiPersoFragCriteria() {
        return new ApiPersoFragCriteria();
    }

    /**
     * Create an instance of {@link DistinctMembersCount }
     * 
     */
    public DistinctMembersCount createDistinctMembersCount() {
        return new DistinctMembersCount();
    }

    /**
     * Create an instance of {@link PauseCampaignResponse }
     * 
     */
    public PauseCampaignResponse createPauseCampaignResponse() {
        return new PauseCampaignResponse();
    }

    /**
     * Create an instance of {@link UnpostCampaignResponse }
     * 
     */
    public UnpostCampaignResponse createUnpostCampaignResponse() {
        return new UnpostCampaignResponse();
    }

    /**
     * Create an instance of {@link DeleteMailingList }
     * 
     */
    public DeleteMailingList createDeleteMailingList() {
        return new DeleteMailingList();
    }

    /**
     * Create an instance of {@link CreatePersonalisedUrlResponse }
     * 
     */
    public CreatePersonalisedUrlResponse createCreatePersonalisedUrlResponse() {
        return new CreatePersonalisedUrlResponse();
    }

    /**
     * Create an instance of {@link GetBannerPreview }
     * 
     */
    public GetBannerPreview createGetBannerPreview() {
        return new GetBannerPreview();
    }

    /**
     * Create an instance of {@link DeleteSegmentResponse }
     * 
     */
    public DeleteSegmentResponse createDeleteSegmentResponse() {
        return new DeleteSegmentResponse();
    }

    /**
     * Create an instance of {@link CreateEmailMessageByObj }
     * 
     */
    public CreateEmailMessageByObj createCreateEmailMessageByObj() {
        return new CreateEmailMessageByObj();
    }

    /**
     * Create an instance of {@link CreateAndAddStandardUrl }
     * 
     */
    public CreateAndAddStandardUrl createCreateAndAddStandardUrl() {
        return new CreateAndAddStandardUrl();
    }

    /**
     * Create an instance of {@link CloneBannerResponse }
     * 
     */
    public CloneBannerResponse createCloneBannerResponse() {
        return new CloneBannerResponse();
    }

    /**
     * Create an instance of {@link GetCampaignsByStatusResponse }
     * 
     */
    public GetCampaignsByStatusResponse createGetCampaignsByStatusResponse() {
        return new GetCampaignsByStatusResponse();
    }

    /**
     * Create an instance of {@link SegmentationUpdateRecencyCriteriaByObjResponse }
     * 
     */
    public SegmentationUpdateRecencyCriteriaByObjResponse createSegmentationUpdateRecencyCriteriaByObjResponse() {
        return new SegmentationUpdateRecencyCriteriaByObjResponse();
    }

    /**
     * Create an instance of {@link AddShareLinkResponse }
     * 
     */
    public AddShareLinkResponse createAddShareLinkResponse() {
        return new AddShareLinkResponse();
    }

    /**
     * Create an instance of {@link RemoveSegmentResponse }
     * 
     */
    public RemoveSegmentResponse createRemoveSegmentResponse() {
        return new RemoveSegmentResponse();
    }

    /**
     * Create an instance of {@link TestCampaignByMemberResponse }
     * 
     */
    public TestCampaignByMemberResponse createTestCampaignByMemberResponse() {
        return new TestCampaignByMemberResponse();
    }

    /**
     * Create an instance of {@link GetLastCampaignsResponse }
     * 
     */
    public GetLastCampaignsResponse createGetLastCampaignsResponse() {
        return new GetLastCampaignsResponse();
    }

    /**
     * Create an instance of {@link TrackAllLinksResponse }
     * 
     */
    public TrackAllLinksResponse createTrackAllLinksResponse() {
        return new TrackAllLinksResponse();
    }

    /**
     * Create an instance of {@link SegmentationCount }
     * 
     */
    public SegmentationCount createSegmentationCount() {
        return new SegmentationCount();
    }

    /**
     * Create an instance of {@link APISegmentSummary }
     * 
     */
    public APISegmentSummary createAPISegmentSummary() {
        return new APISegmentSummary();
    }

    /**
     * Create an instance of {@link APIMessageSearchCriteria }
     * 
     */
    public APIMessageSearchCriteria createAPIMessageSearchCriteria() {
        return new APIMessageSearchCriteria();
    }

    /**
     * Create an instance of {@link SegmentationUpdateCampaignTrackableLinkCriteriaByObjResponse }
     * 
     */
    public SegmentationUpdateCampaignTrackableLinkCriteriaByObjResponse createSegmentationUpdateCampaignTrackableLinkCriteriaByObjResponse() {
        return new SegmentationUpdateCampaignTrackableLinkCriteriaByObjResponse();
    }

    /**
     * Create an instance of {@link UnpauseCampaign }
     * 
     */
    public UnpauseCampaign createUnpauseCampaign() {
        return new UnpauseCampaign();
    }

    /**
     * Create an instance of {@link SegmentationAddNumericDemographicCriteriaByObjResponse }
     * 
     */
    public SegmentationAddNumericDemographicCriteriaByObjResponse createSegmentationAddNumericDemographicCriteriaByObjResponse() {
        return new SegmentationAddNumericDemographicCriteriaByObjResponse();
    }

    /**
     * Create an instance of {@link CreateSmsMessageByObjResponse }
     * 
     */
    public CreateSmsMessageByObjResponse createCreateSmsMessageByObjResponse() {
        return new CreateSmsMessageByObjResponse();
    }

    /**
     * Create an instance of {@link UpdateMailingListByObj }
     * 
     */
    public UpdateMailingListByObj createUpdateMailingListByObj() {
        return new UpdateMailingListByObj();
    }

    /**
     * Create an instance of {@link CreateActionBannerLinkResponse }
     * 
     */
    public CreateActionBannerLinkResponse createCreateActionBannerLinkResponse() {
        return new CreateActionBannerLinkResponse();
    }

    /**
     * Create an instance of {@link TestEmailMessageByMemberResponse }
     * 
     */
    public TestEmailMessageByMemberResponse createTestEmailMessageByMemberResponse() {
        return new TestEmailMessageByMemberResponse();
    }

    /**
     * Create an instance of {@link CreateMailingListByObjResponse }
     * 
     */
    public CreateMailingListByObjResponse createCreateMailingListByObjResponse() {
        return new CreateMailingListByObjResponse();
    }

    /**
     * Create an instance of {@link CreateCombinedSegmentResponse }
     * 
     */
    public CreateCombinedSegmentResponse createCreateCombinedSegmentResponse() {
        return new CreateCombinedSegmentResponse();
    }

    /**
     * Create an instance of {@link GetTestMemberResponse }
     * 
     */
    public GetTestMemberResponse createGetTestMemberResponse() {
        return new GetTestMemberResponse();
    }

    /**
     * Create an instance of {@link ApiRecencyCriteria }
     * 
     */
    public ApiRecencyCriteria createApiRecencyCriteria() {
        return new ApiRecencyCriteria();
    }

    /**
     * Create an instance of {@link GetMessageSummaryList }
     * 
     */
    public GetMessageSummaryList createGetMessageSummaryList() {
        return new GetMessageSummaryList();
    }

    /**
     * Create an instance of {@link GetSegmentResponse }
     * 
     */
    public GetSegmentResponse createGetSegmentResponse() {
        return new GetSegmentResponse();
    }

    /**
     * Create an instance of {@link APIBannerListOptions }
     * 
     */
    public APIBannerListOptions createAPIBannerListOptions() {
        return new APIBannerListOptions();
    }

    /**
     * Create an instance of {@link SegmentationCountResponse }
     * 
     */
    public SegmentationCountResponse createSegmentationCountResponse() {
        return new SegmentationCountResponse();
    }

    /**
     * Create an instance of {@link CreateMailingListResponse }
     * 
     */
    public CreateMailingListResponse createCreateMailingListResponse() {
        return new CreateMailingListResponse();
    }

    /**
     * Create an instance of {@link GetMailingListResponse }
     * 
     */
    public GetMailingListResponse createGetMailingListResponse() {
        return new GetMailingListResponse();
    }

    /**
     * Create an instance of {@link GetLastSmsMessagesResponse }
     * 
     */
    public GetLastSmsMessagesResponse createGetLastSmsMessagesResponse() {
        return new GetLastSmsMessagesResponse();
    }

    /**
     * Create an instance of {@link GetSmsMessagesByField }
     * 
     */
    public GetSmsMessagesByField createGetSmsMessagesByField() {
        return new GetSmsMessagesByField();
    }

    /**
     * Create an instance of {@link APICampaignSearchCriteria }
     * 
     */
    public APICampaignSearchCriteria createAPICampaignSearchCriteria() {
        return new APICampaignSearchCriteria();
    }

    /**
     * Create an instance of {@link UpdateUrlByFieldResponse }
     * 
     */
    public UpdateUrlByFieldResponse createUpdateUrlByFieldResponse() {
        return new UpdateUrlByFieldResponse();
    }

    /**
     * Create an instance of {@link CreateAndAddUpdateBannerLink }
     * 
     */
    public CreateAndAddUpdateBannerLink createCreateAndAddUpdateBannerLink() {
        return new CreateAndAddUpdateBannerLink();
    }

    /**
     * Create an instance of {@link ApiNumericDemographicCriteria }
     * 
     */
    public ApiNumericDemographicCriteria createApiNumericDemographicCriteria() {
        return new ApiNumericDemographicCriteria();
    }

    /**
     * Create an instance of {@link DeleteMessage }
     * 
     */
    public DeleteMessage createDeleteMessage() {
        return new DeleteMessage();
    }

    /**
     * Create an instance of {@link GetSmsMessagesByFieldResponse }
     * 
     */
    public GetSmsMessagesByFieldResponse createGetSmsMessagesByFieldResponse() {
        return new GetSmsMessagesByFieldResponse();
    }

    /**
     * Create an instance of {@link CreateAndAddStandardBannerLink }
     * 
     */
    public CreateAndAddStandardBannerLink createCreateAndAddStandardBannerLink() {
        return new CreateAndAddStandardBannerLink();
    }

    /**
     * Create an instance of {@link GetSmsMessagePreview }
     * 
     */
    public GetSmsMessagePreview createGetSmsMessagePreview() {
        return new GetSmsMessagePreview();
    }

    /**
     * Create an instance of {@link CreateAndAddUpdateUrl }
     * 
     */
    public CreateAndAddUpdateUrl createCreateAndAddUpdateUrl() {
        return new CreateAndAddUpdateUrl();
    }

    /**
     * Create an instance of {@link GetNotValidatedSenders }
     * 
     */
    public GetNotValidatedSenders createGetNotValidatedSenders() {
        return new GetNotValidatedSenders();
    }

    /**
     * Create an instance of {@link GetBannersByPeriod }
     * 
     */
    public GetBannersByPeriod createGetBannersByPeriod() {
        return new GetBannersByPeriod();
    }

    /**
     * Create an instance of {@link GetTestMember }
     * 
     */
    public GetTestMember createGetTestMember() {
        return new GetTestMember();
    }

    /**
     * Create an instance of {@link CreateCampaignWithAnalytics }
     * 
     */
    public CreateCampaignWithAnalytics createCreateCampaignWithAnalytics() {
        return new CreateCampaignWithAnalytics();
    }

    /**
     * Create an instance of {@link TrackAllBannerLinksResponse }
     * 
     */
    public TrackAllBannerLinksResponse createTrackAllBannerLinksResponse() {
        return new TrackAllBannerLinksResponse();
    }

    /**
     * Create an instance of {@link DeleteMessageResponse }
     * 
     */
    public DeleteMessageResponse createDeleteMessageResponse() {
        return new DeleteMessageResponse();
    }

    /**
     * Create an instance of {@link SegmentationAddDateDemographicCriteriaByObjResponse }
     * 
     */
    public SegmentationAddDateDemographicCriteriaByObjResponse createSegmentationAddDateDemographicCriteriaByObjResponse() {
        return new SegmentationAddDateDemographicCriteriaByObjResponse();
    }

    /**
     * Create an instance of {@link SegmentationDeleteCriteria }
     * 
     */
    public SegmentationDeleteCriteria createSegmentationDeleteCriteria() {
        return new SegmentationDeleteCriteria();
    }

    /**
     * Create an instance of {@link IsHtmlValid }
     * 
     */
    public IsHtmlValid createIsHtmlValid() {
        return new IsHtmlValid();
    }

    /**
     * Create an instance of {@link UntrackAllLinksResponse }
     * 
     */
    public UntrackAllLinksResponse createUntrackAllLinksResponse() {
        return new UntrackAllLinksResponse();
    }

    /**
     * Create an instance of {@link SegmentationUpdateDateDemographicCriteriaByObj }
     * 
     */
    public SegmentationUpdateDateDemographicCriteriaByObj createSegmentationUpdateDateDemographicCriteriaByObj() {
        return new SegmentationUpdateDateDemographicCriteriaByObj();
    }

    /**
     * Create an instance of {@link APIBannerListOptions.SortOptions }
     * 
     */
    public APIBannerListOptions.SortOptions createAPIBannerListOptionsSortOptions() {
        return new APIBannerListOptions.SortOptions();
    }

    /**
     * Create an instance of {@link Member }
     * 
     */
    public Member createMember() {
        return new Member();
    }

    /**
     * Create an instance of {@link CreateSQLSegment }
     * 
     */
    public CreateSQLSegment createCreateSQLSegment() {
        return new CreateSQLSegment();
    }

    /**
     * Create an instance of {@link AddTestMemberResponse }
     * 
     */
    public AddTestMemberResponse createAddTestMemberResponse() {
        return new AddTestMemberResponse();
    }

    /**
     * Create an instance of {@link SegmentationUpdateCampaignActionCriteriaByObjResponse }
     * 
     */
    public SegmentationUpdateCampaignActionCriteriaByObjResponse createSegmentationUpdateCampaignActionCriteriaByObjResponse() {
        return new SegmentationUpdateCampaignActionCriteriaByObjResponse();
    }

    /**
     * Create an instance of {@link ApiUrl }
     * 
     */
    public ApiUrl createApiUrl() {
        return new ApiUrl();
    }

    /**
     * Create an instance of {@link ApiActionCriteria }
     * 
     */
    public ApiActionCriteria createApiActionCriteria() {
        return new ApiActionCriteria();
    }

    /**
     * Create an instance of {@link GetTestGroupResponse }
     * 
     */
    public GetTestGroupResponse createGetTestGroupResponse() {
        return new GetTestGroupResponse();
    }

    /**
     * Create an instance of {@link GetMailingListsByField }
     * 
     */
    public GetMailingListsByField createGetMailingListsByField() {
        return new GetMailingListsByField();
    }

    /**
     * Create an instance of {@link CloneMailingList }
     * 
     */
    public CloneMailingList createCloneMailingList() {
        return new CloneMailingList();
    }

    /**
     * Create an instance of {@link SegmentationUpdateSegment }
     * 
     */
    public SegmentationUpdateSegment createSegmentationUpdateSegment() {
        return new SegmentationUpdateSegment();
    }

    /**
     * Create an instance of {@link CreateAndAddMirrorUrl }
     * 
     */
    public CreateAndAddMirrorUrl createCreateAndAddMirrorUrl() {
        return new CreateAndAddMirrorUrl();
    }

    /**
     * Create an instance of {@link CreateEmailMessageResponse }
     * 
     */
    public CreateEmailMessageResponse createCreateEmailMessageResponse() {
        return new CreateEmailMessageResponse();
    }

    /**
     * Create an instance of {@link ApiCampaignSnapshot }
     * 
     */
    public ApiCampaignSnapshot createApiCampaignSnapshot() {
        return new ApiCampaignSnapshot();
    }

    /**
     * Create an instance of {@link CloneMessage }
     * 
     */
    public CloneMessage createCloneMessage() {
        return new CloneMessage();
    }

    /**
     * Create an instance of {@link GetTestMembers }
     * 
     */
    public GetTestMembers createGetTestMembers() {
        return new GetTestMembers();
    }

    /**
     * Create an instance of {@link CreateStandardUrl }
     * 
     */
    public CreateStandardUrl createCreateStandardUrl() {
        return new CreateStandardUrl();
    }

    /**
     * Create an instance of {@link APIMessageListOptions }
     * 
     */
    public APIMessageListOptions createAPIMessageListOptions() {
        return new APIMessageListOptions();
    }

    /**
     * Create an instance of {@link ApiMailingList }
     * 
     */
    public ApiMailingList createApiMailingList() {
        return new ApiMailingList();
    }

    /**
     * Create an instance of {@link GetMessageResponse }
     * 
     */
    public GetMessageResponse createGetMessageResponse() {
        return new GetMessageResponse();
    }

    /**
     * Create an instance of {@link CreateCombinedSegment }
     * 
     */
    public CreateCombinedSegment createCreateCombinedSegment() {
        return new CreateCombinedSegment();
    }

    /**
     * Create an instance of {@link CreateMirrorBannerLinkResponse }
     * 
     */
    public CreateMirrorBannerLinkResponse createCreateMirrorBannerLinkResponse() {
        return new CreateMirrorBannerLinkResponse();
    }

    /**
     * Create an instance of {@link SegmentationAddStringDemographicCriteriaByObjResponse }
     * 
     */
    public SegmentationAddStringDemographicCriteriaByObjResponse createSegmentationAddStringDemographicCriteriaByObjResponse() {
        return new SegmentationAddStringDemographicCriteriaByObjResponse();
    }

    /**
     * Create an instance of {@link APIMessageSummaryList.MessageSummaryList }
     * 
     */
    public APIMessageSummaryList.MessageSummaryList createAPIMessageSummaryListMessageSummaryList() {
        return new APIMessageSummaryList.MessageSummaryList();
    }

    /**
     * Create an instance of {@link GetCampaignSummaryList }
     * 
     */
    public GetCampaignSummaryList createGetCampaignSummaryList() {
        return new GetCampaignSummaryList();
    }

    /**
     * Create an instance of {@link UpdateBannerLinkByField }
     * 
     */
    public UpdateBannerLinkByField createUpdateBannerLinkByField() {
        return new UpdateBannerLinkByField();
    }

    /**
     * Create an instance of {@link GetAllUnusedBannerTrackedLinksResponse }
     * 
     */
    public GetAllUnusedBannerTrackedLinksResponse createGetAllUnusedBannerTrackedLinksResponse() {
        return new GetAllUnusedBannerTrackedLinksResponse();
    }

    /**
     * Create an instance of {@link GetCampaignsByField }
     * 
     */
    public GetCampaignsByField createGetCampaignsByField() {
        return new GetCampaignsByField();
    }

    /**
     * Create an instance of {@link APISegmentSummaryList }
     * 
     */
    public APISegmentSummaryList createAPISegmentSummaryList() {
        return new APISegmentSummaryList();
    }

    /**
     * Create an instance of {@link GetEmailMessagesByFieldResponse }
     * 
     */
    public GetEmailMessagesByFieldResponse createGetEmailMessagesByFieldResponse() {
        return new GetEmailMessagesByFieldResponse();
    }

    /**
     * Create an instance of {@link ApiTrackableLinkCriteria }
     * 
     */
    public ApiTrackableLinkCriteria createApiTrackableLinkCriteria() {
        return new ApiTrackableLinkCriteria();
    }

    /**
     * Create an instance of {@link GetValidatedAltSendersResponse }
     * 
     */
    public GetValidatedAltSendersResponse createGetValidatedAltSendersResponse() {
        return new GetValidatedAltSendersResponse();
    }

    /**
     * Create an instance of {@link UntrackBannerLinkByOrder }
     * 
     */
    public UntrackBannerLinkByOrder createUntrackBannerLinkByOrder() {
        return new UntrackBannerLinkByOrder();
    }

    /**
     * Create an instance of {@link APICampaignSummary.SegmentIds }
     * 
     */
    public APICampaignSummary.SegmentIds createAPICampaignSummarySegmentIds() {
        return new APICampaignSummary.SegmentIds();
    }

    /**
     * Create an instance of {@link CreateCampaignByObjResponse }
     * 
     */
    public CreateCampaignByObjResponse createCreateCampaignByObjResponse() {
        return new CreateCampaignByObjResponse();
    }

    /**
     * Create an instance of {@link SegmentationAddSocialNetworkCriteriaByObj }
     * 
     */
    public SegmentationAddSocialNetworkCriteriaByObj createSegmentationAddSocialNetworkCriteriaByObj() {
        return new SegmentationAddSocialNetworkCriteriaByObj();
    }

    /**
     * Create an instance of {@link UntrackBannerLinkByOrderResponse }
     * 
     */
    public UntrackBannerLinkByOrderResponse createUntrackBannerLinkByOrderResponse() {
        return new UntrackBannerLinkByOrderResponse();
    }

    /**
     * Create an instance of {@link GetEmailMessagePreviewResponse }
     * 
     */
    public GetEmailMessagePreviewResponse createGetEmailMessagePreviewResponse() {
        return new GetEmailMessagePreviewResponse();
    }

    /**
     * Create an instance of {@link OpenApiConnectionResponse }
     * 
     */
    public OpenApiConnectionResponse createOpenApiConnectionResponse() {
        return new OpenApiConnectionResponse();
    }

    /**
     * Create an instance of {@link CreateTestMemberResponse }
     * 
     */
    public CreateTestMemberResponse createCreateTestMemberResponse() {
        return new CreateTestMemberResponse();
    }

    /**
     * Create an instance of {@link GetCampaignStatus }
     * 
     */
    public GetCampaignStatus createGetCampaignStatus() {
        return new GetCampaignStatus();
    }

    /**
     * Create an instance of {@link UpdateCampaignByObjResponse }
     * 
     */
    public UpdateCampaignByObjResponse createUpdateCampaignByObjResponse() {
        return new UpdateCampaignByObjResponse();
    }

    /**
     * Create an instance of {@link GetLastSmsMessages }
     * 
     */
    public GetLastSmsMessages createGetLastSmsMessages() {
        return new GetLastSmsMessages();
    }

    /**
     * Create an instance of {@link AddTestMember }
     * 
     */
    public AddTestMember createAddTestMember() {
        return new AddTestMember();
    }

    /**
     * Create an instance of {@link CreateTestGroupResponse }
     * 
     */
    public CreateTestGroupResponse createCreateTestGroupResponse() {
        return new CreateTestGroupResponse();
    }

    /**
     * Create an instance of {@link DeleteTestMember }
     * 
     */
    public DeleteTestMember createDeleteTestMember() {
        return new DeleteTestMember();
    }

    /**
     * Create an instance of {@link DeleteUrl }
     * 
     */
    public DeleteUrl createDeleteUrl() {
        return new DeleteUrl();
    }

    /**
     * Create an instance of {@link GetValidatedAltSenders }
     * 
     */
    public GetValidatedAltSenders createGetValidatedAltSenders() {
        return new GetValidatedAltSenders();
    }

    /**
     * Create an instance of {@link SegmentationUpdateDataMartCriteriaByObj }
     * 
     */
    public SegmentationUpdateDataMartCriteriaByObj createSegmentationUpdateDataMartCriteriaByObj() {
        return new SegmentationUpdateDataMartCriteriaByObj();
    }

    /**
     * Create an instance of {@link GetAllBannerTrackedLinks }
     * 
     */
    public GetAllBannerTrackedLinks createGetAllBannerTrackedLinks() {
        return new GetAllBannerTrackedLinks();
    }

    /**
     * Create an instance of {@link SegmentationGetPersoFragListResponse }
     * 
     */
    public SegmentationGetPersoFragListResponse createSegmentationGetPersoFragListResponse() {
        return new SegmentationGetPersoFragListResponse();
    }

    /**
     * Create an instance of {@link APICampaignListOptions }
     * 
     */
    public APICampaignListOptions createAPICampaignListOptions() {
        return new APICampaignListOptions();
    }

    /**
     * Create an instance of {@link SegmentationGetSegmentListResponse }
     * 
     */
    public SegmentationGetSegmentListResponse createSegmentationGetSegmentListResponse() {
        return new SegmentationGetSegmentListResponse();
    }

    /**
     * Create an instance of {@link ApiSegments }
     * 
     */
    public ApiSegments createApiSegments() {
        return new ApiSegments();
    }

    /**
     * Create an instance of {@link SegmentationGetPersoFragList }
     * 
     */
    public SegmentationGetPersoFragList createSegmentationGetPersoFragList() {
        return new SegmentationGetPersoFragList();
    }

    /**
     * Create an instance of {@link GetClientTestGroupsResponse }
     * 
     */
    public GetClientTestGroupsResponse createGetClientTestGroupsResponse() {
        return new GetClientTestGroupsResponse();
    }

    /**
     * Create an instance of {@link CreateTestGroupByObjResponse }
     * 
     */
    public CreateTestGroupByObjResponse createCreateTestGroupByObjResponse() {
        return new CreateTestGroupByObjResponse();
    }

    /**
     * Create an instance of {@link ApiTestGroup }
     * 
     */
    public ApiTestGroup createApiTestGroup() {
        return new ApiTestGroup();
    }

    /**
     * Create an instance of {@link CreateAndAddPersonalisedUrlResponse }
     * 
     */
    public CreateAndAddPersonalisedUrlResponse createCreateAndAddPersonalisedUrlResponse() {
        return new CreateAndAddPersonalisedUrlResponse();
    }

    /**
     * Create an instance of {@link TestEmailMessageByMember }
     * 
     */
    public TestEmailMessageByMember createTestEmailMessageByMember() {
        return new TestEmailMessageByMember();
    }

    /**
     * Create an instance of {@link UntrackLinkByOrderResponse }
     * 
     */
    public UntrackLinkByOrderResponse createUntrackLinkByOrderResponse() {
        return new UntrackLinkByOrderResponse();
    }

    /**
     * Create an instance of {@link IsHtmlValidResponse }
     * 
     */
    public IsHtmlValidResponse createIsHtmlValidResponse() {
        return new IsHtmlValidResponse();
    }

    /**
     * Create an instance of {@link APIMessageSortOption }
     * 
     */
    public APIMessageSortOption createAPIMessageSortOption() {
        return new APIMessageSortOption();
    }

    /**
     * Create an instance of {@link GetLastCampaigns }
     * 
     */
    public GetLastCampaigns createGetLastCampaigns() {
        return new GetLastCampaigns();
    }

    /**
     * Create an instance of {@link SegmentationAddDataMartCriteriaByObj }
     * 
     */
    public SegmentationAddDataMartCriteriaByObj createSegmentationAddDataMartCriteriaByObj() {
        return new SegmentationAddDataMartCriteriaByObj();
    }

    /**
     * Create an instance of {@link CreatePersonalisedBannerLink }
     * 
     */
    public CreatePersonalisedBannerLink createCreatePersonalisedBannerLink() {
        return new CreatePersonalisedBannerLink();
    }

    /**
     * Create an instance of {@link CreateSmsMessageByObj }
     * 
     */
    public CreateSmsMessageByObj createCreateSmsMessageByObj() {
        return new CreateSmsMessageByObj();
    }

    /**
     * Create an instance of {@link CreateBannerResponse }
     * 
     */
    public CreateBannerResponse createCreateBannerResponse() {
        return new CreateBannerResponse();
    }

    /**
     * Create an instance of {@link GetAllBannerTrackableLinks }
     * 
     */
    public GetAllBannerTrackableLinks createGetAllBannerTrackableLinks() {
        return new GetAllBannerTrackableLinks();
    }

    /**
     * Create an instance of {@link TrackBannerLinkByPositionResponse }
     * 
     */
    public TrackBannerLinkByPositionResponse createTrackBannerLinkByPositionResponse() {
        return new TrackBannerLinkByPositionResponse();
    }

    /**
     * Create an instance of {@link DeleteTestMemberResponse }
     * 
     */
    public DeleteTestMemberResponse createDeleteTestMemberResponse() {
        return new DeleteTestMemberResponse();
    }

    /**
     * Create an instance of {@link GetSegment }
     * 
     */
    public GetSegment createGetSegment() {
        return new GetSegment();
    }

    /**
     * Create an instance of {@link CreateUpdateBannerLink }
     * 
     */
    public CreateUpdateBannerLink createCreateUpdateBannerLink() {
        return new CreateUpdateBannerLink();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAndAddPersonalisedBannerLinkResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "createAndAddPersonalisedBannerLinkResponse")
    public JAXBElement<CreateAndAddPersonalisedBannerLinkResponse> createCreateAndAddPersonalisedBannerLinkResponse(CreateAndAddPersonalisedBannerLinkResponse value) {
        return new JAXBElement<CreateAndAddPersonalisedBannerLinkResponse>(_CreateAndAddPersonalisedBannerLinkResponse_QNAME, CreateAndAddPersonalisedBannerLinkResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SegmentationUpdateStringDemographicCriteriaByObjResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "segmentationUpdateStringDemographicCriteriaByObjResponse")
    public JAXBElement<SegmentationUpdateStringDemographicCriteriaByObjResponse> createSegmentationUpdateStringDemographicCriteriaByObjResponse(SegmentationUpdateStringDemographicCriteriaByObjResponse value) {
        return new JAXBElement<SegmentationUpdateStringDemographicCriteriaByObjResponse>(_SegmentationUpdateStringDemographicCriteriaByObjResponse_QNAME, SegmentationUpdateStringDemographicCriteriaByObjResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateBanner }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "createBanner")
    public JAXBElement<CreateBanner> createCreateBanner(CreateBanner value) {
        return new JAXBElement<CreateBanner>(_CreateBanner_QNAME, CreateBanner.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCampaignReport }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "getCampaignReport")
    public JAXBElement<GetCampaignReport> createGetCampaignReport(GetCampaignReport value) {
        return new JAXBElement<GetCampaignReport>(_GetCampaignReport_QNAME, GetCampaignReport.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateMailingListByObj }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "createMailingListByObj")
    public JAXBElement<CreateMailingListByObj> createCreateMailingListByObj(CreateMailingListByObj value) {
        return new JAXBElement<CreateMailingListByObj>(_CreateMailingListByObj_QNAME, CreateMailingListByObj.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SegmentationAddCampaignTrackableLinkCriteriaByObj }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "segmentationAddCampaignTrackableLinkCriteriaByObj")
    public JAXBElement<SegmentationAddCampaignTrackableLinkCriteriaByObj> createSegmentationAddCampaignTrackableLinkCriteriaByObj(SegmentationAddCampaignTrackableLinkCriteriaByObj value) {
        return new JAXBElement<SegmentationAddCampaignTrackableLinkCriteriaByObj>(_SegmentationAddCampaignTrackableLinkCriteriaByObj_QNAME, SegmentationAddCampaignTrackableLinkCriteriaByObj.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMailingListsByPeriod }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "getMailingListsByPeriod")
    public JAXBElement<GetMailingListsByPeriod> createGetMailingListsByPeriod(GetMailingListsByPeriod value) {
        return new JAXBElement<GetMailingListsByPeriod>(_GetMailingListsByPeriod_QNAME, GetMailingListsByPeriod.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateUnsubscribeUrlResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "createUnsubscribeUrlResponse")
    public JAXBElement<CreateUnsubscribeUrlResponse> createCreateUnsubscribeUrlResponse(CreateUnsubscribeUrlResponse value) {
        return new JAXBElement<CreateUnsubscribeUrlResponse>(_CreateUnsubscribeUrlResponse_QNAME, CreateUnsubscribeUrlResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLastEmailMessagesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "getLastEmailMessagesResponse")
    public JAXBElement<GetLastEmailMessagesResponse> createGetLastEmailMessagesResponse(GetLastEmailMessagesResponse value) {
        return new JAXBElement<GetLastEmailMessagesResponse>(_GetLastEmailMessagesResponse_QNAME, GetLastEmailMessagesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateMessageByObjResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "updateMessageByObjResponse")
    public JAXBElement<UpdateMessageByObjResponse> createUpdateMessageByObjResponse(UpdateMessageByObjResponse value) {
        return new JAXBElement<UpdateMessageByObjResponse>(_UpdateMessageByObjResponse_QNAME, UpdateMessageByObjResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePersonalisedUrl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "createPersonalisedUrl")
    public JAXBElement<CreatePersonalisedUrl> createCreatePersonalisedUrl(CreatePersonalisedUrl value) {
        return new JAXBElement<CreatePersonalisedUrl>(_CreatePersonalisedUrl_QNAME, CreatePersonalisedUrl.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApiPersoFragCriteria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "persoFragCriteria")
    public JAXBElement<ApiPersoFragCriteria> createPersoFragCriteria(ApiPersoFragCriteria value) {
        return new JAXBElement<ApiPersoFragCriteria>(_PersoFragCriteria_QNAME, ApiPersoFragCriteria.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePersonalisedBannerLink }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "createPersonalisedBannerLink")
    public JAXBElement<CreatePersonalisedBannerLink> createCreatePersonalisedBannerLink(CreatePersonalisedBannerLink value) {
        return new JAXBElement<CreatePersonalisedBannerLink>(_CreatePersonalisedBannerLink_QNAME, CreatePersonalisedBannerLink.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestEmailMessageByGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "testEmailMessageByGroup")
    public JAXBElement<TestEmailMessageByGroup> createTestEmailMessageByGroup(TestEmailMessageByGroup value) {
        return new JAXBElement<TestEmailMessageByGroup>(_TestEmailMessageByGroup_QNAME, TestEmailMessageByGroup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestEmailMessageByMember }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "testEmailMessageByMember")
    public JAXBElement<TestEmailMessageByMember> createTestEmailMessageByMember(TestEmailMessageByMember value) {
        return new JAXBElement<TestEmailMessageByMember>(_TestEmailMessageByMember_QNAME, TestEmailMessageByMember.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTestMembers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "getTestMembers")
    public JAXBElement<GetTestMembers> createGetTestMembers(GetTestMembers value) {
        return new JAXBElement<GetTestMembers>(_GetTestMembers_QNAME, GetTestMembers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSmsMessagesByFieldResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "getSmsMessagesByFieldResponse")
    public JAXBElement<GetSmsMessagesByFieldResponse> createGetSmsMessagesByFieldResponse(GetSmsMessagesByFieldResponse value) {
        return new JAXBElement<GetSmsMessagesByFieldResponse>(_GetSmsMessagesByFieldResponse_QNAME, GetSmsMessagesByFieldResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SegmentationAddCampaignActionCriteriaByObjResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "segmentationAddCampaignActionCriteriaByObjResponse")
    public JAXBElement<SegmentationAddCampaignActionCriteriaByObjResponse> createSegmentationAddCampaignActionCriteriaByObjResponse(SegmentationAddCampaignActionCriteriaByObjResponse value) {
        return new JAXBElement<SegmentationAddCampaignActionCriteriaByObjResponse>(_SegmentationAddCampaignActionCriteriaByObjResponse_QNAME, SegmentationAddCampaignActionCriteriaByObjResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApiDateDemographicCriteria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "dateDemographicCriteria")
    public JAXBElement<ApiDateDemographicCriteria> createDateDemographicCriteria(ApiDateDemographicCriteria value) {
        return new JAXBElement<ApiDateDemographicCriteria>(_DateDemographicCriteria_QNAME, ApiDateDemographicCriteria.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateUpdateBannerLinkResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "createUpdateBannerLinkResponse")
    public JAXBElement<CreateUpdateBannerLinkResponse> createCreateUpdateBannerLinkResponse(CreateUpdateBannerLinkResponse value) {
        return new JAXBElement<CreateUpdateBannerLinkResponse>(_CreateUpdateBannerLinkResponse_QNAME, CreateUpdateBannerLinkResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveSegmentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "removeSegmentResponse")
    public JAXBElement<RemoveSegmentResponse> createRemoveSegmentResponse(RemoveSegmentResponse value) {
        return new JAXBElement<RemoveSegmentResponse>(_RemoveSegmentResponse_QNAME, RemoveSegmentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SegmentationDeleteCriteria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "segmentationDeleteCriteria")
    public JAXBElement<SegmentationDeleteCriteria> createSegmentationDeleteCriteria(SegmentationDeleteCriteria value) {
        return new JAXBElement<SegmentationDeleteCriteria>(_SegmentationDeleteCriteria_QNAME, SegmentationDeleteCriteria.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "sortOption")
    public JAXBElement<Object> createSortOption(Object value) {
        return new JAXBElement<Object>(_SortOption_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateMailingListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "createMailingListResponse")
    public JAXBElement<CreateMailingListResponse> createCreateMailingListResponse(CreateMailingListResponse value) {
        return new JAXBElement<CreateMailingListResponse>(_CreateMailingListResponse_QNAME, CreateMailingListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddSegment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "addSegment")
    public JAXBElement<AddSegment> createAddSegment(AddSegment value) {
        return new JAXBElement<AddSegment>(_AddSegment_QNAME, AddSegment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateSmsMessageByObj }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "createSmsMessageByObj")
    public JAXBElement<CreateSmsMessageByObj> createCreateSmsMessageByObj(CreateSmsMessageByObj value) {
        return new JAXBElement<CreateSmsMessageByObj>(_CreateSmsMessageByObj_QNAME, CreateSmsMessageByObj.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestCampaignByGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "testCampaignByGroup")
    public JAXBElement<TestCampaignByGroup> createTestCampaignByGroup(TestCampaignByGroup value) {
        return new JAXBElement<TestCampaignByGroup>(_TestCampaignByGroup_QNAME, TestCampaignByGroup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SegmentationGetPersoFragListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "segmentationGetPersoFragListResponse")
    public JAXBElement<SegmentationGetPersoFragListResponse> createSegmentationGetPersoFragListResponse(SegmentationGetPersoFragListResponse value) {
        return new JAXBElement<SegmentationGetPersoFragListResponse>(_SegmentationGetPersoFragListResponse_QNAME, SegmentationGetPersoFragListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCampaign }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "deleteCampaign")
    public JAXBElement<DeleteCampaign> createDeleteCampaign(DeleteCampaign value) {
        return new JAXBElement<DeleteCampaign>(_DeleteCampaign_QNAME, DeleteCampaign.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllUnusedBannerTrackedLinks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "getAllUnusedBannerTrackedLinks")
    public JAXBElement<GetAllUnusedBannerTrackedLinks> createGetAllUnusedBannerTrackedLinks(GetAllUnusedBannerTrackedLinks value) {
        return new JAXBElement<GetAllUnusedBannerTrackedLinks>(_GetAllUnusedBannerTrackedLinks_QNAME, GetAllUnusedBannerTrackedLinks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmailMessagePreview }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "getEmailMessagePreview")
    public JAXBElement<GetEmailMessagePreview> createGetEmailMessagePreview(GetEmailMessagePreview value) {
        return new JAXBElement<GetEmailMessagePreview>(_GetEmailMessagePreview_QNAME, GetEmailMessagePreview.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteTestGroupResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "deleteTestGroupResponse")
    public JAXBElement<DeleteTestGroupResponse> createDeleteTestGroupResponse(DeleteTestGroupResponse value) {
        return new JAXBElement<DeleteTestGroupResponse>(_DeleteTestGroupResponse_QNAME, DeleteTestGroupResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteMailingListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "deleteMailingListResponse")
    public JAXBElement<DeleteMailingListResponse> createDeleteMailingListResponse(DeleteMailingListResponse value) {
        return new JAXBElement<DeleteMailingListResponse>(_DeleteMailingListResponse_QNAME, DeleteMailingListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSegmentSummaryList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "getSegmentSummaryList")
    public JAXBElement<GetSegmentSummaryList> createGetSegmentSummaryList(GetSegmentSummaryList value) {
        return new JAXBElement<GetSegmentSummaryList>(_GetSegmentSummaryList_QNAME, GetSegmentSummaryList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApiMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "message")
    public JAXBElement<ApiMessage> createMessage(ApiMessage value) {
        return new JAXBElement<ApiMessage>(_Message_QNAME, ApiMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAndAddActionUrlResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "createAndAddActionUrlResponse")
    public JAXBElement<CreateAndAddActionUrlResponse> createCreateAndAddActionUrlResponse(CreateAndAddActionUrlResponse value) {
        return new JAXBElement<CreateAndAddActionUrlResponse>(_CreateAndAddActionUrlResponse_QNAME, CreateAndAddActionUrlResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCampaignSnapshotResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "getCampaignSnapshotResponse")
    public JAXBElement<GetCampaignSnapshotResponse> createGetCampaignSnapshotResponse(GetCampaignSnapshotResponse value) {
        return new JAXBElement<GetCampaignSnapshotResponse>(_GetCampaignSnapshotResponse_QNAME, GetCampaignSnapshotResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CloneMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "cloneMessage")
    public JAXBElement<CloneMessage> createCloneMessage(CloneMessage value) {
        return new JAXBElement<CloneMessage>(_CloneMessage_QNAME, CloneMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CloneBannerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "cloneBannerResponse")
    public JAXBElement<CloneBannerResponse> createCloneBannerResponse(CloneBannerResponse value) {
        return new JAXBElement<CloneBannerResponse>(_CloneBannerResponse_QNAME, CloneBannerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSegmentSummaryListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "getSegmentSummaryListResponse")
    public JAXBElement<GetSegmentSummaryListResponse> createGetSegmentSummaryListResponse(GetSegmentSummaryListResponse value) {
        return new JAXBElement<GetSegmentSummaryListResponse>(_GetSegmentSummaryListResponse_QNAME, GetSegmentSummaryListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateMirrorUrl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "createMirrorUrl")
    public JAXBElement<CreateMirrorUrl> createCreateMirrorUrl(CreateMirrorUrl value) {
        return new JAXBElement<CreateMirrorUrl>(_CreateMirrorUrl_QNAME, CreateMirrorUrl.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBannerPreview }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "getBannerPreview")
    public JAXBElement<GetBannerPreview> createGetBannerPreview(GetBannerPreview value) {
        return new JAXBElement<GetBannerPreview>(_GetBannerPreview_QNAME, GetBannerPreview.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDefaultSenderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "getDefaultSenderResponse")
    public JAXBElement<GetDefaultSenderResponse> createGetDefaultSenderResponse(GetDefaultSenderResponse value) {
        return new JAXBElement<GetDefaultSenderResponse>(_GetDefaultSenderResponse_QNAME, GetDefaultSenderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "getMessage")
    public JAXBElement<GetMessage> createGetMessage(GetMessage value) {
        return new JAXBElement<GetMessage>(_GetMessage_QNAME, GetMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateMailingList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "createMailingList")
    public JAXBElement<CreateMailingList> createCreateMailingList(CreateMailingList value) {
        return new JAXBElement<CreateMailingList>(_CreateMailingList_QNAME, CreateMailingList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpenApiConnection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "openApiConnection")
    public JAXBElement<OpenApiConnection> createOpenApiConnection(OpenApiConnection value) {
        return new JAXBElement<OpenApiConnection>(_OpenApiConnection_QNAME, OpenApiConnection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MailingListDistinctCount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "mailingListDistinctCount")
    public JAXBElement<MailingListDistinctCount> createMailingListDistinctCount(MailingListDistinctCount value) {
        return new JAXBElement<MailingListDistinctCount>(_MailingListDistinctCount_QNAME, MailingListDistinctCount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLastEmailMessages }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "getLastEmailMessages")
    public JAXBElement<GetLastEmailMessages> createGetLastEmailMessages(GetLastEmailMessages value) {
        return new JAXBElement<GetLastEmailMessages>(_GetLastEmailMessages_QNAME, GetLastEmailMessages.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SegmentationUpdateSerieTrackableLinkCriteriaByObjResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "segmentationUpdateSerieTrackableLinkCriteriaByObjResponse")
    public JAXBElement<SegmentationUpdateSerieTrackableLinkCriteriaByObjResponse> createSegmentationUpdateSerieTrackableLinkCriteriaByObjResponse(SegmentationUpdateSerieTrackableLinkCriteriaByObjResponse value) {
        return new JAXBElement<SegmentationUpdateSerieTrackableLinkCriteriaByObjResponse>(_SegmentationUpdateSerieTrackableLinkCriteriaByObjResponse_QNAME, SegmentationUpdateSerieTrackableLinkCriteriaByObjResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCampaignSummaryList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "getCampaignSummaryList")
    public JAXBElement<GetCampaignSummaryList> createGetCampaignSummaryList(GetCampaignSummaryList value) {
        return new JAXBElement<GetCampaignSummaryList>(_GetCampaignSummaryList_QNAME, GetCampaignSummaryList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateUnsubscribeUrl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "createUnsubscribeUrl")
    public JAXBElement<CreateUnsubscribeUrl> createCreateUnsubscribeUrl(CreateUnsubscribeUrl value) {
        return new JAXBElement<CreateUnsubscribeUrl>(_CreateUnsubscribeUrl_QNAME, CreateUnsubscribeUrl.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "search")
    public JAXBElement<Object> createSearch(Object value) {
        return new JAXBElement<Object>(_Search_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMessagesByPeriodResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "getMessagesByPeriodResponse")
    public JAXBElement<GetMessagesByPeriodResponse> createGetMessagesByPeriodResponse(GetMessagesByPeriodResponse value) {
        return new JAXBElement<GetMessagesByPeriodResponse>(_GetMessagesByPeriodResponse_QNAME, GetMessagesByPeriodResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UntrackAllLinksResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "untrackAllLinksResponse")
    public JAXBElement<UntrackAllLinksResponse> createUntrackAllLinksResponse(UntrackAllLinksResponse value) {
        return new JAXBElement<UntrackAllLinksResponse>(_UntrackAllLinksResponse_QNAME, UntrackAllLinksResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApiNumericDemographicCriteria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "numericDemographicCriteria")
    public JAXBElement<ApiNumericDemographicCriteria> createNumericDemographicCriteria(ApiNumericDemographicCriteria value) {
        return new JAXBElement<ApiNumericDemographicCriteria>(_NumericDemographicCriteria_QNAME, ApiNumericDemographicCriteria.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateBannerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "createBannerResponse")
    public JAXBElement<CreateBannerResponse> createCreateBannerResponse(CreateBannerResponse value) {
        return new JAXBElement<CreateBannerResponse>(_CreateBannerResponse_QNAME, CreateBannerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllUnusedBannerTrackedLinksResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "getAllUnusedBannerTrackedLinksResponse")
    public JAXBElement<GetAllUnusedBannerTrackedLinksResponse> createGetAllUnusedBannerTrackedLinksResponse(GetAllUnusedBannerTrackedLinksResponse value) {
        return new JAXBElement<GetAllUnusedBannerTrackedLinksResponse>(_GetAllUnusedBannerTrackedLinksResponse_QNAME, GetAllUnusedBannerTrackedLinksResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestCampaignByGroupResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "testCampaignByGroupResponse")
    public JAXBElement<TestCampaignByGroupResponse> createTestCampaignByGroupResponse(TestCampaignByGroupResponse value) {
        return new JAXBElement<TestCampaignByGroupResponse>(_TestCampaignByGroupResponse_QNAME, TestCampaignByGroupResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCampaignsByField }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "getCampaignsByField")
    public JAXBElement<GetCampaignsByField> createGetCampaignsByField(GetCampaignsByField value) {
        return new JAXBElement<GetCampaignsByField>(_GetCampaignsByField_QNAME, GetCampaignsByField.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MailingListDistinctCountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "mailingListDistinctCountResponse")
    public JAXBElement<MailingListDistinctCountResponse> createMailingListDistinctCountResponse(MailingListDistinctCountResponse value) {
        return new JAXBElement<MailingListDistinctCountResponse>(_MailingListDistinctCountResponse_QNAME, MailingListDistinctCountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMailingList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "getMailingList")
    public JAXBElement<GetMailingList> createGetMailingList(GetMailingList value) {
        return new JAXBElement<GetMailingList>(_GetMailingList_QNAME, GetMailingList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SegmentationGetSegmentCriterias }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "segmentationGetSegmentCriterias")
    public JAXBElement<SegmentationGetSegmentCriterias> createSegmentationGetSegmentCriterias(SegmentationGetSegmentCriterias value) {
        return new JAXBElement<SegmentationGetSegmentCriterias>(_SegmentationGetSegmentCriterias_QNAME, SegmentationGetSegmentCriterias.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SegmentationCreateSegment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "segmentationCreateSegment")
    public JAXBElement<SegmentationCreateSegment> createSegmentationCreateSegment(SegmentationCreateSegment value) {
        return new JAXBElement<SegmentationCreateSegment>(_SegmentationCreateSegment_QNAME, SegmentationCreateSegment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateMirrorBannerLink }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "createMirrorBannerLink")
    public JAXBElement<CreateMirrorBannerLink> createCreateMirrorBannerLink(CreateMirrorBannerLink value) {
        return new JAXBElement<CreateMirrorBannerLink>(_CreateMirrorBannerLink_QNAME, CreateMirrorBannerLink.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateBasicSegmentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "createBasicSegmentResponse")
    public JAXBElement<CreateBasicSegmentResponse> createCreateBasicSegmentResponse(CreateBasicSegmentResponse value) {
        return new JAXBElement<CreateBasicSegmentResponse>(_CreateBasicSegmentResponse_QNAME, CreateBasicSegmentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SegmentationDeleteCriteriaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "segmentationDeleteCriteriaResponse")
    public JAXBElement<SegmentationDeleteCriteriaResponse> createSegmentationDeleteCriteriaResponse(SegmentationDeleteCriteriaResponse value) {
        return new JAXBElement<SegmentationDeleteCriteriaResponse>(_SegmentationDeleteCriteriaResponse_QNAME, SegmentationDeleteCriteriaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveTestMember }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "removeTestMember")
    public JAXBElement<RemoveTestMember> createRemoveTestMember(RemoveTestMember value) {
        return new JAXBElement<RemoveTestMember>(_RemoveTestMember_QNAME, RemoveTestMember.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMessageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "getMessageResponse")
    public JAXBElement<GetMessageResponse> createGetMessageResponse(GetMessageResponse value) {
        return new JAXBElement<GetMessageResponse>(_GetMessageResponse_QNAME, GetMessageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SegmentationUpdateNumericDemographicCriteriaByObjResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "segmentationUpdateNumericDemographicCriteriaByObjResponse")
    public JAXBElement<SegmentationUpdateNumericDemographicCriteriaByObjResponse> createSegmentationUpdateNumericDemographicCriteriaByObjResponse(SegmentationUpdateNumericDemographicCriteriaByObjResponse value) {
        return new JAXBElement<SegmentationUpdateNumericDemographicCriteriaByObjResponse>(_SegmentationUpdateNumericDemographicCriteriaByObjResponse_QNAME, SegmentationUpdateNumericDemographicCriteriaByObjResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PauseCampaignResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "pauseCampaignResponse")
    public JAXBElement<PauseCampaignResponse> createPauseCampaignResponse(PauseCampaignResponse value) {
        return new JAXBElement<PauseCampaignResponse>(_PauseCampaignResponse_QNAME, PauseCampaignResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApiTestGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "testgroup")
    public JAXBElement<ApiTestGroup> createTestgroup(ApiTestGroup value) {
        return new JAXBElement<ApiTestGroup>(_Testgroup_QNAME, ApiTestGroup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SegmentationAddDateDemographicCriteriaByObjResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "segmentationAddDateDemographicCriteriaByObjResponse")
    public JAXBElement<SegmentationAddDateDemographicCriteriaByObjResponse> createSegmentationAddDateDemographicCriteriaByObjResponse(SegmentationAddDateDemographicCriteriaByObjResponse value) {
        return new JAXBElement<SegmentationAddDateDemographicCriteriaByObjResponse>(_SegmentationAddDateDemographicCriteriaByObjResponse_QNAME, SegmentationAddDateDemographicCriteriaByObjResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLastSegments }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "getLastSegments")
    public JAXBElement<GetLastSegments> createGetLastSegments(GetLastSegments value) {
        return new JAXBElement<GetLastSegments>(_GetLastSegments_QNAME, GetLastSegments.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateMailingListByObjResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "updateMailingListByObjResponse")
    public JAXBElement<UpdateMailingListByObjResponse> createUpdateMailingListByObjResponse(UpdateMailingListByObjResponse value) {
        return new JAXBElement<UpdateMailingListByObjResponse>(_UpdateMailingListByObjResponse_QNAME, UpdateMailingListByObjResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAndAddPersonalisedUrl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "createAndAddPersonalisedUrl")
    public JAXBElement<CreateAndAddPersonalisedUrl> createCreateAndAddPersonalisedUrl(CreateAndAddPersonalisedUrl value) {
        return new JAXBElement<CreateAndAddPersonalisedUrl>(_CreateAndAddPersonalisedUrl_QNAME, CreateAndAddPersonalisedUrl.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CloneMessageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "cloneMessageResponse")
    public JAXBElement<CloneMessageResponse> createCloneMessageResponse(CloneMessageResponse value) {
        return new JAXBElement<CloneMessageResponse>(_CloneMessageResponse_QNAME, CloneMessageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClientTestGroups }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "getClientTestGroups")
    public JAXBElement<GetClientTestGroups> createGetClientTestGroups(GetClientTestGroups value) {
        return new JAXBElement<GetClientTestGroups>(_GetClientTestGroups_QNAME, GetClientTestGroups.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteTestMember }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "deleteTestMember")
    public JAXBElement<DeleteTestMember> createDeleteTestMember(DeleteTestMember value) {
        return new JAXBElement<DeleteTestMember>(_DeleteTestMember_QNAME, DeleteTestMember.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUrlByOrderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "getUrlByOrderResponse")
    public JAXBElement<GetUrlByOrderResponse> createGetUrlByOrderResponse(GetUrlByOrderResponse value) {
        return new JAXBElement<GetUrlByOrderResponse>(_GetUrlByOrderResponse_QNAME, GetUrlByOrderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateSegmentByObj }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "updateSegmentByObj")
    public JAXBElement<UpdateSegmentByObj> createUpdateSegmentByObj(UpdateSegmentByObj value) {
        return new JAXBElement<UpdateSegmentByObj>(_UpdateSegmentByObj_QNAME, UpdateSegmentByObj.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllTrackedLinks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "getAllTrackedLinks")
    public JAXBElement<GetAllTrackedLinks> createGetAllTrackedLinks(GetAllTrackedLinks value) {
        return new JAXBElement<GetAllTrackedLinks>(_GetAllTrackedLinks_QNAME, GetAllTrackedLinks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateSegment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "updateSegment")
    public JAXBElement<UpdateSegment> createUpdateSegment(UpdateSegment value) {
        return new JAXBElement<UpdateSegment>(_UpdateSegment_QNAME, UpdateSegment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SegmentationAddCampaignActionCriteriaByObj }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "segmentationAddCampaignActionCriteriaByObj")
    public JAXBElement<SegmentationAddCampaignActionCriteriaByObj> createSegmentationAddCampaignActionCriteriaByObj(SegmentationAddCampaignActionCriteriaByObj value) {
        return new JAXBElement<SegmentationAddCampaignActionCriteriaByObj>(_SegmentationAddCampaignActionCriteriaByObj_QNAME, SegmentationAddCampaignActionCriteriaByObj.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostCampaignResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "postCampaignResponse")
    public JAXBElement<PostCampaignResponse> createPostCampaignResponse(PostCampaignResponse value) {
        return new JAXBElement<PostCampaignResponse>(_PostCampaignResponse_QNAME, PostCampaignResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApiMailingList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "mailingList")
    public JAXBElement<ApiMailingList> createMailingList(ApiMailingList value) {
        return new JAXBElement<ApiMailingList>(_MailingList_QNAME, ApiMailingList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SegmentationAddSocialNetworkCriteriaByObjResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "segmentationAddSocialNetworkCriteriaByObjResponse")
    public JAXBElement<SegmentationAddSocialNetworkCriteriaByObjResponse> createSegmentationAddSocialNetworkCriteriaByObjResponse(SegmentationAddSocialNetworkCriteriaByObjResponse value) {
        return new JAXBElement<SegmentationAddSocialNetworkCriteriaByObjResponse>(_SegmentationAddSocialNetworkCriteriaByObjResponse_QNAME, SegmentationAddSocialNetworkCriteriaByObjResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCampaignStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "getCampaignStatusResponse")
    public JAXBElement<GetCampaignStatusResponse> createGetCampaignStatusResponse(GetCampaignStatusResponse value) {
        return new JAXBElement<GetCampaignStatusResponse>(_GetCampaignStatusResponse_QNAME, GetCampaignStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMessagesByPeriod }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "getMessagesByPeriod")
    public JAXBElement<GetMessagesByPeriod> createGetMessagesByPeriod(GetMessagesByPeriod value) {
        return new JAXBElement<GetMessagesByPeriod>(_GetMessagesByPeriod_QNAME, GetMessagesByPeriod.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAndAddUpdateBannerLinkResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "createAndAddUpdateBannerLinkResponse")
    public JAXBElement<CreateAndAddUpdateBannerLinkResponse> createCreateAndAddUpdateBannerLinkResponse(CreateAndAddUpdateBannerLinkResponse value) {
        return new JAXBElement<CreateAndAddUpdateBannerLinkResponse>(_CreateAndAddUpdateBannerLinkResponse_QNAME, CreateAndAddUpdateBannerLinkResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SegmentationAddDataMartCriteriaByObj }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "segmentationAddDataMartCriteriaByObj")
    public JAXBElement<SegmentationAddDataMartCriteriaByObj> createSegmentationAddDataMartCriteriaByObj(SegmentationAddDataMartCriteriaByObj value) {
        return new JAXBElement<SegmentationAddDataMartCriteriaByObj>(_SegmentationAddDataMartCriteriaByObj_QNAME, SegmentationAddDataMartCriteriaByObj.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConnectionExceptionDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "exceptionDetails")
    public JAXBElement<ConnectionExceptionDetails> createExceptionDetails(ConnectionExceptionDetails value) {
        return new JAXBElement<ConnectionExceptionDetails>(_ExceptionDetails_QNAME, ConnectionExceptionDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCampaignResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "getCampaignResponse")
    public JAXBElement<GetCampaignResponse> createGetCampaignResponse(GetCampaignResponse value) {
        return new JAXBElement<GetCampaignResponse>(_GetCampaignResponse_QNAME, GetCampaignResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnpauseCampaign }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "unpauseCampaign")
    public JAXBElement<UnpauseCampaign> createUnpauseCampaign(UnpauseCampaign value) {
        return new JAXBElement<UnpauseCampaign>(_UnpauseCampaign_QNAME, UnpauseCampaign.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SegmentationAddSerieActionCriteriaByObjResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "segmentationAddSerieActionCriteriaByObjResponse")
    public JAXBElement<SegmentationAddSerieActionCriteriaByObjResponse> createSegmentationAddSerieActionCriteriaByObjResponse(SegmentationAddSerieActionCriteriaByObjResponse value) {
        return new JAXBElement<SegmentationAddSerieActionCriteriaByObjResponse>(_SegmentationAddSerieActionCriteriaByObjResponse_QNAME, SegmentationAddSerieActionCriteriaByObjResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CloneMailingListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "cloneMailingListResponse")
    public JAXBElement<CloneMailingListResponse> createCloneMailingListResponse(CloneMailingListResponse value) {
        return new JAXBElement<CloneMailingListResponse>(_CloneMailingListResponse_QNAME, CloneMailingListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SegmentationDistinctCountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "segmentationDistinctCountResponse")
    public JAXBElement<SegmentationDistinctCountResponse> createSegmentationDistinctCountResponse(SegmentationDistinctCountResponse value) {
        return new JAXBElement<SegmentationDistinctCountResponse>(_SegmentationDistinctCountResponse_QNAME, SegmentationDistinctCountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SegmentationAddNumericDemographicCriteriaByObj }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "segmentationAddNumericDemographicCriteriaByObj")
    public JAXBElement<SegmentationAddNumericDemographicCriteriaByObj> createSegmentationAddNumericDemographicCriteriaByObj(SegmentationAddNumericDemographicCriteriaByObj value) {
        return new JAXBElement<SegmentationAddNumericDemographicCriteriaByObj>(_SegmentationAddNumericDemographicCriteriaByObj_QNAME, SegmentationAddNumericDemographicCriteriaByObj.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateBasicSegment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "createBasicSegment")
    public JAXBElement<CreateBasicSegment> createCreateBasicSegment(CreateBasicSegment value) {
        return new JAXBElement<CreateBasicSegment>(_CreateBasicSegment_QNAME, CreateBasicSegment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CloneMailingList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "cloneMailingList")
    public JAXBElement<CloneMailingList> createCloneMailingList(CloneMailingList value) {
        return new JAXBElement<CloneMailingList>(_CloneMailingList_QNAME, CloneMailingList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCampaign }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "getCampaign")
    public JAXBElement<GetCampaign> createGetCampaign(GetCampaign value) {
        return new JAXBElement<GetCampaign>(_GetCampaign_QNAME, GetCampaign.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApiSegmentation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "segmentation")
    public JAXBElement<ApiSegmentation> createSegmentation(ApiSegmentation value) {
        return new JAXBElement<ApiSegmentation>(_Segmentation_QNAME, ApiSegmentation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateSQLSegmentByObjResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "createSQLSegmentByObjResponse")
    public JAXBElement<CreateSQLSegmentByObjResponse> createCreateSQLSegmentByObjResponse(CreateSQLSegmentByObjResponse value) {
        return new JAXBElement<CreateSQLSegmentByObjResponse>(_CreateSQLSegmentByObjResponse_QNAME, CreateSQLSegmentByObjResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrackBannerLinkByPositionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "trackBannerLinkByPositionResponse")
    public JAXBElement<TrackBannerLinkByPositionResponse> createTrackBannerLinkByPositionResponse(TrackBannerLinkByPositionResponse value) {
        return new JAXBElement<TrackBannerLinkByPositionResponse>(_TrackBannerLinkByPositionResponse_QNAME, TrackBannerLinkByPositionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAndAddUpdateUrl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "createAndAddUpdateUrl")
    public JAXBElement<CreateAndAddUpdateUrl> createCreateAndAddUpdateUrl(CreateAndAddUpdateUrl value) {
        return new JAXBElement<CreateAndAddUpdateUrl>(_CreateAndAddUpdateUrl_QNAME, CreateAndAddUpdateUrl.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApiSegment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "segment")
    public JAXBElement<ApiSegment> createSegment(ApiSegment value) {
        return new JAXBElement<ApiSegment>(_Segment_QNAME, ApiSegment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCampaignByObj }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "createCampaignByObj")
    public JAXBElement<CreateCampaignByObj> createCreateCampaignByObj(CreateCampaignByObj value) {
        return new JAXBElement<CreateCampaignByObj>(_CreateCampaignByObj_QNAME, CreateCampaignByObj.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApiActionCriteria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "actionCriteria")
    public JAXBElement<ApiActionCriteria> createActionCriteria(ApiActionCriteria value) {
        return new JAXBElement<ApiActionCriteria>(_ActionCriteria_QNAME, ApiActionCriteria.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMailingListsByPeriodResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "getMailingListsByPeriodResponse")
    public JAXBElement<GetMailingListsByPeriodResponse> createGetMailingListsByPeriodResponse(GetMailingListsByPeriodResponse value) {
        return new JAXBElement<GetMailingListsByPeriodResponse>(_GetMailingListsByPeriodResponse_QNAME, GetMailingListsByPeriodResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateSegmentByObjResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "updateSegmentByObjResponse")
    public JAXBElement<UpdateSegmentByObjResponse> createUpdateSegmentByObjResponse(UpdateSegmentByObjResponse value) {
        return new JAXBElement<UpdateSegmentByObjResponse>(_UpdateSegmentByObjResponse_QNAME, UpdateSegmentByObjResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNotValidatedSendersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "getNotValidatedSendersResponse")
    public JAXBElement<GetNotValidatedSendersResponse> createGetNotValidatedSendersResponse(GetNotValidatedSendersResponse value) {
        return new JAXBElement<GetNotValidatedSendersResponse>(_GetNotValidatedSendersResponse_QNAME, GetNotValidatedSendersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAndAddPersonalisedBannerLink }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "createAndAddPersonalisedBannerLink")
    public JAXBElement<CreateAndAddPersonalisedBannerLink> createCreateAndAddPersonalisedBannerLink(CreateAndAddPersonalisedBannerLink value) {
        return new JAXBElement<CreateAndAddPersonalisedBannerLink>(_CreateAndAddPersonalisedBannerLink_QNAME, CreateAndAddPersonalisedBannerLink.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCampaignStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "getCampaignStatus")
    public JAXBElement<GetCampaignStatus> createGetCampaignStatus(GetCampaignStatus value) {
        return new JAXBElement<GetCampaignStatus>(_GetCampaignStatus_QNAME, GetCampaignStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCampaignsByStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "getCampaignsByStatus")
    public JAXBElement<GetCampaignsByStatus> createGetCampaignsByStatus(GetCampaignsByStatus value) {
        return new JAXBElement<GetCampaignsByStatus>(_GetCampaignsByStatus_QNAME, GetCampaignsByStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SegmentationUpdateStringDemographicCriteriaByObj }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "segmentationUpdateStringDemographicCriteriaByObj")
    public JAXBElement<SegmentationUpdateStringDemographicCriteriaByObj> createSegmentationUpdateStringDemographicCriteriaByObj(SegmentationUpdateStringDemographicCriteriaByObj value) {
        return new JAXBElement<SegmentationUpdateStringDemographicCriteriaByObj>(_SegmentationUpdateStringDemographicCriteriaByObj_QNAME, SegmentationUpdateStringDemographicCriteriaByObj.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsHtmlValidResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "isHtmlValidResponse")
    public JAXBElement<IsHtmlValidResponse> createIsHtmlValidResponse(IsHtmlValidResponse value) {
        return new JAXBElement<IsHtmlValidResponse>(_IsHtmlValidResponse_QNAME, IsHtmlValidResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SegmentationUpdateSocialNetworkCriteriaByObjResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "segmentationUpdateSocialNetworkCriteriaByObjResponse")
    public JAXBElement<SegmentationUpdateSocialNetworkCriteriaByObjResponse> createSegmentationUpdateSocialNetworkCriteriaByObjResponse(SegmentationUpdateSocialNetworkCriteriaByObjResponse value) {
        return new JAXBElement<SegmentationUpdateSocialNetworkCriteriaByObjResponse>(_SegmentationUpdateSocialNetworkCriteriaByObjResponse_QNAME, SegmentationUpdateSocialNetworkCriteriaByObjResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SegmentationUpdateDataMartCriteriaByObjResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "segmentationUpdateDataMartCriteriaByObjResponse")
    public JAXBElement<SegmentationUpdateDataMartCriteriaByObjResponse> createSegmentationUpdateDataMartCriteriaByObjResponse(SegmentationUpdateDataMartCriteriaByObjResponse value) {
        return new JAXBElement<SegmentationUpdateDataMartCriteriaByObjResponse>(_SegmentationUpdateDataMartCriteriaByObjResponse_QNAME, SegmentationUpdateDataMartCriteriaByObjResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCampaign }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "createCampaign")
    public JAXBElement<CreateCampaign> createCreateCampaign(CreateCampaign value) {
        return new JAXBElement<CreateCampaign>(_CreateCampaign_QNAME, CreateCampaign.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLastMailingLists }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "getLastMailingLists")
    public JAXBElement<GetLastMailingLists> createGetLastMailingLists(GetLastMailingLists value) {
        return new JAXBElement<GetLastMailingLists>(_GetLastMailingLists_QNAME, GetLastMailingLists.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UntrackBannerLinkByOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "untrackBannerLinkByOrder")
    public JAXBElement<UntrackBannerLinkByOrder> createUntrackBannerLinkByOrder(UntrackBannerLinkByOrder value) {
        return new JAXBElement<UntrackBannerLinkByOrder>(_UntrackBannerLinkByOrder_QNAME, UntrackBannerLinkByOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SegmentationUpdateNumericDemographicCriteriaByObj }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "segmentationUpdateNumericDemographicCriteriaByObj")
    public JAXBElement<SegmentationUpdateNumericDemographicCriteriaByObj> createSegmentationUpdateNumericDemographicCriteriaByObj(SegmentationUpdateNumericDemographicCriteriaByObj value) {
        return new JAXBElement<SegmentationUpdateNumericDemographicCriteriaByObj>(_SegmentationUpdateNumericDemographicCriteriaByObj_QNAME, SegmentationUpdateNumericDemographicCriteriaByObj.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateSQLSegment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "createSQLSegment")
    public JAXBElement<CreateSQLSegment> createCreateSQLSegment(CreateSQLSegment value) {
        return new JAXBElement<CreateSQLSegment>(_CreateSQLSegment_QNAME, CreateSQLSegment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApiUrl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "apiurl")
    public JAXBElement<ApiUrl> createApiurl(ApiUrl value) {
        return new JAXBElement<ApiUrl>(_Apiurl_QNAME, ApiUrl.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateTestMember }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "createTestMember")
    public JAXBElement<CreateTestMember> createCreateTestMember(CreateTestMember value) {
        return new JAXBElement<CreateTestMember>(_CreateTestMember_QNAME, CreateTestMember.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCampaignsByPeriodResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "getCampaignsByPeriodResponse")
    public JAXBElement<GetCampaignsByPeriodResponse> createGetCampaignsByPeriodResponse(GetCampaignsByPeriodResponse value) {
        return new JAXBElement<GetCampaignsByPeriodResponse>(_GetCampaignsByPeriodResponse_QNAME, GetCampaignsByPeriodResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrackAllBannerLinks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "trackAllBannerLinks")
    public JAXBElement<TrackAllBannerLinks> createTrackAllBannerLinks(TrackAllBannerLinks value) {
        return new JAXBElement<TrackAllBannerLinks>(_TrackAllBannerLinks_QNAME, TrackAllBannerLinks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePersonalisedBannerLinkResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "createPersonalisedBannerLinkResponse")
    public JAXBElement<CreatePersonalisedBannerLinkResponse> createCreatePersonalisedBannerLinkResponse(CreatePersonalisedBannerLinkResponse value) {
        return new JAXBElement<CreatePersonalisedBannerLinkResponse>(_CreatePersonalisedBannerLinkResponse_QNAME, CreatePersonalisedBannerLinkResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DistinctMembersCount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "distinctMembersCount")
    public JAXBElement<DistinctMembersCount> createDistinctMembersCount(DistinctMembersCount value) {
        return new JAXBElement<DistinctMembersCount>(_DistinctMembersCount_QNAME, DistinctMembersCount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSegmentsByField }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "getSegmentsByField")
    public JAXBElement<GetSegmentsByField> createGetSegmentsByField(GetSegmentsByField value) {
        return new JAXBElement<GetSegmentsByField>(_GetSegmentsByField_QNAME, GetSegmentsByField.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "list")
    public JAXBElement<Object> createList(Object value) {
        return new JAXBElement<Object>(_List_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLastCampaigns }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "getLastCampaigns")
    public JAXBElement<GetLastCampaigns> createGetLastCampaigns(GetLastCampaigns value) {
        return new JAXBElement<GetLastCampaigns>(_GetLastCampaigns_QNAME, GetLastCampaigns.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAndAddMirrorBannerLink }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "createAndAddMirrorBannerLink")
    public JAXBElement<CreateAndAddMirrorBannerLink> createCreateAndAddMirrorBannerLink(CreateAndAddMirrorBannerLink value) {
        return new JAXBElement<CreateAndAddMirrorBannerLink>(_CreateAndAddMirrorBannerLink_QNAME, CreateAndAddMirrorBannerLink.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MembersCount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "membersCount")
    public JAXBElement<MembersCount> createMembersCount(MembersCount value) {
        return new JAXBElement<MembersCount>(_MembersCount_QNAME, MembersCount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateMailingListByObjResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "createMailingListByObjResponse")
    public JAXBElement<CreateMailingListByObjResponse> createCreateMailingListByObjResponse(CreateMailingListByObjResponse value) {
        return new JAXBElement<CreateMailingListByObjResponse>(_CreateMailingListByObjResponse_QNAME, CreateMailingListByObjResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTestGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "getTestGroup")
    public JAXBElement<GetTestGroup> createGetTestGroup(GetTestGroup value) {
        return new JAXBElement<GetTestGroup>(_GetTestGroup_QNAME, GetTestGroup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateMirrorUrlResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "createMirrorUrlResponse")
    public JAXBElement<CreateMirrorUrlResponse> createCreateMirrorUrlResponse(CreateMirrorUrlResponse value) {
        return new JAXBElement<CreateMirrorUrlResponse>(_CreateMirrorUrlResponse_QNAME, CreateMirrorUrlResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateTestGroupByObjResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "updateTestGroupByObjResponse")
    public JAXBElement<UpdateTestGroupByObjResponse> createUpdateTestGroupByObjResponse(UpdateTestGroupByObjResponse value) {
        return new JAXBElement<UpdateTestGroupByObjResponse>(_UpdateTestGroupByObjResponse_QNAME, UpdateTestGroupByObjResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "deleteMessage")
    public JAXBElement<DeleteMessage> createDeleteMessage(DeleteMessage value) {
        return new JAXBElement<DeleteMessage>(_DeleteMessage_QNAME, DeleteMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateUrlByField }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "updateUrlByField")
    public JAXBElement<UpdateUrlByField> createUpdateUrlByField(UpdateUrlByField value) {
        return new JAXBElement<UpdateUrlByField>(_UpdateUrlByField_QNAME, UpdateUrlByField.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrackAllLinksResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "trackAllLinksResponse")
    public JAXBElement<TrackAllLinksResponse> createTrackAllLinksResponse(TrackAllLinksResponse value) {
        return new JAXBElement<TrackAllLinksResponse>(_TrackAllLinksResponse_QNAME, TrackAllLinksResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "listOptions")
    public JAXBElement<Object> createListOptions(Object value) {
        return new JAXBElement<Object>(_ListOptions_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateTestGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "createTestGroup")
    public JAXBElement<CreateTestGroup> createCreateTestGroup(CreateTestGroup value) {
        return new JAXBElement<CreateTestGroup>(_CreateTestGroup_QNAME, CreateTestGroup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SegmentationUpdateDateDemographicCriteriaByObjResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "segmentationUpdateDateDemographicCriteriaByObjResponse")
    public JAXBElement<SegmentationUpdateDateDemographicCriteriaByObjResponse> createSegmentationUpdateDateDemographicCriteriaByObjResponse(SegmentationUpdateDateDemographicCriteriaByObjResponse value) {
        return new JAXBElement<SegmentationUpdateDateDemographicCriteriaByObjResponse>(_SegmentationUpdateDateDemographicCriteriaByObjResponse_QNAME, SegmentationUpdateDateDemographicCriteriaByObjResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAndAddUnsubscribeBannerLinkResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "createAndAddUnsubscribeBannerLinkResponse")
    public JAXBElement<CreateAndAddUnsubscribeBannerLinkResponse> createCreateAndAddUnsubscribeBannerLinkResponse(CreateAndAddUnsubscribeBannerLinkResponse value) {
        return new JAXBElement<CreateAndAddUnsubscribeBannerLinkResponse>(_CreateAndAddUnsubscribeBannerLinkResponse_QNAME, CreateAndAddUnsubscribeBannerLinkResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SegmentationUpdateCampaignTrackableLinkCriteriaByObjResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "segmentationUpdateCampaignTrackableLinkCriteriaByObjResponse")
    public JAXBElement<SegmentationUpdateCampaignTrackableLinkCriteriaByObjResponse> createSegmentationUpdateCampaignTrackableLinkCriteriaByObjResponse(SegmentationUpdateCampaignTrackableLinkCriteriaByObjResponse value) {
        return new JAXBElement<SegmentationUpdateCampaignTrackableLinkCriteriaByObjResponse>(_SegmentationUpdateCampaignTrackableLinkCriteriaByObjResponse_QNAME, SegmentationUpdateCampaignTrackableLinkCriteriaByObjResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateSQLSegmentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "createSQLSegmentResponse")
    public JAXBElement<CreateSQLSegmentResponse> createCreateSQLSegmentResponse(CreateSQLSegmentResponse value) {
        return new JAXBElement<CreateSQLSegmentResponse>(_CreateSQLSegmentResponse_QNAME, CreateSQLSegmentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateBanner }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "updateBanner")
    public JAXBElement<UpdateBanner> createUpdateBanner(UpdateBanner value) {
        return new JAXBElement<UpdateBanner>(_UpdateBanner_QNAME, UpdateBanner.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SegmentationDistinctCount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "segmentationDistinctCount")
    public JAXBElement<SegmentationDistinctCount> createSegmentationDistinctCount(SegmentationDistinctCount value) {
        return new JAXBElement<SegmentationDistinctCount>(_SegmentationDistinctCount_QNAME, SegmentationDistinctCount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SegmentationUpdateSocialNetworkCriteriaByObj }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "segmentationUpdateSocialNetworkCriteriaByObj")
    public JAXBElement<SegmentationUpdateSocialNetworkCriteriaByObj> createSegmentationUpdateSocialNetworkCriteriaByObj(SegmentationUpdateSocialNetworkCriteriaByObj value) {
        return new JAXBElement<SegmentationUpdateSocialNetworkCriteriaByObj>(_SegmentationUpdateSocialNetworkCriteriaByObj_QNAME, SegmentationUpdateSocialNetworkCriteriaByObj.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PauseCampaign }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "pauseCampaign")
    public JAXBElement<PauseCampaign> createPauseCampaign(PauseCampaign value) {
        return new JAXBElement<PauseCampaign>(_PauseCampaign_QNAME, PauseCampaign.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteMailingList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "deleteMailingList")
    public JAXBElement<DeleteMailingList> createDeleteMailingList(DeleteMailingList value) {
        return new JAXBElement<DeleteMailingList>(_DeleteMailingList_QNAME, DeleteMailingList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCampaign }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "updateCampaign")
    public JAXBElement<UpdateCampaign> createUpdateCampaign(UpdateCampaign value) {
        return new JAXBElement<UpdateCampaign>(_UpdateCampaign_QNAME, UpdateCampaign.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SegmentationUpdateRecencyCriteriaByObjResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "segmentationUpdateRecencyCriteriaByObjResponse")
    public JAXBElement<SegmentationUpdateRecencyCriteriaByObjResponse> createSegmentationUpdateRecencyCriteriaByObjResponse(SegmentationUpdateRecencyCriteriaByObjResponse value) {
        return new JAXBElement<SegmentationUpdateRecencyCriteriaByObjResponse>(_SegmentationUpdateRecencyCriteriaByObjResponse_QNAME, SegmentationUpdateRecencyCriteriaByObjResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateSmsMessageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "createSmsMessageResponse")
    public JAXBElement<CreateSmsMessageResponse> createCreateSmsMessageResponse(CreateSmsMessageResponse value) {
        return new JAXBElement<CreateSmsMessageResponse>(_CreateSmsMessageResponse_QNAME, CreateSmsMessageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMailingListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "getMailingListResponse")
    public JAXBElement<GetMailingListResponse> createGetMailingListResponse(GetMailingListResponse value) {
        return new JAXBElement<GetMailingListResponse>(_GetMailingListResponse_QNAME, GetMailingListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateEmailMessageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "createEmailMessageResponse")
    public JAXBElement<CreateEmailMessageResponse> createCreateEmailMessageResponse(CreateEmailMessageResponse value) {
        return new JAXBElement<CreateEmailMessageResponse>(_CreateEmailMessageResponse_QNAME, CreateEmailMessageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link APISegmentSummary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "segmentSummary")
    public JAXBElement<APISegmentSummary> createSegmentSummary(APISegmentSummary value) {
        return new JAXBElement<APISegmentSummary>(_SegmentSummary_QNAME, APISegmentSummary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAndAddMirrorUrlResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "createAndAddMirrorUrlResponse")
    public JAXBElement<CreateAndAddMirrorUrlResponse> createCreateAndAddMirrorUrlResponse(CreateAndAddMirrorUrlResponse value) {
        return new JAXBElement<CreateAndAddMirrorUrlResponse>(_CreateAndAddMirrorUrlResponse_QNAME, CreateAndAddMirrorUrlResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApiBanner }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "banner")
    public JAXBElement<ApiBanner> createBanner(ApiBanner value) {
        return new JAXBElement<ApiBanner>(_Banner_QNAME, ApiBanner.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteTestMemberResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "deleteTestMemberResponse")
    public JAXBElement<DeleteTestMemberResponse> createDeleteTestMemberResponse(DeleteTestMemberResponse value) {
        return new JAXBElement<DeleteTestMemberResponse>(_DeleteTestMemberResponse_QNAME, DeleteTestMemberResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UntrackLinkByOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "untrackLinkByOrder")
    public JAXBElement<UntrackLinkByOrder> createUntrackLinkByOrder(UntrackLinkByOrder value) {
        return new JAXBElement<UntrackLinkByOrder>(_UntrackLinkByOrder_QNAME, UntrackLinkByOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SegmentationAddNumericDemographicCriteriaByObjResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "segmentationAddNumericDemographicCriteriaByObjResponse")
    public JAXBElement<SegmentationAddNumericDemographicCriteriaByObjResponse> createSegmentationAddNumericDemographicCriteriaByObjResponse(SegmentationAddNumericDemographicCriteriaByObjResponse value) {
        return new JAXBElement<SegmentationAddNumericDemographicCriteriaByObjResponse>(_SegmentationAddNumericDemographicCriteriaByObjResponse_QNAME, SegmentationAddNumericDemographicCriteriaByObjResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSegmentsByFieldResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "getSegmentsByFieldResponse")
    public JAXBElement<GetSegmentsByFieldResponse> createGetSegmentsByFieldResponse(GetSegmentsByFieldResponse value) {
        return new JAXBElement<GetSegmentsByFieldResponse>(_GetSegmentsByFieldResponse_QNAME, GetSegmentsByFieldResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateSmsMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "createSmsMessage")
    public JAXBElement<CreateSmsMessage> createCreateSmsMessage(CreateSmsMessage value) {
        return new JAXBElement<CreateSmsMessage>(_CreateSmsMessage_QNAME, CreateSmsMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestSmsMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "testSmsMessage")
    public JAXBElement<TestSmsMessage> createTestSmsMessage(TestSmsMessage value) {
        return new JAXBElement<TestSmsMessage>(_TestSmsMessage_QNAME, TestSmsMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SegmentationUpdateSegment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "segmentationUpdateSegment")
    public JAXBElement<SegmentationUpdateSegment> createSegmentationUpdateSegment(SegmentationUpdateSegment value) {
        return new JAXBElement<SegmentationUpdateSegment>(_SegmentationUpdateSegment_QNAME, SegmentationUpdateSegment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteUrl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "deleteUrl")
    public JAXBElement<DeleteUrl> createDeleteUrl(DeleteUrl value) {
        return new JAXBElement<DeleteUrl>(_DeleteUrl_QNAME, DeleteUrl.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CloneBanner }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "cloneBanner")
    public JAXBElement<CloneBanner> createCloneBanner(CloneBanner value) {
        return new JAXBElement<CloneBanner>(_CloneBanner_QNAME, CloneBanner.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SegmentationUpdateCampaignActionCriteriaByObjResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "segmentationUpdateCampaignActionCriteriaByObjResponse")
    public JAXBElement<SegmentationUpdateCampaignActionCriteriaByObjResponse> createSegmentationUpdateCampaignActionCriteriaByObjResponse(SegmentationUpdateCampaignActionCriteriaByObjResponse value) {
        return new JAXBElement<SegmentationUpdateCampaignActionCriteriaByObjResponse>(_SegmentationUpdateCampaignActionCriteriaByObjResponse_QNAME, SegmentationUpdateCampaignActionCriteriaByObjResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCampaignResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "createCampaignResponse")
    public JAXBElement<CreateCampaignResponse> createCreateCampaignResponse(CreateCampaignResponse value) {
        return new JAXBElement<CreateCampaignResponse>(_CreateCampaignResponse_QNAME, CreateCampaignResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAndAddMirrorBannerLinkResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "createAndAddMirrorBannerLinkResponse")
    public JAXBElement<CreateAndAddMirrorBannerLinkResponse> createCreateAndAddMirrorBannerLinkResponse(CreateAndAddMirrorBannerLinkResponse value) {
        return new JAXBElement<CreateAndAddMirrorBannerLinkResponse>(_CreateAndAddMirrorBannerLinkResponse_QNAME, CreateAndAddMirrorBannerLinkResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApiSegments }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "segments")
    public JAXBElement<ApiSegments> createSegments(ApiSegments value) {
        return new JAXBElement<ApiSegments>(_Segments_QNAME, ApiSegments.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteMessageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "deleteMessageResponse")
    public JAXBElement<DeleteMessageResponse> createDeleteMessageResponse(DeleteMessageResponse value) {
        return new JAXBElement<DeleteMessageResponse>(_DeleteMessageResponse_QNAME, DeleteMessageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTestMember }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "getTestMember")
    public JAXBElement<GetTestMember> createGetTestMember(GetTestMember value) {
        return new JAXBElement<GetTestMember>(_GetTestMember_QNAME, GetTestMember.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteBannerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "deleteBannerResponse")
    public JAXBElement<DeleteBannerResponse> createDeleteBannerResponse(DeleteBannerResponse value) {
        return new JAXBElement<DeleteBannerResponse>(_DeleteBannerResponse_QNAME, DeleteBannerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DistinctMembersCountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "distinctMembersCountResponse")
    public JAXBElement<DistinctMembersCountResponse> createDistinctMembersCountResponse(DistinctMembersCountResponse value) {
        return new JAXBElement<DistinctMembersCountResponse>(_DistinctMembersCountResponse_QNAME, DistinctMembersCountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link APIBannerSummary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "bannerSummary")
    public JAXBElement<APIBannerSummary> createBannerSummary(APIBannerSummary value) {
        return new JAXBElement<APIBannerSummary>(_BannerSummary_QNAME, APIBannerSummary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateSegmentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "updateSegmentResponse")
    public JAXBElement<UpdateSegmentResponse> createUpdateSegmentResponse(UpdateSegmentResponse value) {
        return new JAXBElement<UpdateSegmentResponse>(_UpdateSegmentResponse_QNAME, UpdateSegmentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateBannerByObjResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "updateBannerByObjResponse")
    public JAXBElement<UpdateBannerByObjResponse> createUpdateBannerByObjResponse(UpdateBannerByObjResponse value) {
        return new JAXBElement<UpdateBannerByObjResponse>(_UpdateBannerByObjResponse_QNAME, UpdateBannerByObjResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAndAddStandardUrl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "createAndAddStandardUrl")
    public JAXBElement<CreateAndAddStandardUrl> createCreateAndAddStandardUrl(CreateAndAddStandardUrl value) {
        return new JAXBElement<CreateAndAddStandardUrl>(_CreateAndAddStandardUrl_QNAME, CreateAndAddStandardUrl.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSegment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "getSegment")
    public JAXBElement<GetSegment> createGetSegment(GetSegment value) {
        return new JAXBElement<GetSegment>(_GetSegment_QNAME, GetSegment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrackLinkByPosition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "trackLinkByPosition")
    public JAXBElement<TrackLinkByPosition> createTrackLinkByPosition(TrackLinkByPosition value) {
        return new JAXBElement<TrackLinkByPosition>(_TrackLinkByPosition_QNAME, TrackLinkByPosition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAndAddActionBannerLinkResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "createAndAddActionBannerLinkResponse")
    public JAXBElement<CreateAndAddActionBannerLinkResponse> createCreateAndAddActionBannerLinkResponse(CreateAndAddActionBannerLinkResponse value) {
        return new JAXBElement<CreateAndAddActionBannerLinkResponse>(_CreateAndAddActionBannerLinkResponse_QNAME, CreateAndAddActionBannerLinkResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SegmentationAddRecencyCriteriaByObjResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "segmentationAddRecencyCriteriaByObjResponse")
    public JAXBElement<SegmentationAddRecencyCriteriaByObjResponse> createSegmentationAddRecencyCriteriaByObjResponse(SegmentationAddRecencyCriteriaByObjResponse value) {
        return new JAXBElement<SegmentationAddRecencyCriteriaByObjResponse>(_SegmentationAddRecencyCriteriaByObjResponse_QNAME, SegmentationAddRecencyCriteriaByObjResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SegmentationAddSocialNetworkCriteriaByObj }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "segmentationAddSocialNetworkCriteriaByObj")
    public JAXBElement<SegmentationAddSocialNetworkCriteriaByObj> createSegmentationAddSocialNetworkCriteriaByObj(SegmentationAddSocialNetworkCriteriaByObj value) {
        return new JAXBElement<SegmentationAddSocialNetworkCriteriaByObj>(_SegmentationAddSocialNetworkCriteriaByObj_QNAME, SegmentationAddSocialNetworkCriteriaByObj.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateTestGroupByObj }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "updateTestGroupByObj")
    public JAXBElement<UpdateTestGroupByObj> createUpdateTestGroupByObj(UpdateTestGroupByObj value) {
        return new JAXBElement<UpdateTestGroupByObj>(_UpdateTestGroupByObj_QNAME, UpdateTestGroupByObj.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnpostCampaignResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "unpostCampaignResponse")
    public JAXBElement<UnpostCampaignResponse> createUnpostCampaignResponse(UnpostCampaignResponse value) {
        return new JAXBElement<UnpostCampaignResponse>(_UnpostCampaignResponse_QNAME, UnpostCampaignResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClientTestGroupsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "getClientTestGroupsResponse")
    public JAXBElement<GetClientTestGroupsResponse> createGetClientTestGroupsResponse(GetClientTestGroupsResponse value) {
        return new JAXBElement<GetClientTestGroupsResponse>(_GetClientTestGroupsResponse_QNAME, GetClientTestGroupsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestMembers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "testmembers")
    public JAXBElement<TestMembers> createTestmembers(TestMembers value) {
        return new JAXBElement<TestMembers>(_Testmembers_QNAME, TestMembers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApiDataMartCriteria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "dataMartCriteria")
    public JAXBElement<ApiDataMartCriteria> createDataMartCriteria(ApiDataMartCriteria value) {
        return new JAXBElement<ApiDataMartCriteria>(_DataMartCriteria_QNAME, ApiDataMartCriteria.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMessageSummaryListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "getMessageSummaryListResponse")
    public JAXBElement<GetMessageSummaryListResponse> createGetMessageSummaryListResponse(GetMessageSummaryListResponse value) {
        return new JAXBElement<GetMessageSummaryListResponse>(_GetMessageSummaryListResponse_QNAME, GetMessageSummaryListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CcmdExceptionDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "ccmdExceptionDetails")
    public JAXBElement<CcmdExceptionDetails> createCcmdExceptionDetails(CcmdExceptionDetails value) {
        return new JAXBElement<CcmdExceptionDetails>(_CcmdExceptionDetails_QNAME, CcmdExceptionDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePersonalisedUrlResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "createPersonalisedUrlResponse")
    public JAXBElement<CreatePersonalisedUrlResponse> createCreatePersonalisedUrlResponse(CreatePersonalisedUrlResponse value) {
        return new JAXBElement<CreatePersonalisedUrlResponse>(_CreatePersonalisedUrlResponse_QNAME, CreatePersonalisedUrlResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllBannerTrackedLinks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "getAllBannerTrackedLinks")
    public JAXBElement<GetAllBannerTrackedLinks> createGetAllBannerTrackedLinks(GetAllBannerTrackedLinks value) {
        return new JAXBElement<GetAllBannerTrackedLinks>(_GetAllBannerTrackedLinks_QNAME, GetAllBannerTrackedLinks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveSegment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "removeSegment")
    public JAXBElement<RemoveSegment> createRemoveSegment(RemoveSegment value) {
        return new JAXBElement<RemoveSegment>(_RemoveSegment_QNAME, RemoveSegment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SegmentationUpdateDataMartCriteriaByObj }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "segmentationUpdateDataMartCriteriaByObj")
    public JAXBElement<SegmentationUpdateDataMartCriteriaByObj> createSegmentationUpdateDataMartCriteriaByObj(SegmentationUpdateDataMartCriteriaByObj value) {
        return new JAXBElement<SegmentationUpdateDataMartCriteriaByObj>(_SegmentationUpdateDataMartCriteriaByObj_QNAME, SegmentationUpdateDataMartCriteriaByObj.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCampaignByObjResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "updateCampaignByObjResponse")
    public JAXBElement<UpdateCampaignByObjResponse> createUpdateCampaignByObjResponse(UpdateCampaignByObjResponse value) {
        return new JAXBElement<UpdateCampaignByObjResponse>(_UpdateCampaignByObjResponse_QNAME, UpdateCampaignByObjResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllTrackedLinksResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "getAllTrackedLinksResponse")
    public JAXBElement<GetAllTrackedLinksResponse> createGetAllTrackedLinksResponse(GetAllTrackedLinksResponse value) {
        return new JAXBElement<GetAllTrackedLinksResponse>(_GetAllTrackedLinksResponse_QNAME, GetAllTrackedLinksResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmailMessagesByFieldResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "getEmailMessagesByFieldResponse")
    public JAXBElement<GetEmailMessagesByFieldResponse> createGetEmailMessagesByFieldResponse(GetEmailMessagesByFieldResponse value) {
        return new JAXBElement<GetEmailMessagesByFieldResponse>(_GetEmailMessagesByFieldResponse_QNAME, GetEmailMessagesByFieldResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllTrackableLinksResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "getAllTrackableLinksResponse")
    public JAXBElement<GetAllTrackableLinksResponse> createGetAllTrackableLinksResponse(GetAllTrackableLinksResponse value) {
        return new JAXBElement<GetAllTrackableLinksResponse>(_GetAllTrackableLinksResponse_QNAME, GetAllTrackableLinksResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteBanner }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "deleteBanner")
    public JAXBElement<DeleteBanner> createDeleteBanner(DeleteBanner value) {
        return new JAXBElement<DeleteBanner>(_DeleteBanner_QNAME, DeleteBanner.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SegmentationAddSerieTrackableLinkCriteriaByObjResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "segmentationAddSerieTrackableLinkCriteriaByObjResponse")
    public JAXBElement<SegmentationAddSerieTrackableLinkCriteriaByObjResponse> createSegmentationAddSerieTrackableLinkCriteriaByObjResponse(SegmentationAddSerieTrackableLinkCriteriaByObjResponse value) {
        return new JAXBElement<SegmentationAddSerieTrackableLinkCriteriaByObjResponse>(_SegmentationAddSerieTrackableLinkCriteriaByObjResponse_QNAME, SegmentationAddSerieTrackableLinkCriteriaByObjResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDefaultSender }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "getDefaultSender")
    public JAXBElement<GetDefaultSender> createGetDefaultSender(GetDefaultSender value) {
        return new JAXBElement<GetDefaultSender>(_GetDefaultSender_QNAME, GetDefaultSender.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCampaignsByPeriod }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "getCampaignsByPeriod")
    public JAXBElement<GetCampaignsByPeriod> createGetCampaignsByPeriod(GetCampaignsByPeriod value) {
        return new JAXBElement<GetCampaignsByPeriod>(_GetCampaignsByPeriod_QNAME, GetCampaignsByPeriod.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateActionBannerLink }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "createActionBannerLink")
    public JAXBElement<CreateActionBannerLink> createCreateActionBannerLink(CreateActionBannerLink value) {
        return new JAXBElement<CreateActionBannerLink>(_CreateActionBannerLink_QNAME, CreateActionBannerLink.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestEmailMessageByMemberResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "testEmailMessageByMemberResponse")
    public JAXBElement<TestEmailMessageByMemberResponse> createTestEmailMessageByMemberResponse(TestEmailMessageByMemberResponse value) {
        return new JAXBElement<TestEmailMessageByMemberResponse>(_TestEmailMessageByMemberResponse_QNAME, TestEmailMessageByMemberResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UntrackAllLinks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "untrackAllLinks")
    public JAXBElement<UntrackAllLinks> createUntrackAllLinks(UntrackAllLinks value) {
        return new JAXBElement<UntrackAllLinks>(_UntrackAllLinks_QNAME, UntrackAllLinks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCampaignSummaryListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "getCampaignSummaryListResponse")
    public JAXBElement<GetCampaignSummaryListResponse> createGetCampaignSummaryListResponse(GetCampaignSummaryListResponse value) {
        return new JAXBElement<GetCampaignSummaryListResponse>(_GetCampaignSummaryListResponse_QNAME, GetCampaignSummaryListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAndAddUpdateUrlResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "createAndAddUpdateUrlResponse")
    public JAXBElement<CreateAndAddUpdateUrlResponse> createCreateAndAddUpdateUrlResponse(CreateAndAddUpdateUrlResponse value) {
        return new JAXBElement<CreateAndAddUpdateUrlResponse>(_CreateAndAddUpdateUrlResponse_QNAME, CreateAndAddUpdateUrlResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SegmentationAddStringDemographicCriteriaByObj }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "segmentationAddStringDemographicCriteriaByObj")
    public JAXBElement<SegmentationAddStringDemographicCriteriaByObj> createSegmentationAddStringDemographicCriteriaByObj(SegmentationAddStringDemographicCriteriaByObj value) {
        return new JAXBElement<SegmentationAddStringDemographicCriteriaByObj>(_SegmentationAddStringDemographicCriteriaByObj_QNAME, SegmentationAddStringDemographicCriteriaByObj.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllBannerTrackableLinks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "getAllBannerTrackableLinks")
    public JAXBElement<GetAllBannerTrackableLinks> createGetAllBannerTrackableLinks(GetAllBannerTrackableLinks value) {
        return new JAXBElement<GetAllBannerTrackableLinks>(_GetAllBannerTrackableLinks_QNAME, GetAllBannerTrackableLinks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCampaignByObj }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "updateCampaignByObj")
    public JAXBElement<UpdateCampaignByObj> createUpdateCampaignByObj(UpdateCampaignByObj value) {
        return new JAXBElement<UpdateCampaignByObj>(_UpdateCampaignByObj_QNAME, UpdateCampaignByObj.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNotValidatedSenders }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "getNotValidatedSenders")
    public JAXBElement<GetNotValidatedSenders> createGetNotValidatedSenders(GetNotValidatedSenders value) {
        return new JAXBElement<GetNotValidatedSenders>(_GetNotValidatedSenders_QNAME, GetNotValidatedSenders.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBannerSummaryList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "getBannerSummaryList")
    public JAXBElement<GetBannerSummaryList> createGetBannerSummaryList(GetBannerSummaryList value) {
        return new JAXBElement<GetBannerSummaryList>(_GetBannerSummaryList_QNAME, GetBannerSummaryList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveTestMemberResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "removeTestMemberResponse")
    public JAXBElement<RemoveTestMemberResponse> createRemoveTestMemberResponse(RemoveTestMemberResponse value) {
        return new JAXBElement<RemoveTestMemberResponse>(_RemoveTestMemberResponse_QNAME, RemoveTestMemberResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestCampaignByMember }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "testCampaignByMember")
    public JAXBElement<TestCampaignByMember> createTestCampaignByMember(TestCampaignByMember value) {
        return new JAXBElement<TestCampaignByMember>(_TestCampaignByMember_QNAME, TestCampaignByMember.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SegmentationUpdateRecencyCriteriaByObj }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "segmentationUpdateRecencyCriteriaByObj")
    public JAXBElement<SegmentationUpdateRecencyCriteriaByObj> createSegmentationUpdateRecencyCriteriaByObj(SegmentationUpdateRecencyCriteriaByObj value) {
        return new JAXBElement<SegmentationUpdateRecencyCriteriaByObj>(_SegmentationUpdateRecencyCriteriaByObj_QNAME, SegmentationUpdateRecencyCriteriaByObj.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCampaignsByStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "getCampaignsByStatusResponse")
    public JAXBElement<GetCampaignsByStatusResponse> createGetCampaignsByStatusResponse(GetCampaignsByStatusResponse value) {
        return new JAXBElement<GetCampaignsByStatusResponse>(_GetCampaignsByStatusResponse_QNAME, GetCampaignsByStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateActionUrl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "createActionUrl")
    public JAXBElement<CreateActionUrl> createCreateActionUrl(CreateActionUrl value) {
        return new JAXBElement<CreateActionUrl>(_CreateActionUrl_QNAME, CreateActionUrl.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateTestGroupByObjResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "createTestGroupByObjResponse")
    public JAXBElement<CreateTestGroupByObjResponse> createCreateTestGroupByObjResponse(CreateTestGroupByObjResponse value) {
        return new JAXBElement<CreateTestGroupByObjResponse>(_CreateTestGroupByObjResponse_QNAME, CreateTestGroupByObjResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CloseApiConnection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "closeApiConnection")
    public JAXBElement<CloseApiConnection> createCloseApiConnection(CloseApiConnection value) {
        return new JAXBElement<CloseApiConnection>(_CloseApiConnection_QNAME, CloseApiConnection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateUpdateBannerLink }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "createUpdateBannerLink")
    public JAXBElement<CreateUpdateBannerLink> createCreateUpdateBannerLink(CreateUpdateBannerLink value) {
        return new JAXBElement<CreateUpdateBannerLink>(_CreateUpdateBannerLink_QNAME, CreateUpdateBannerLink.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UntrackLinkByOrderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "untrackLinkByOrderResponse")
    public JAXBElement<UntrackLinkByOrderResponse> createUntrackLinkByOrderResponse(UntrackLinkByOrderResponse value) {
        return new JAXBElement<UntrackLinkByOrderResponse>(_UntrackLinkByOrderResponse_QNAME, UntrackLinkByOrderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCampaignWithAnalyticsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "createCampaignWithAnalyticsResponse")
    public JAXBElement<CreateCampaignWithAnalyticsResponse> createCreateCampaignWithAnalyticsResponse(CreateCampaignWithAnalyticsResponse value) {
        return new JAXBElement<CreateCampaignWithAnalyticsResponse>(_CreateCampaignWithAnalyticsResponse_QNAME, CreateCampaignWithAnalyticsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCampaignSnapshot }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "getCampaignSnapshot")
    public JAXBElement<GetCampaignSnapshot> createGetCampaignSnapshot(GetCampaignSnapshot value) {
        return new JAXBElement<GetCampaignSnapshot>(_GetCampaignSnapshot_QNAME, GetCampaignSnapshot.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLastBannersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "getLastBannersResponse")
    public JAXBElement<GetLastBannersResponse> createGetLastBannersResponse(GetLastBannersResponse value) {
        return new JAXBElement<GetLastBannersResponse>(_GetLastBannersResponse_QNAME, GetLastBannersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsHtmlValid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "isHtmlValid")
    public JAXBElement<IsHtmlValid> createIsHtmlValid(IsHtmlValid value) {
        return new JAXBElement<IsHtmlValid>(_IsHtmlValid_QNAME, IsHtmlValid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SegmentationDeleteSegmentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "segmentationDeleteSegmentResponse")
    public JAXBElement<SegmentationDeleteSegmentResponse> createSegmentationDeleteSegmentResponse(SegmentationDeleteSegmentResponse value) {
        return new JAXBElement<SegmentationDeleteSegmentResponse>(_SegmentationDeleteSegmentResponse_QNAME, SegmentationDeleteSegmentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMailingListsByField }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "getMailingListsByField")
    public JAXBElement<GetMailingListsByField> createGetMailingListsByField(GetMailingListsByField value) {
        return new JAXBElement<GetMailingListsByField>(_GetMailingListsByField_QNAME, GetMailingListsByField.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBannerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "getBannerResponse")
    public JAXBElement<GetBannerResponse> createGetBannerResponse(GetBannerResponse value) {
        return new JAXBElement<GetBannerResponse>(_GetBannerResponse_QNAME, GetBannerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteSegmentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "deleteSegmentResponse")
    public JAXBElement<DeleteSegmentResponse> createDeleteSegmentResponse(DeleteSegmentResponse value) {
        return new JAXBElement<DeleteSegmentResponse>(_DeleteSegmentResponse_QNAME, DeleteSegmentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllTrackableLinks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "getAllTrackableLinks")
    public JAXBElement<GetAllTrackableLinks> createGetAllTrackableLinks(GetAllTrackableLinks value) {
        return new JAXBElement<GetAllTrackableLinks>(_GetAllTrackableLinks_QNAME, GetAllTrackableLinks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApiPartnerConnectionResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "partnerConnectionResult")
    public JAXBElement<ApiPartnerConnectionResult> createPartnerConnectionResult(ApiPartnerConnectionResult value) {
        return new JAXBElement<ApiPartnerConnectionResult>(_PartnerConnectionResult_QNAME, ApiPartnerConnectionResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLastMailingListsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "getLastMailingListsResponse")
    public JAXBElement<GetLastMailingListsResponse> createGetLastMailingListsResponse(GetLastMailingListsResponse value) {
        return new JAXBElement<GetLastMailingListsResponse>(_GetLastMailingListsResponse_QNAME, GetLastMailingListsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCombinedSegment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "createCombinedSegment")
    public JAXBElement<CreateCombinedSegment> createCreateCombinedSegment(CreateCombinedSegment value) {
        return new JAXBElement<CreateCombinedSegment>(_CreateCombinedSegment_QNAME, CreateCombinedSegment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateSmsMessageByObjResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "createSmsMessageByObjResponse")
    public JAXBElement<CreateSmsMessageByObjResponse> createCreateSmsMessageByObjResponse(CreateSmsMessageByObjResponse value) {
        return new JAXBElement<CreateSmsMessageByObjResponse>(_CreateSmsMessageByObjResponse_QNAME, CreateSmsMessageByObjResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApiBannerLink }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "bannerLink")
    public JAXBElement<ApiBannerLink> createBannerLink(ApiBannerLink value) {
        return new JAXBElement<ApiBannerLink>(_BannerLink_QNAME, ApiBannerLink.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SegmentationGetSegmentList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "segmentationGetSegmentList")
    public JAXBElement<SegmentationGetSegmentList> createSegmentationGetSegmentList(SegmentationGetSegmentList value) {
        return new JAXBElement<SegmentationGetSegmentList>(_SegmentationGetSegmentList_QNAME, SegmentationGetSegmentList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateBannerByObj }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "createBannerByObj")
    public JAXBElement<CreateBannerByObj> createCreateBannerByObj(CreateBannerByObj value) {
        return new JAXBElement<CreateBannerByObj>(_CreateBannerByObj_QNAME, CreateBannerByObj.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SegmentationCountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "segmentationCountResponse")
    public JAXBElement<SegmentationCountResponse> createSegmentationCountResponse(SegmentationCountResponse value) {
        return new JAXBElement<SegmentationCountResponse>(_SegmentationCountResponse_QNAME, SegmentationCountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCampaignReportResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "getCampaignReportResponse")
    public JAXBElement<GetCampaignReportResponse> createGetCampaignReportResponse(GetCampaignReportResponse value) {
        return new JAXBElement<GetCampaignReportResponse>(_GetCampaignReportResponse_QNAME, GetCampaignReportResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteTestGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "deleteTestGroup")
    public JAXBElement<DeleteTestGroup> createDeleteTestGroup(DeleteTestGroup value) {
        return new JAXBElement<DeleteTestGroup>(_DeleteTestGroup_QNAME, DeleteTestGroup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLastSegmentsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "getLastSegmentsResponse")
    public JAXBElement<GetLastSegmentsResponse> createGetLastSegmentsResponse(GetLastSegmentsResponse value) {
        return new JAXBElement<GetLastSegmentsResponse>(_GetLastSegmentsResponse_QNAME, GetLastSegmentsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SegmentationCreateInclusionExclusionCriteriaByObjResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "segmentationCreateInclusionExclusionCriteriaByObjResponse")
    public JAXBElement<SegmentationCreateInclusionExclusionCriteriaByObjResponse> createSegmentationCreateInclusionExclusionCriteriaByObjResponse(SegmentationCreateInclusionExclusionCriteriaByObjResponse value) {
        return new JAXBElement<SegmentationCreateInclusionExclusionCriteriaByObjResponse>(_SegmentationCreateInclusionExclusionCriteriaByObjResponse_QNAME, SegmentationCreateInclusionExclusionCriteriaByObjResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCampaignWithAnalytics }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "createCampaignWithAnalytics")
    public JAXBElement<CreateCampaignWithAnalytics> createCreateCampaignWithAnalytics(CreateCampaignWithAnalytics value) {
        return new JAXBElement<CreateCampaignWithAnalytics>(_CreateCampaignWithAnalytics_QNAME, CreateCampaignWithAnalytics.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTestMembersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "getTestMembersResponse")
    public JAXBElement<GetTestMembersResponse> createGetTestMembersResponse(GetTestMembersResponse value) {
        return new JAXBElement<GetTestMembersResponse>(_GetTestMembersResponse_QNAME, GetTestMembersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteSegment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "deleteSegment")
    public JAXBElement<DeleteSegment> createDeleteSegment(DeleteSegment value) {
        return new JAXBElement<DeleteSegment>(_DeleteSegment_QNAME, DeleteSegment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApiTrackableLinkCriteria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "trackableLinkCriteria")
    public JAXBElement<ApiTrackableLinkCriteria> createTrackableLinkCriteria(ApiTrackableLinkCriteria value) {
        return new JAXBElement<ApiTrackableLinkCriteria>(_TrackableLinkCriteria_QNAME, ApiTrackableLinkCriteria.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SegmentationDeleteSegment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "segmentationDeleteSegment")
    public JAXBElement<SegmentationDeleteSegment> createSegmentationDeleteSegment(SegmentationDeleteSegment value) {
        return new JAXBElement<SegmentationDeleteSegment>(_SegmentationDeleteSegment_QNAME, SegmentationDeleteSegment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTestMemberResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "getTestMemberResponse")
    public JAXBElement<GetTestMemberResponse> createGetTestMemberResponse(GetTestMemberResponse value) {
        return new JAXBElement<GetTestMemberResponse>(_GetTestMemberResponse_QNAME, GetTestMemberResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetValidatedAltSendersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "getValidatedAltSendersResponse")
    public JAXBElement<GetValidatedAltSendersResponse> createGetValidatedAltSendersResponse(GetValidatedAltSendersResponse value) {
        return new JAXBElement<GetValidatedAltSendersResponse>(_GetValidatedAltSendersResponse_QNAME, GetValidatedAltSendersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UntrackBannerLinkByOrderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "untrackBannerLinkByOrderResponse")
    public JAXBElement<UntrackBannerLinkByOrderResponse> createUntrackBannerLinkByOrderResponse(UntrackBannerLinkByOrderResponse value) {
        return new JAXBElement<UntrackBannerLinkByOrderResponse>(_UntrackBannerLinkByOrderResponse_QNAME, UntrackBannerLinkByOrderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateStandardUrlResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "createStandardUrlResponse")
    public JAXBElement<CreateStandardUrlResponse> createCreateStandardUrlResponse(CreateStandardUrlResponse value) {
        return new JAXBElement<CreateStandardUrlResponse>(_CreateStandardUrlResponse_QNAME, CreateStandardUrlResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SegmentationCreateInclusionExclusionCriteriaByObj }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "segmentationCreateInclusionExclusionCriteriaByObj")
    public JAXBElement<SegmentationCreateInclusionExclusionCriteriaByObj> createSegmentationCreateInclusionExclusionCriteriaByObj(SegmentationCreateInclusionExclusionCriteriaByObj value) {
        return new JAXBElement<SegmentationCreateInclusionExclusionCriteriaByObj>(_SegmentationCreateInclusionExclusionCriteriaByObj_QNAME, SegmentationCreateInclusionExclusionCriteriaByObj.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnpostCampaign }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "unpostCampaign")
    public JAXBElement<UnpostCampaign> createUnpostCampaign(UnpostCampaign value) {
        return new JAXBElement<UnpostCampaign>(_UnpostCampaign_QNAME, UnpostCampaign.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SegmentationAddSerieActionCriteriaByObj }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "segmentationAddSerieActionCriteriaByObj")
    public JAXBElement<SegmentationAddSerieActionCriteriaByObj> createSegmentationAddSerieActionCriteriaByObj(SegmentationAddSerieActionCriteriaByObj value) {
        return new JAXBElement<SegmentationAddSerieActionCriteriaByObj>(_SegmentationAddSerieActionCriteriaByObj_QNAME, SegmentationAddSerieActionCriteriaByObj.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateStandardUrl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "createStandardUrl")
    public JAXBElement<CreateStandardUrl> createCreateStandardUrl(CreateStandardUrl value) {
        return new JAXBElement<CreateStandardUrl>(_CreateStandardUrl_QNAME, CreateStandardUrl.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAndAddActionBannerLink }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "createAndAddActionBannerLink")
    public JAXBElement<CreateAndAddActionBannerLink> createCreateAndAddActionBannerLink(CreateAndAddActionBannerLink value) {
        return new JAXBElement<CreateAndAddActionBannerLink>(_CreateAndAddActionBannerLink_QNAME, CreateAndAddActionBannerLink.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMailingListsByFieldResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "getMailingListsByFieldResponse")
    public JAXBElement<GetMailingListsByFieldResponse> createGetMailingListsByFieldResponse(GetMailingListsByFieldResponse value) {
        return new JAXBElement<GetMailingListsByFieldResponse>(_GetMailingListsByFieldResponse_QNAME, GetMailingListsByFieldResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApiInclusionExclusionCriteria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "inclusionExclusionCriteria")
    public JAXBElement<ApiInclusionExclusionCriteria> createInclusionExclusionCriteria(ApiInclusionExclusionCriteria value) {
        return new JAXBElement<ApiInclusionExclusionCriteria>(_InclusionExclusionCriteria_QNAME, ApiInclusionExclusionCriteria.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteUrlResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "deleteUrlResponse")
    public JAXBElement<DeleteUrlResponse> createDeleteUrlResponse(DeleteUrlResponse value) {
        return new JAXBElement<DeleteUrlResponse>(_DeleteUrlResponse_QNAME, DeleteUrlResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SegmentationAddRecencyCriteriaByObj }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "segmentationAddRecencyCriteriaByObj")
    public JAXBElement<SegmentationAddRecencyCriteriaByObj> createSegmentationAddRecencyCriteriaByObj(SegmentationAddRecencyCriteriaByObj value) {
        return new JAXBElement<SegmentationAddRecencyCriteriaByObj>(_SegmentationAddRecencyCriteriaByObj_QNAME, SegmentationAddRecencyCriteriaByObj.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SegmentationGetSegmentByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "segmentationGetSegmentByIdResponse")
    public JAXBElement<SegmentationGetSegmentByIdResponse> createSegmentationGetSegmentByIdResponse(SegmentationGetSegmentByIdResponse value) {
        return new JAXBElement<SegmentationGetSegmentByIdResponse>(_SegmentationGetSegmentByIdResponse_QNAME, SegmentationGetSegmentByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAndAddStandardBannerLinkResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "createAndAddStandardBannerLinkResponse")
    public JAXBElement<CreateAndAddStandardBannerLinkResponse> createCreateAndAddStandardBannerLinkResponse(CreateAndAddStandardBannerLinkResponse value) {
        return new JAXBElement<CreateAndAddStandardBannerLinkResponse>(_CreateAndAddStandardBannerLinkResponse_QNAME, CreateAndAddStandardBannerLinkResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SegmentationUpdateDateDemographicCriteriaByObj }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "segmentationUpdateDateDemographicCriteriaByObj")
    public JAXBElement<SegmentationUpdateDateDemographicCriteriaByObj> createSegmentationUpdateDateDemographicCriteriaByObj(SegmentationUpdateDateDemographicCriteriaByObj value) {
        return new JAXBElement<SegmentationUpdateDateDemographicCriteriaByObj>(_SegmentationUpdateDateDemographicCriteriaByObj_QNAME, SegmentationUpdateDateDemographicCriteriaByObj.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateBannerByObjResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "createBannerByObjResponse")
    public JAXBElement<CreateBannerByObjResponse> createCreateBannerByObjResponse(CreateBannerByObjResponse value) {
        return new JAXBElement<CreateBannerByObjResponse>(_CreateBannerByObjResponse_QNAME, CreateBannerByObjResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmailMessagePreviewResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "getEmailMessagePreviewResponse")
    public JAXBElement<GetEmailMessagePreviewResponse> createGetEmailMessagePreviewResponse(GetEmailMessagePreviewResponse value) {
        return new JAXBElement<GetEmailMessagePreviewResponse>(_GetEmailMessagePreviewResponse_QNAME, GetEmailMessagePreviewResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateUnsubscribeBannerLink }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "createUnsubscribeBannerLink")
    public JAXBElement<CreateUnsubscribeBannerLink> createCreateUnsubscribeBannerLink(CreateUnsubscribeBannerLink value) {
        return new JAXBElement<CreateUnsubscribeBannerLink>(_CreateUnsubscribeBannerLink_QNAME, CreateUnsubscribeBannerLink.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCampaignResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "updateCampaignResponse")
    public JAXBElement<UpdateCampaignResponse> createUpdateCampaignResponse(UpdateCampaignResponse value) {
        return new JAXBElement<UpdateCampaignResponse>(_UpdateCampaignResponse_QNAME, UpdateCampaignResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAndAddStandardUrlResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "createAndAddStandardUrlResponse")
    public JAXBElement<CreateAndAddStandardUrlResponse> createCreateAndAddStandardUrlResponse(CreateAndAddStandardUrlResponse value) {
        return new JAXBElement<CreateAndAddStandardUrlResponse>(_CreateAndAddStandardUrlResponse_QNAME, CreateAndAddStandardUrlResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCampaignsByFieldResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "getCampaignsByFieldResponse")
    public JAXBElement<GetCampaignsByFieldResponse> createGetCampaignsByFieldResponse(GetCampaignsByFieldResponse value) {
        return new JAXBElement<GetCampaignsByFieldResponse>(_GetCampaignsByFieldResponse_QNAME, GetCampaignsByFieldResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBannerLinkByOrderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "getBannerLinkByOrderResponse")
    public JAXBElement<GetBannerLinkByOrderResponse> createGetBannerLinkByOrderResponse(GetBannerLinkByOrderResponse value) {
        return new JAXBElement<GetBannerLinkByOrderResponse>(_GetBannerLinkByOrderResponse_QNAME, GetBannerLinkByOrderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SegmentationUpdateInclusionExclusionCriteriaByObj }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "segmentationUpdateInclusionExclusionCriteriaByObj")
    public JAXBElement<SegmentationUpdateInclusionExclusionCriteriaByObj> createSegmentationUpdateInclusionExclusionCriteriaByObj(SegmentationUpdateInclusionExclusionCriteriaByObj value) {
        return new JAXBElement<SegmentationUpdateInclusionExclusionCriteriaByObj>(_SegmentationUpdateInclusionExclusionCriteriaByObj_QNAME, SegmentationUpdateInclusionExclusionCriteriaByObj.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateSQLSegmentByObj }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "createSQLSegmentByObj")
    public JAXBElement<CreateSQLSegmentByObj> createCreateSQLSegmentByObj(CreateSQLSegmentByObj value) {
        return new JAXBElement<CreateSQLSegmentByObj>(_CreateSQLSegmentByObj_QNAME, CreateSQLSegmentByObj.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateActionBannerLinkResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "createActionBannerLinkResponse")
    public JAXBElement<CreateActionBannerLinkResponse> createCreateActionBannerLinkResponse(CreateActionBannerLinkResponse value) {
        return new JAXBElement<CreateActionBannerLinkResponse>(_CreateActionBannerLinkResponse_QNAME, CreateActionBannerLinkResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBannerLinkByOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "getBannerLinkByOrder")
    public JAXBElement<GetBannerLinkByOrder> createGetBannerLinkByOrder(GetBannerLinkByOrder value) {
        return new JAXBElement<GetBannerLinkByOrder>(_GetBannerLinkByOrder_QNAME, GetBannerLinkByOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAndAddActionUrl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "createAndAddActionUrl")
    public JAXBElement<CreateAndAddActionUrl> createCreateAndAddActionUrl(CreateAndAddActionUrl value) {
        return new JAXBElement<CreateAndAddActionUrl>(_CreateAndAddActionUrl_QNAME, CreateAndAddActionUrl.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SegmentationAddCampaignTrackableLinkCriteriaByObjResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "segmentationAddCampaignTrackableLinkCriteriaByObjResponse")
    public JAXBElement<SegmentationAddCampaignTrackableLinkCriteriaByObjResponse> createSegmentationAddCampaignTrackableLinkCriteriaByObjResponse(SegmentationAddCampaignTrackableLinkCriteriaByObjResponse value) {
        return new JAXBElement<SegmentationAddCampaignTrackableLinkCriteriaByObjResponse>(_SegmentationAddCampaignTrackableLinkCriteriaByObjResponse_QNAME, SegmentationAddCampaignTrackableLinkCriteriaByObjResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SegmentationUpdateSerieActionCriteriaByObj }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "segmentationUpdateSerieActionCriteriaByObj")
    public JAXBElement<SegmentationUpdateSerieActionCriteriaByObj> createSegmentationUpdateSerieActionCriteriaByObj(SegmentationUpdateSerieActionCriteriaByObj value) {
        return new JAXBElement<SegmentationUpdateSerieActionCriteriaByObj>(_SegmentationUpdateSerieActionCriteriaByObj_QNAME, SegmentationUpdateSerieActionCriteriaByObj.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrackAllBannerLinksResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "trackAllBannerLinksResponse")
    public JAXBElement<TrackAllBannerLinksResponse> createTrackAllBannerLinksResponse(TrackAllBannerLinksResponse value) {
        return new JAXBElement<TrackAllBannerLinksResponse>(_TrackAllBannerLinksResponse_QNAME, TrackAllBannerLinksResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateEmailMessageByObj }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "createEmailMessageByObj")
    public JAXBElement<CreateEmailMessageByObj> createCreateEmailMessageByObj(CreateEmailMessageByObj value) {
        return new JAXBElement<CreateEmailMessageByObj>(_CreateEmailMessageByObj_QNAME, CreateEmailMessageByObj.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateUpdateUrl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "createUpdateUrl")
    public JAXBElement<CreateUpdateUrl> createCreateUpdateUrl(CreateUpdateUrl value) {
        return new JAXBElement<CreateUpdateUrl>(_CreateUpdateUrl_QNAME, CreateUpdateUrl.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UntrackAllBannerLinks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "untrackAllBannerLinks")
    public JAXBElement<UntrackAllBannerLinks> createUntrackAllBannerLinks(UntrackAllBannerLinks value) {
        return new JAXBElement<UntrackAllBannerLinks>(_UntrackAllBannerLinks_QNAME, UntrackAllBannerLinks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBanner }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "getBanner")
    public JAXBElement<GetBanner> createGetBanner(GetBanner value) {
        return new JAXBElement<GetBanner>(_GetBanner_QNAME, GetBanner.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnpauseCampaignResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "unpauseCampaignResponse")
    public JAXBElement<UnpauseCampaignResponse> createUnpauseCampaignResponse(UnpauseCampaignResponse value) {
        return new JAXBElement<UnpauseCampaignResponse>(_UnpauseCampaignResponse_QNAME, UnpauseCampaignResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateMailingList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "updateMailingList")
    public JAXBElement<UpdateMailingList> createUpdateMailingList(UpdateMailingList value) {
        return new JAXBElement<UpdateMailingList>(_UpdateMailingList_QNAME, UpdateMailingList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmailMessagesByField }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "getEmailMessagesByField")
    public JAXBElement<GetEmailMessagesByField> createGetEmailMessagesByField(GetEmailMessagesByField value) {
        return new JAXBElement<GetEmailMessagesByField>(_GetEmailMessagesByField_QNAME, GetEmailMessagesByField.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestEmailMessageByGroupResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "testEmailMessageByGroupResponse")
    public JAXBElement<TestEmailMessageByGroupResponse> createTestEmailMessageByGroupResponse(TestEmailMessageByGroupResponse value) {
        return new JAXBElement<TestEmailMessageByGroupResponse>(_TestEmailMessageByGroupResponse_QNAME, TestEmailMessageByGroupResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAndAddUpdateBannerLink }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "createAndAddUpdateBannerLink")
    public JAXBElement<CreateAndAddUpdateBannerLink> createCreateAndAddUpdateBannerLink(CreateAndAddUpdateBannerLink value) {
        return new JAXBElement<CreateAndAddUpdateBannerLink>(_CreateAndAddUpdateBannerLink_QNAME, CreateAndAddUpdateBannerLink.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MembersCountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "membersCountResponse")
    public JAXBElement<MembersCountResponse> createMembersCountResponse(MembersCountResponse value) {
        return new JAXBElement<MembersCountResponse>(_MembersCountResponse_QNAME, MembersCountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBannersByPeriod }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "getBannersByPeriod")
    public JAXBElement<GetBannersByPeriod> createGetBannersByPeriod(GetBannersByPeriod value) {
        return new JAXBElement<GetBannersByPeriod>(_GetBannersByPeriod_QNAME, GetBannersByPeriod.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SegmentationUpdateSegmentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "segmentationUpdateSegmentResponse")
    public JAXBElement<SegmentationUpdateSegmentResponse> createSegmentationUpdateSegmentResponse(SegmentationUpdateSegmentResponse value) {
        return new JAXBElement<SegmentationUpdateSegmentResponse>(_SegmentationUpdateSegmentResponse_QNAME, SegmentationUpdateSegmentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLastCampaignsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "getLastCampaignsResponse")
    public JAXBElement<GetLastCampaignsResponse> createGetLastCampaignsResponse(GetLastCampaignsResponse value) {
        return new JAXBElement<GetLastCampaignsResponse>(_GetLastCampaignsResponse_QNAME, GetLastCampaignsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateBannerLinkByField }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "updateBannerLinkByField")
    public JAXBElement<UpdateBannerLinkByField> createUpdateBannerLinkByField(UpdateBannerLinkByField value) {
        return new JAXBElement<UpdateBannerLinkByField>(_UpdateBannerLinkByField_QNAME, UpdateBannerLinkByField.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CloseApiConnectionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "closeApiConnectionResponse")
    public JAXBElement<CloseApiConnectionResponse> createCloseApiConnectionResponse(CloseApiConnectionResponse value) {
        return new JAXBElement<CloseApiConnectionResponse>(_CloseApiConnectionResponse_QNAME, CloseApiConnectionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpenPartnerConnectionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "openPartnerConnectionResponse")
    public JAXBElement<OpenPartnerConnectionResponse> createOpenPartnerConnectionResponse(OpenPartnerConnectionResponse value) {
        return new JAXBElement<OpenPartnerConnectionResponse>(_OpenPartnerConnectionResponse_QNAME, OpenPartnerConnectionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SegmentationUpdateCampaignActionCriteriaByObj }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "segmentationUpdateCampaignActionCriteriaByObj")
    public JAXBElement<SegmentationUpdateCampaignActionCriteriaByObj> createSegmentationUpdateCampaignActionCriteriaByObj(SegmentationUpdateCampaignActionCriteriaByObj value) {
        return new JAXBElement<SegmentationUpdateCampaignActionCriteriaByObj>(_SegmentationUpdateCampaignActionCriteriaByObj_QNAME, SegmentationUpdateCampaignActionCriteriaByObj.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddSegmentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "addSegmentResponse")
    public JAXBElement<AddSegmentResponse> createAddSegmentResponse(AddSegmentResponse value) {
        return new JAXBElement<AddSegmentResponse>(_AddSegmentResponse_QNAME, AddSegmentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestCampaignByMemberResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "testCampaignByMemberResponse")
    public JAXBElement<TestCampaignByMemberResponse> createTestCampaignByMemberResponse(TestCampaignByMemberResponse value) {
        return new JAXBElement<TestCampaignByMemberResponse>(_TestCampaignByMemberResponse_QNAME, TestCampaignByMemberResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostCampaign }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "postCampaign")
    public JAXBElement<PostCampaign> createPostCampaign(PostCampaign value) {
        return new JAXBElement<PostCampaign>(_PostCampaign_QNAME, PostCampaign.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAndAddPersonalisedUrlResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "createAndAddPersonalisedUrlResponse")
    public JAXBElement<CreateAndAddPersonalisedUrlResponse> createCreateAndAddPersonalisedUrlResponse(CreateAndAddPersonalisedUrlResponse value) {
        return new JAXBElement<CreateAndAddPersonalisedUrlResponse>(_CreateAndAddPersonalisedUrlResponse_QNAME, CreateAndAddPersonalisedUrlResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestSmsMessageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "testSmsMessageResponse")
    public JAXBElement<TestSmsMessageResponse> createTestSmsMessageResponse(TestSmsMessageResponse value) {
        return new JAXBElement<TestSmsMessageResponse>(_TestSmsMessageResponse_QNAME, TestSmsMessageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAndAddUnsubscribeBannerLink }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "createAndAddUnsubscribeBannerLink")
    public JAXBElement<CreateAndAddUnsubscribeBannerLink> createCreateAndAddUnsubscribeBannerLink(CreateAndAddUnsubscribeBannerLink value) {
        return new JAXBElement<CreateAndAddUnsubscribeBannerLink>(_CreateAndAddUnsubscribeBannerLink_QNAME, CreateAndAddUnsubscribeBannerLink.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllBannerTrackedLinksResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "getAllBannerTrackedLinksResponse")
    public JAXBElement<GetAllBannerTrackedLinksResponse> createGetAllBannerTrackedLinksResponse(GetAllBannerTrackedLinksResponse value) {
        return new JAXBElement<GetAllBannerTrackedLinksResponse>(_GetAllBannerTrackedLinksResponse_QNAME, GetAllBannerTrackedLinksResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateStandardBannerLink }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "createStandardBannerLink")
    public JAXBElement<CreateStandardBannerLink> createCreateStandardBannerLink(CreateStandardBannerLink value) {
        return new JAXBElement<CreateStandardBannerLink>(_CreateStandardBannerLink_QNAME, CreateStandardBannerLink.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCampaignByObjResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "createCampaignByObjResponse")
    public JAXBElement<CreateCampaignByObjResponse> createCreateCampaignByObjResponse(CreateCampaignByObjResponse value) {
        return new JAXBElement<CreateCampaignByObjResponse>(_CreateCampaignByObjResponse_QNAME, CreateCampaignByObjResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAndAddMirrorUrl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "createAndAddMirrorUrl")
    public JAXBElement<CreateAndAddMirrorUrl> createCreateAndAddMirrorUrl(CreateAndAddMirrorUrl value) {
        return new JAXBElement<CreateAndAddMirrorUrl>(_CreateAndAddMirrorUrl_QNAME, CreateAndAddMirrorUrl.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateUnsubscribeBannerLinkResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "createUnsubscribeBannerLinkResponse")
    public JAXBElement<CreateUnsubscribeBannerLinkResponse> createCreateUnsubscribeBannerLinkResponse(CreateUnsubscribeBannerLinkResponse value) {
        return new JAXBElement<CreateUnsubscribeBannerLinkResponse>(_CreateUnsubscribeBannerLinkResponse_QNAME, CreateUnsubscribeBannerLinkResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateUpdateUrlResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "createUpdateUrlResponse")
    public JAXBElement<CreateUpdateUrlResponse> createCreateUpdateUrlResponse(CreateUpdateUrlResponse value) {
        return new JAXBElement<CreateUpdateUrlResponse>(_CreateUpdateUrlResponse_QNAME, CreateUpdateUrlResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateEmailMessageByObjResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "createEmailMessageByObjResponse")
    public JAXBElement<CreateEmailMessageByObjResponse> createCreateEmailMessageByObjResponse(CreateEmailMessageByObjResponse value) {
        return new JAXBElement<CreateEmailMessageByObjResponse>(_CreateEmailMessageByObjResponse_QNAME, CreateEmailMessageByObjResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateTestGroupByObj }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "createTestGroupByObj")
    public JAXBElement<CreateTestGroupByObj> createCreateTestGroupByObj(CreateTestGroupByObj value) {
        return new JAXBElement<CreateTestGroupByObj>(_CreateTestGroupByObj_QNAME, CreateTestGroupByObj.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTestGroupResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "getTestGroupResponse")
    public JAXBElement<GetTestGroupResponse> createGetTestGroupResponse(GetTestGroupResponse value) {
        return new JAXBElement<GetTestGroupResponse>(_GetTestGroupResponse_QNAME, GetTestGroupResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBannerSummaryListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "getBannerSummaryListResponse")
    public JAXBElement<GetBannerSummaryListResponse> createGetBannerSummaryListResponse(GetBannerSummaryListResponse value) {
        return new JAXBElement<GetBannerSummaryListResponse>(_GetBannerSummaryListResponse_QNAME, GetBannerSummaryListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUrlByOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "getUrlByOrder")
    public JAXBElement<GetUrlByOrder> createGetUrlByOrder(GetUrlByOrder value) {
        return new JAXBElement<GetUrlByOrder>(_GetUrlByOrder_QNAME, GetUrlByOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SegmentationAddSerieTrackableLinkCriteriaByObj }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "segmentationAddSerieTrackableLinkCriteriaByObj")
    public JAXBElement<SegmentationAddSerieTrackableLinkCriteriaByObj> createSegmentationAddSerieTrackableLinkCriteriaByObj(SegmentationAddSerieTrackableLinkCriteriaByObj value) {
        return new JAXBElement<SegmentationAddSerieTrackableLinkCriteriaByObj>(_SegmentationAddSerieTrackableLinkCriteriaByObj_QNAME, SegmentationAddSerieTrackableLinkCriteriaByObj.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateBannerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "updateBannerResponse")
    public JAXBElement<UpdateBannerResponse> createUpdateBannerResponse(UpdateBannerResponse value) {
        return new JAXBElement<UpdateBannerResponse>(_UpdateBannerResponse_QNAME, UpdateBannerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSegmentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "getSegmentResponse")
    public JAXBElement<GetSegmentResponse> createGetSegmentResponse(GetSegmentResponse value) {
        return new JAXBElement<GetSegmentResponse>(_GetSegmentResponse_QNAME, GetSegmentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SegmentationUpdateInclusionExclusionCriteriaByObjResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "segmentationUpdateInclusionExclusionCriteriaByObjResponse")
    public JAXBElement<SegmentationUpdateInclusionExclusionCriteriaByObjResponse> createSegmentationUpdateInclusionExclusionCriteriaByObjResponse(SegmentationUpdateInclusionExclusionCriteriaByObjResponse value) {
        return new JAXBElement<SegmentationUpdateInclusionExclusionCriteriaByObjResponse>(_SegmentationUpdateInclusionExclusionCriteriaByObjResponse_QNAME, SegmentationUpdateInclusionExclusionCriteriaByObjResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateMessageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "updateMessageResponse")
    public JAXBElement<UpdateMessageResponse> createUpdateMessageResponse(UpdateMessageResponse value) {
        return new JAXBElement<UpdateMessageResponse>(_UpdateMessageResponse_QNAME, UpdateMessageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MailingListCountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "mailingListCountResponse")
    public JAXBElement<MailingListCountResponse> createMailingListCountResponse(MailingListCountResponse value) {
        return new JAXBElement<MailingListCountResponse>(_MailingListCountResponse_QNAME, MailingListCountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLastBanners }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "getLastBanners")
    public JAXBElement<GetLastBanners> createGetLastBanners(GetLastBanners value) {
        return new JAXBElement<GetLastBanners>(_GetLastBanners_QNAME, GetLastBanners.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddTestMemberResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "addTestMemberResponse")
    public JAXBElement<AddTestMemberResponse> createAddTestMemberResponse(AddTestMemberResponse value) {
        return new JAXBElement<AddTestMemberResponse>(_AddTestMemberResponse_QNAME, AddTestMemberResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpenPartnerConnection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "openPartnerConnection")
    public JAXBElement<OpenPartnerConnection> createOpenPartnerConnection(OpenPartnerConnection value) {
        return new JAXBElement<OpenPartnerConnection>(_OpenPartnerConnection_QNAME, OpenPartnerConnection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateBasicSegmentByObjResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "createBasicSegmentByObjResponse")
    public JAXBElement<CreateBasicSegmentByObjResponse> createCreateBasicSegmentByObjResponse(CreateBasicSegmentByObjResponse value) {
        return new JAXBElement<CreateBasicSegmentByObjResponse>(_CreateBasicSegmentByObjResponse_QNAME, CreateBasicSegmentByObjResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBannersByFieldResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "getBannersByFieldResponse")
    public JAXBElement<GetBannersByFieldResponse> createGetBannersByFieldResponse(GetBannersByFieldResponse value) {
        return new JAXBElement<GetBannersByFieldResponse>(_GetBannersByFieldResponse_QNAME, GetBannersByFieldResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllBannerTrackableLinksResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "getAllBannerTrackableLinksResponse")
    public JAXBElement<GetAllBannerTrackableLinksResponse> createGetAllBannerTrackableLinksResponse(GetAllBannerTrackableLinksResponse value) {
        return new JAXBElement<GetAllBannerTrackableLinksResponse>(_GetAllBannerTrackableLinksResponse_QNAME, GetAllBannerTrackableLinksResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAndAddUnsubscribeUrlResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "createAndAddUnsubscribeUrlResponse")
    public JAXBElement<CreateAndAddUnsubscribeUrlResponse> createCreateAndAddUnsubscribeUrlResponse(CreateAndAddUnsubscribeUrlResponse value) {
        return new JAXBElement<CreateAndAddUnsubscribeUrlResponse>(_CreateAndAddUnsubscribeUrlResponse_QNAME, CreateAndAddUnsubscribeUrlResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateMailingListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "updateMailingListResponse")
    public JAXBElement<UpdateMailingListResponse> createUpdateMailingListResponse(UpdateMailingListResponse value) {
        return new JAXBElement<UpdateMailingListResponse>(_UpdateMailingListResponse_QNAME, UpdateMailingListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddShareLink }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "addShareLink")
    public JAXBElement<AddShareLink> createAddShareLink(AddShareLink value) {
        return new JAXBElement<AddShareLink>(_AddShareLink_QNAME, AddShareLink.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllUnusedTrackedLinks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "getAllUnusedTrackedLinks")
    public JAXBElement<GetAllUnusedTrackedLinks> createGetAllUnusedTrackedLinks(GetAllUnusedTrackedLinks value) {
        return new JAXBElement<GetAllUnusedTrackedLinks>(_GetAllUnusedTrackedLinks_QNAME, GetAllUnusedTrackedLinks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateEmailMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "createEmailMessage")
    public JAXBElement<CreateEmailMessage> createCreateEmailMessage(CreateEmailMessage value) {
        return new JAXBElement<CreateEmailMessage>(_CreateEmailMessage_QNAME, CreateEmailMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SegmentationAddStringDemographicCriteriaByObjResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "segmentationAddStringDemographicCriteriaByObjResponse")
    public JAXBElement<SegmentationAddStringDemographicCriteriaByObjResponse> createSegmentationAddStringDemographicCriteriaByObjResponse(SegmentationAddStringDemographicCriteriaByObjResponse value) {
        return new JAXBElement<SegmentationAddStringDemographicCriteriaByObjResponse>(_SegmentationAddStringDemographicCriteriaByObjResponse_QNAME, SegmentationAddStringDemographicCriteriaByObjResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBannersByPeriodResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "getBannersByPeriodResponse")
    public JAXBElement<GetBannersByPeriodResponse> createGetBannersByPeriodResponse(GetBannersByPeriodResponse value) {
        return new JAXBElement<GetBannersByPeriodResponse>(_GetBannersByPeriodResponse_QNAME, GetBannersByPeriodResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link APICampaignSummary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "campaignSummary")
    public JAXBElement<APICampaignSummary> createCampaignSummary(APICampaignSummary value) {
        return new JAXBElement<APICampaignSummary>(_CampaignSummary_QNAME, APICampaignSummary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateTestMemberResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "createTestMemberResponse")
    public JAXBElement<CreateTestMemberResponse> createCreateTestMemberResponse(CreateTestMemberResponse value) {
        return new JAXBElement<CreateTestMemberResponse>(_CreateTestMemberResponse_QNAME, CreateTestMemberResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApiRecencyCriteria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "recencyCriteria")
    public JAXBElement<ApiRecencyCriteria> createRecencyCriteria(ApiRecencyCriteria value) {
        return new JAXBElement<ApiRecencyCriteria>(_RecencyCriteria_QNAME, ApiRecencyCriteria.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SegmentationAddDataMartCriteriaByObjResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "segmentationAddDataMartCriteriaByObjResponse")
    public JAXBElement<SegmentationAddDataMartCriteriaByObjResponse> createSegmentationAddDataMartCriteriaByObjResponse(SegmentationAddDataMartCriteriaByObjResponse value) {
        return new JAXBElement<SegmentationAddDataMartCriteriaByObjResponse>(_SegmentationAddDataMartCriteriaByObjResponse_QNAME, SegmentationAddDataMartCriteriaByObjResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SegmentationAddDateDemographicCriteriaByObj }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "segmentationAddDateDemographicCriteriaByObj")
    public JAXBElement<SegmentationAddDateDemographicCriteriaByObj> createSegmentationAddDateDemographicCriteriaByObj(SegmentationAddDateDemographicCriteriaByObj value) {
        return new JAXBElement<SegmentationAddDateDemographicCriteriaByObj>(_SegmentationAddDateDemographicCriteriaByObj_QNAME, SegmentationAddDateDemographicCriteriaByObj.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SegmentationUpdateSerieActionCriteriaByObjResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "segmentationUpdateSerieActionCriteriaByObjResponse")
    public JAXBElement<SegmentationUpdateSerieActionCriteriaByObjResponse> createSegmentationUpdateSerieActionCriteriaByObjResponse(SegmentationUpdateSerieActionCriteriaByObjResponse value) {
        return new JAXBElement<SegmentationUpdateSerieActionCriteriaByObjResponse>(_SegmentationUpdateSerieActionCriteriaByObjResponse_QNAME, SegmentationUpdateSerieActionCriteriaByObjResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddTestMember }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "addTestMember")
    public JAXBElement<AddTestMember> createAddTestMember(AddTestMember value) {
        return new JAXBElement<AddTestMember>(_AddTestMember_QNAME, AddTestMember.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSmsMessagePreviewResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "getSmsMessagePreviewResponse")
    public JAXBElement<GetSmsMessagePreviewResponse> createGetSmsMessagePreviewResponse(GetSmsMessagePreviewResponse value) {
        return new JAXBElement<GetSmsMessagePreviewResponse>(_GetSmsMessagePreviewResponse_QNAME, GetSmsMessagePreviewResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLastSmsMessages }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "getLastSmsMessages")
    public JAXBElement<GetLastSmsMessages> createGetLastSmsMessages(GetLastSmsMessages value) {
        return new JAXBElement<GetLastSmsMessages>(_GetLastSmsMessages_QNAME, GetLastSmsMessages.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrackAllLinks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "trackAllLinks")
    public JAXBElement<TrackAllLinks> createTrackAllLinks(TrackAllLinks value) {
        return new JAXBElement<TrackAllLinks>(_TrackAllLinks_QNAME, TrackAllLinks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SegmentationUpdateCampaignTrackableLinkCriteriaByObj }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "segmentationUpdateCampaignTrackableLinkCriteriaByObj")
    public JAXBElement<SegmentationUpdateCampaignTrackableLinkCriteriaByObj> createSegmentationUpdateCampaignTrackableLinkCriteriaByObj(SegmentationUpdateCampaignTrackableLinkCriteriaByObj value) {
        return new JAXBElement<SegmentationUpdateCampaignTrackableLinkCriteriaByObj>(_SegmentationUpdateCampaignTrackableLinkCriteriaByObj_QNAME, SegmentationUpdateCampaignTrackableLinkCriteriaByObj.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSmsMessagePreview }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "getSmsMessagePreview")
    public JAXBElement<GetSmsMessagePreview> createGetSmsMessagePreview(GetSmsMessagePreview value) {
        return new JAXBElement<GetSmsMessagePreview>(_GetSmsMessagePreview_QNAME, GetSmsMessagePreview.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateBannerLinkByFieldResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "updateBannerLinkByFieldResponse")
    public JAXBElement<UpdateBannerLinkByFieldResponse> createUpdateBannerLinkByFieldResponse(UpdateBannerLinkByFieldResponse value) {
        return new JAXBElement<UpdateBannerLinkByFieldResponse>(_UpdateBannerLinkByFieldResponse_QNAME, UpdateBannerLinkByFieldResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddShareLinkResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "addShareLinkResponse")
    public JAXBElement<AddShareLinkResponse> createAddShareLinkResponse(AddShareLinkResponse value) {
        return new JAXBElement<AddShareLinkResponse>(_AddShareLinkResponse_QNAME, AddShareLinkResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBannerPreviewResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "getBannerPreviewResponse")
    public JAXBElement<GetBannerPreviewResponse> createGetBannerPreviewResponse(GetBannerPreviewResponse value) {
        return new JAXBElement<GetBannerPreviewResponse>(_GetBannerPreviewResponse_QNAME, GetBannerPreviewResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetValidatedAltSenders }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "getValidatedAltSenders")
    public JAXBElement<GetValidatedAltSenders> createGetValidatedAltSenders(GetValidatedAltSenders value) {
        return new JAXBElement<GetValidatedAltSenders>(_GetValidatedAltSenders_QNAME, GetValidatedAltSenders.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SegmentationGetSegmentCriteriasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "segmentationGetSegmentCriteriasResponse")
    public JAXBElement<SegmentationGetSegmentCriteriasResponse> createSegmentationGetSegmentCriteriasResponse(SegmentationGetSegmentCriteriasResponse value) {
        return new JAXBElement<SegmentationGetSegmentCriteriasResponse>(_SegmentationGetSegmentCriteriasResponse_QNAME, SegmentationGetSegmentCriteriasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateBannerByObj }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "updateBannerByObj")
    public JAXBElement<UpdateBannerByObj> createUpdateBannerByObj(UpdateBannerByObj value) {
        return new JAXBElement<UpdateBannerByObj>(_UpdateBannerByObj_QNAME, UpdateBannerByObj.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBannersByField }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "getBannersByField")
    public JAXBElement<GetBannersByField> createGetBannersByField(GetBannersByField value) {
        return new JAXBElement<GetBannersByField>(_GetBannersByField_QNAME, GetBannersByField.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateActionUrlResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "createActionUrlResponse")
    public JAXBElement<CreateActionUrlResponse> createCreateActionUrlResponse(CreateActionUrlResponse value) {
        return new JAXBElement<CreateActionUrlResponse>(_CreateActionUrlResponse_QNAME, CreateActionUrlResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateMirrorBannerLinkResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "createMirrorBannerLinkResponse")
    public JAXBElement<CreateMirrorBannerLinkResponse> createCreateMirrorBannerLinkResponse(CreateMirrorBannerLinkResponse value) {
        return new JAXBElement<CreateMirrorBannerLinkResponse>(_CreateMirrorBannerLinkResponse_QNAME, CreateMirrorBannerLinkResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UntrackAllBannerLinksResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "untrackAllBannerLinksResponse")
    public JAXBElement<UntrackAllBannerLinksResponse> createUntrackAllBannerLinksResponse(UntrackAllBannerLinksResponse value) {
        return new JAXBElement<UntrackAllBannerLinksResponse>(_UntrackAllBannerLinksResponse_QNAME, UntrackAllBannerLinksResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SegmentationGetSegmentById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "segmentationGetSegmentById")
    public JAXBElement<SegmentationGetSegmentById> createSegmentationGetSegmentById(SegmentationGetSegmentById value) {
        return new JAXBElement<SegmentationGetSegmentById>(_SegmentationGetSegmentById_QNAME, SegmentationGetSegmentById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpenApiConnectionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "openApiConnectionResponse")
    public JAXBElement<OpenApiConnectionResponse> createOpenApiConnectionResponse(OpenApiConnectionResponse value) {
        return new JAXBElement<OpenApiConnectionResponse>(_OpenApiConnectionResponse_QNAME, OpenApiConnectionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApiStringDemographicCriteria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "stringDemographicCriteria")
    public JAXBElement<ApiStringDemographicCriteria> createStringDemographicCriteria(ApiStringDemographicCriteria value) {
        return new JAXBElement<ApiStringDemographicCriteria>(_StringDemographicCriteria_QNAME, ApiStringDemographicCriteria.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCampaignResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "deleteCampaignResponse")
    public JAXBElement<DeleteCampaignResponse> createDeleteCampaignResponse(DeleteCampaignResponse value) {
        return new JAXBElement<DeleteCampaignResponse>(_DeleteCampaignResponse_QNAME, DeleteCampaignResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateBasicSegmentByObj }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "createBasicSegmentByObj")
    public JAXBElement<CreateBasicSegmentByObj> createCreateBasicSegmentByObj(CreateBasicSegmentByObj value) {
        return new JAXBElement<CreateBasicSegmentByObj>(_CreateBasicSegmentByObj_QNAME, CreateBasicSegmentByObj.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApiCampaign }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "campaign")
    public JAXBElement<ApiCampaign> createCampaign(ApiCampaign value) {
        return new JAXBElement<ApiCampaign>(_Campaign_QNAME, ApiCampaign.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAndAddUnsubscribeUrl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "createAndAddUnsubscribeUrl")
    public JAXBElement<CreateAndAddUnsubscribeUrl> createCreateAndAddUnsubscribeUrl(CreateAndAddUnsubscribeUrl value) {
        return new JAXBElement<CreateAndAddUnsubscribeUrl>(_CreateAndAddUnsubscribeUrl_QNAME, CreateAndAddUnsubscribeUrl.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SegmentationCreateSegmentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "segmentationCreateSegmentResponse")
    public JAXBElement<SegmentationCreateSegmentResponse> createSegmentationCreateSegmentResponse(SegmentationCreateSegmentResponse value) {
        return new JAXBElement<SegmentationCreateSegmentResponse>(_SegmentationCreateSegmentResponse_QNAME, SegmentationCreateSegmentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SegmentationCount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "segmentationCount")
    public JAXBElement<SegmentationCount> createSegmentationCount(SegmentationCount value) {
        return new JAXBElement<SegmentationCount>(_SegmentationCount_QNAME, SegmentationCount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateMessageByObj }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "updateMessageByObj")
    public JAXBElement<UpdateMessageByObj> createUpdateMessageByObj(UpdateMessageByObj value) {
        return new JAXBElement<UpdateMessageByObj>(_UpdateMessageByObj_QNAME, UpdateMessageByObj.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateTestGroupResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "createTestGroupResponse")
    public JAXBElement<CreateTestGroupResponse> createCreateTestGroupResponse(CreateTestGroupResponse value) {
        return new JAXBElement<CreateTestGroupResponse>(_CreateTestGroupResponse_QNAME, CreateTestGroupResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApiSocialNetworkCriteria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "socialNetworkCriteria")
    public JAXBElement<ApiSocialNetworkCriteria> createSocialNetworkCriteria(ApiSocialNetworkCriteria value) {
        return new JAXBElement<ApiSocialNetworkCriteria>(_SocialNetworkCriteria_QNAME, ApiSocialNetworkCriteria.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateStandardBannerLinkResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "createStandardBannerLinkResponse")
    public JAXBElement<CreateStandardBannerLinkResponse> createCreateStandardBannerLinkResponse(CreateStandardBannerLinkResponse value) {
        return new JAXBElement<CreateStandardBannerLinkResponse>(_CreateStandardBannerLinkResponse_QNAME, CreateStandardBannerLinkResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllUnusedTrackedLinksResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "getAllUnusedTrackedLinksResponse")
    public JAXBElement<GetAllUnusedTrackedLinksResponse> createGetAllUnusedTrackedLinksResponse(GetAllUnusedTrackedLinksResponse value) {
        return new JAXBElement<GetAllUnusedTrackedLinksResponse>(_GetAllUnusedTrackedLinksResponse_QNAME, GetAllUnusedTrackedLinksResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link APIMessageSummary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "messageSummary")
    public JAXBElement<APIMessageSummary> createMessageSummary(APIMessageSummary value) {
        return new JAXBElement<APIMessageSummary>(_MessageSummary_QNAME, APIMessageSummary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApiCampaignReport }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "CampaignReport")
    public JAXBElement<ApiCampaignReport> createCampaignReport(ApiCampaignReport value) {
        return new JAXBElement<ApiCampaignReport>(_CampaignReport_QNAME, ApiCampaignReport.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrackBannerLinkByPosition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "trackBannerLinkByPosition")
    public JAXBElement<TrackBannerLinkByPosition> createTrackBannerLinkByPosition(TrackBannerLinkByPosition value) {
        return new JAXBElement<TrackBannerLinkByPosition>(_TrackBannerLinkByPosition_QNAME, TrackBannerLinkByPosition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateUrlByFieldResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "updateUrlByFieldResponse")
    public JAXBElement<UpdateUrlByFieldResponse> createUpdateUrlByFieldResponse(UpdateUrlByFieldResponse value) {
        return new JAXBElement<UpdateUrlByFieldResponse>(_UpdateUrlByFieldResponse_QNAME, UpdateUrlByFieldResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateMailingListByObj }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "updateMailingListByObj")
    public JAXBElement<UpdateMailingListByObj> createUpdateMailingListByObj(UpdateMailingListByObj value) {
        return new JAXBElement<UpdateMailingListByObj>(_UpdateMailingListByObj_QNAME, UpdateMailingListByObj.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMessageSummaryList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "getMessageSummaryList")
    public JAXBElement<GetMessageSummaryList> createGetMessageSummaryList(GetMessageSummaryList value) {
        return new JAXBElement<GetMessageSummaryList>(_GetMessageSummaryList_QNAME, GetMessageSummaryList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MailingListCount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "mailingListCount")
    public JAXBElement<MailingListCount> createMailingListCount(MailingListCount value) {
        return new JAXBElement<MailingListCount>(_MailingListCount_QNAME, MailingListCount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSmsMessagesByField }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "getSmsMessagesByField")
    public JAXBElement<GetSmsMessagesByField> createGetSmsMessagesByField(GetSmsMessagesByField value) {
        return new JAXBElement<GetSmsMessagesByField>(_GetSmsMessagesByField_QNAME, GetSmsMessagesByField.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLastSmsMessagesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "getLastSmsMessagesResponse")
    public JAXBElement<GetLastSmsMessagesResponse> createGetLastSmsMessagesResponse(GetLastSmsMessagesResponse value) {
        return new JAXBElement<GetLastSmsMessagesResponse>(_GetLastSmsMessagesResponse_QNAME, GetLastSmsMessagesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "updateMessage")
    public JAXBElement<UpdateMessage> createUpdateMessage(UpdateMessage value) {
        return new JAXBElement<UpdateMessage>(_UpdateMessage_QNAME, UpdateMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SegmentationGetPersoFragList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "segmentationGetPersoFragList")
    public JAXBElement<SegmentationGetPersoFragList> createSegmentationGetPersoFragList(SegmentationGetPersoFragList value) {
        return new JAXBElement<SegmentationGetPersoFragList>(_SegmentationGetPersoFragList_QNAME, SegmentationGetPersoFragList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCombinedSegmentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "createCombinedSegmentResponse")
    public JAXBElement<CreateCombinedSegmentResponse> createCreateCombinedSegmentResponse(CreateCombinedSegmentResponse value) {
        return new JAXBElement<CreateCombinedSegmentResponse>(_CreateCombinedSegmentResponse_QNAME, CreateCombinedSegmentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAndAddStandardBannerLink }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "createAndAddStandardBannerLink")
    public JAXBElement<CreateAndAddStandardBannerLink> createCreateAndAddStandardBannerLink(CreateAndAddStandardBannerLink value) {
        return new JAXBElement<CreateAndAddStandardBannerLink>(_CreateAndAddStandardBannerLink_QNAME, CreateAndAddStandardBannerLink.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SegmentationUpdateSerieTrackableLinkCriteriaByObj }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "segmentationUpdateSerieTrackableLinkCriteriaByObj")
    public JAXBElement<SegmentationUpdateSerieTrackableLinkCriteriaByObj> createSegmentationUpdateSerieTrackableLinkCriteriaByObj(SegmentationUpdateSerieTrackableLinkCriteriaByObj value) {
        return new JAXBElement<SegmentationUpdateSerieTrackableLinkCriteriaByObj>(_SegmentationUpdateSerieTrackableLinkCriteriaByObj_QNAME, SegmentationUpdateSerieTrackableLinkCriteriaByObj.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SegmentationGetSegmentListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "segmentationGetSegmentListResponse")
    public JAXBElement<SegmentationGetSegmentListResponse> createSegmentationGetSegmentListResponse(SegmentationGetSegmentListResponse value) {
        return new JAXBElement<SegmentationGetSegmentListResponse>(_SegmentationGetSegmentListResponse_QNAME, SegmentationGetSegmentListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrackLinkByPositionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.service.apiccmd.emailvision.com/", name = "trackLinkByPositionResponse")
    public JAXBElement<TrackLinkByPositionResponse> createTrackLinkByPositionResponse(TrackLinkByPositionResponse value) {
        return new JAXBElement<TrackLinkByPositionResponse>(_TrackLinkByPositionResponse_QNAME, TrackLinkByPositionResponse.class, null, value);
    }

}
