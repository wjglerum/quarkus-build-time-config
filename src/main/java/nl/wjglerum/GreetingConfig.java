package nl.wjglerum;

import io.quarkus.runtime.annotations.ConfigItem;
import io.quarkus.runtime.annotations.ConfigPhase;
import io.quarkus.runtime.annotations.ConfigRoot;

@ConfigRoot(name = "greeting", phase = ConfigPhase.BUILD_AND_RUN_TIME_FIXED)
public class GreetingConfig {

    @ConfigItem
    public String name;
}
