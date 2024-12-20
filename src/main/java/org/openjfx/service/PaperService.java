package org.openjfx.service;

import org.openjfx.model.interfaces.Author;
import org.openjfx.model.interfaces.Reviewer;

import java.io.IOException;
import java.util.List;

public interface PaperService extends DatabaseController {
    void submitPaper(List<Author> authors, Paper paper) throws IOException;
    void setReviewer(Paper paper, List<Reviewer> reviewers) throws IOException;
    void updatePaperStatus(Paper updatedPaper) throws IOException;
    List<Paper> getUserPapers(Author author) throws IOException;
    List<Paper> getConferencePaper(Conference conference) throws IOException;
    List<Paper> findPaperNeedToBeReviewedByTheUser(Reviewer reviewer) throws IOException;
    List<Paper> findPaperReviewedByTheUser(Reviewer reviewer) throws IOException;
    List<Paper> findPaperWithStatus(Paper.PaperStatus status) throws IOException;
    List<Paper> findPaperWithStatus(Conference conference,Paper.PaperStatus status) throws IOException;
    void setReviewRecordToPaper(String paperId, String reviewerIdentifiedName, String id) throws IOException;

    static PaperService getDefaultInstance(){
        return PaperServiceImpl.getInstance();
    }


}
