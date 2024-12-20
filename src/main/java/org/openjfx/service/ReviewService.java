package org.openjfx.service;

import java.io.IOException;

public interface ReviewService extends DatabaseController {
    void addReview(Review newReview) throws IOException;

    Review searchReviewById(String id) throws IOException;

    static ReviewService getDefaultInstance(){
        return ReviewServiceImpl.getInstance();
    }
}
