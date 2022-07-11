//@EnableWebSecurity
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//    @Autowired
//    MyUserDetailsService myUserDetailsService;
//
//    @Autowired
//    private JwtRequestFilter jwtRequestFilter;
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        // TODO : use this line when i implement bcrypt
//        // auth.userDetailsService(myUserDetailsService).passwordEncoder(passwordEncoder());
//        auth.userDetailsService(myUserDetailsService);
//
//    }
//
//    // TODO : should use this password encoder
//    // public PasswordEncoder passwordEncoder() {
//    // return new BCryptPasswordEncoder();
//    // }
//
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        // TODO : not secure. Use a different encoder. testing only
//        return NoOpPasswordEncoder.getInstance();
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        // allow users to access "authenticate" page without being authenticated
//        // all other requests must be authenticated
//        // stateless tells it to not create a session? Do i need? Not sure yet
//        // http.csrf().disable().authorizeRequests().antMatchers("/api/authenticate").permitAll().anyRequest()
//        // .authenticated().and().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
//        http.cors().configurationSource(request -> new CorsConfiguration().applyPermitDefaultValues()).and().csrf()
//                .disable().authorizeRequests().antMatchers("/api/authenticate").permitAll().anyRequest().authenticated()
//                .and().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
//
//        http.addFilterBefore(jwtRequestFilter, UsernamePasswordAuthenticationFilter.class);
//
//    }
//
//    @Override
//    @Bean
//    public AuthenticationManager authenticationManagerBean() throws Exception {
//        // create bean of type 'authenticationManager'
//        return super.authenticationManagerBean();
//    }
//
//    @Bean
//    CorsConfigurationSource corsConfigurationSource() {
//        final CorsConfiguration configuration = new CorsConfiguration();
//        configuration.setAllowedOrigins(Arrays.asList("*"));
//        configuration.setAllowedMethods(Arrays.asList("HEAD", "GET", "POST", "PUT", "DELETE", "PATCH", "OPTIONS"));
//        configuration.setAllowCredentials(true);
//        configuration.setAllowedHeaders(Arrays.asList("*"));
//        configuration.setExposedHeaders(Arrays.asList("X-Auth-Token", "Authorization", "Access-Control-Allow-Origin",
//                "Access-Control-Allow-Credentials"));
//        final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//        source.registerCorsConfiguration("/**", configuration);
//        return source;
//    }
//
//}