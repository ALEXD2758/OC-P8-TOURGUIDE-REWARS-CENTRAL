package rewardsCentral.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import rewardCentral.RewardCentral;

import java.util.UUID;

@Service
public class RewardsCentralService {

    private Logger logger = LoggerFactory.getLogger(RewardsCentralService.class);
    private RewardCentral rewardCentral = new RewardCentral();

    /**
     * Get the Reward points based on UUID's attractionId and userId
     * @param attractionId the UUID
     * @param userId the UUID
     * @return an Integer of the reward points
     */
    public Integer getRewardPointsRewardsCentral(UUID attractionId, UUID userId) {
        logger.debug("getRewardPointsRewardsCentral");
        return rewardCentral.getAttractionRewardPoints(attractionId, userId);
    }
}
