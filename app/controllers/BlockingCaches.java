package controllers;

import play.cache.Cache;
import play.modules.blockingCache.BlockingCacheImpl;
import play.mvc.Controller;

/**
 * Created by IntelliJ IDEA.
 * User: wyatt
 * Date: 6/17/13
 * Time: 11:49 AM
 */
public class BlockingCaches extends Controller {
    public static void cacheState() {
        BlockingCacheImpl cacheImpl = (BlockingCacheImpl) Cache.forcedCacheImpl;
        renderJSON(cacheImpl.cache().getStatistics());
    }
}
