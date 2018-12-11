---
name: Bug report
about: Create a report to help us improve
labels: bug

---

**Description**
A clear and concise description of what the bug is.

**Versions**

Component | Version
------------ | -------
OS | 10.14 |
Scala | 2.12.7 (`sbt ";reload plugins;show scalaVersion"`)
sbt | 1.2.1 (`grep "sbt.version" project/build.properties`)

**Steps To Reproduce**
Steps to reproduce the behaviour:
1. Generate a new sbt project using:
```sbtshell
sbt new BotTech/sbt-autoplugin.g8
```
2. Use the default answers for each question.
3. TODO

**Expected Behaviour**
A clear and concise description of what you expected to happen.

**Actual Behaviour**
A clear and concise description of what actually happened.

**Screenshots and/or Logs**
Add screenshots and/or logs to help explain your problem.

**Additional Context**
Add any other context about the problem here.
