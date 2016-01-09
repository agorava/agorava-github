/*
 * Copyright 2016 Agorava
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.agorava.github.cdi;

import org.agorava.github.GitHub;
import org.agorava.github.GitHubBaseService;
import org.agorava.github.GitHubUserService;
import org.agorava.github.model.GitHubProfile;

/**
 *
 * @author Antoine Sabot-Durand
 * @author Werner Keil
 */

@GitHub
public class GitHubUserServiceImpl extends GitHubBaseService implements GitHubUserService {

    @Override
    public GitHubProfile getUserProfile() {
        return getService().get(buildAbsoluteUri("user"), GitHubProfile.class);
    }

    @Override
    public GitHubProfile getUserProfile(String login) {
        return getService().get(buildAbsoluteUri("users/" + login), GitHubProfile.class);
    }
}
