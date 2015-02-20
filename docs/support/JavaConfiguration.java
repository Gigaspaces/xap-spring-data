@Configuration
public class ContextConfiguration {
    /**
     * Builds a space instance with settings that allow it to connect to the 'space'.
     */
    @Bean
    public GigaSpace spaceClient() {
        UrlSpaceConfigurer urlSpaceConfigurer = new UrlSpaceConfigurer("jini://*/*/space");
        return new GigaSpaceConfigurer(urlSpaceConfigurer).gigaSpace();
    }
}