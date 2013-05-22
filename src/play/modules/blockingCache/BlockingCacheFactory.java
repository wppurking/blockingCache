package play.modules.blockingCache;

import net.sf.ehcache.Ehcache;
import net.sf.ehcache.constructs.CacheDecoratorFactory;
import net.sf.ehcache.constructs.blocking.BlockingCache;

import java.util.Properties;

/**
 * Created by IntelliJ IDEA.
 * User: wyatt
 * Date: 5/22/13
 * Time: 10:52 AM
 */
public class BlockingCacheFactory extends CacheDecoratorFactory {

    @Override
    public Ehcache createDecoratedEhcache(Ehcache cache, Properties properties) {
        return new BlockingCache(cache);
    }

    @Override
    public Ehcache createDefaultDecoratedEhcache(Ehcache cache, Properties properties) {
        return new BlockingCache(cache);
    }
}
