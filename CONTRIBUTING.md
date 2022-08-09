# Contributing to Eclipse AAS4J

You want to help out improving Eclipse AAS4J? Great, welcome to the community! So that you can contribute, please read this document carefully as there are some things you need to know.

# Terms of Use

Eclipse AAS4J repository is subject to the [Terms of Use of the Eclipse Foundation](https://www.eclipse.org/legal/termsofuse.php).


# Eclipse Development Process
As an open project of the Eclipse Foundation, Eclipse AAS4J is governed by the [Eclipse Foundation Development Process](https://www.eclipse.org/projects/dev_process/)


# Eclipse Contributor Agreement (ECA)
To be able to contribute to any open source project of the Eclipse Foundation you must electronically sign the [Eclipse Contributor Agreement (ECA)](https://www.eclipse.org/legal/ECA.php).

For more information, please see the [Eclipse Committer Handbook](https://www.eclipse.org/projects/handbook/#resources-commit)

## Signing the ECA
The following checklist is a short help for you to sign the [Eclipse Contributor Agreement (ECA)](https://www.eclipse.org/legal/ECA.php):
1. In case you don't have one, [create an account at Eclipse Foundation](https://accounts.eclipse.org)
2. Assign your GitHub user name in your Eclipse Foundation account settings
3. Open the [ECA form](https://accounts.eclipse.org/user/521935/eca/3.1.0) and agree to the terms.

Please, see [ECA FAQ](https://www.eclipse.org/legal/ecafaq.php) for more information.


# Creating your Contribution

After you signed the ECA, you are ready to dig in:
1. Fork the repository on GitHub.
2. Create a new branch for your changes starting from the main branch. Name your branch like this: GH-1234-short-description-here where 1234 is the Github issue number.
3. Make your changes to the code.
4. Make sure you include tests.
5. Make sure the test suite passes after your changes: you can run `mvn verify` to run tests locally.
6. Commit your changes into the branch you created. Make sure the commit author name and e-mail correspond to what you used to sign the ECA. Use meaningful commit messages. Reference the issue number in the commit message (for example "GH-276: added null check").
7. Push your changes to your branch in your forked repository.
8. Use GitHub to submit a pull request (PR) for your contribution back to main in the central Eclipse AAS4J repository. Once you have submitted your PR, do not use your branch for any other development (unless asked to do so by the reviewers of your PR).

After you submit a PR, we will review your contribution and possibly make some suggestions for improvements. Once everything is complete, the PR will be merged into the main branch (if it's a bug fix to be included in the next maintenance release) or into the develop branch (if it's a feature or improvement to be included in the next minor or major release).
