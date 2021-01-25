package rewardsCentral.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import rewardsCentral.exception.UUIDException;
import rewardsCentral.service.RewardsCentralService;

import java.util.UUID;

/**
 * REWARDS CENTRAL CONTROLLER USED AS A MICROSERVICE FOR THE MAIN APP TOUR-GUIDE
 */
@RestController
public class RewardsCentralController {

    private Logger logger = LoggerFactory.getLogger(RewardsCentralController.class);

    @Autowired
    RewardsCentralService rewardsCentralService;

    /**
     *
     * @param attractionId the UUID of attractionId in the form of a string
     * @param userId the UUID of userId in the form of a string
     * @return int : a number of reward points
     * @throws UUIDException
     */
    @GetMapping("/getRewardPoints")
    public int getRewardPointsServer(@RequestParam String attractionId, String userId) throws UUIDException {
        UUID attractionIdUUID = null;
        UUID userIdUUID = null;
        try {
            logger.debug("Start getRewardPointsServer for attractionId : " + attractionId +" and userId : " + userId );
            attractionIdUUID = UUID.fromString(attractionId);
            userIdUUID = UUID.fromString(userId);
        } catch (IllegalArgumentException e) {
            throw new UUIDException(userId, attractionId);
        }
        return rewardsCentralService.getRewardPointsRewardsCentral(attractionIdUUID, userIdUUID);
    }
}
