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

    public Integer getRewardPointsRewardsCentral(UUID attractionId, UUID userId) {
        logger.debug("getRewardPointsRewardsCentral");
        return rewardCentral.getAttractionRewardPoints(attractionId, userId);
    }
}