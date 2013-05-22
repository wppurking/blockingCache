package play.modules.blockingCache;

import play.Logger;
import play.PlayPlugin;
import play.cache.Cache;

/**
 * Created by IntelliJ IDEA.
 * User: wyatt
 * Date: 5/22/13
 * Time: 11:24 AM
 */
public class CachePlugin extends PlayPlugin {
    @Override
    public void onConfigurationRead() {
        Logger.info("Init play.modules.blockingCache.CachePlugin....");
        Cache.forcedCacheImpl = BlockingCacheImpl.newInstance();
    }
}
