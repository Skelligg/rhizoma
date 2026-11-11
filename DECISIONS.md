# Rhizoma: decisions

Decisions settled with the owner in a planning interview that started on 2026-11-10. The original vision was written down before the interview, in the owner's private notes; this file records what has been decided since and is the one that counts.

The decision tree is worked through. What remains open is listed at the end. Where a section below says "version 1", read it as "the forum once its waves are built"; the "Build order" section says what is built when.

## Build order

The decisions in this file describe the destination. The site is built in waves, starting small.

**Stage 0: a pure blog.**

- The owner is the only poster and holds the only login. Research notes go here; YouTube videos drive traffic to the site and can be shared on it.
- Posts in Markdown with images and click-to-load video.
- No comments, no accounts, no invite links. (Comments without accounts would mean fighting spam, which is more work than accounts.)
- Opt-in email for new posts, and an RSS feed. The email list gathered here becomes the first group to be invited.
- Charter and privacy page.
- Public, cached, with a plain typographic look that reads well on a phone.

**Stage 1: members.** Built while stage 0 runs, and launched when it is ready. Extra features that happen to be finished can ship with it, but stage 1 does not wait for them.

- **Accounts.** Joining through an invite link: pseudonym, email, password, age confirmation. Email confirmation, login, password reset. A simple profile with an avatar and short text.
- **Invite links.** One per video, each with an expiry or a use limit, placed in video descriptions and sent to the email list. A screen for the owner to create them and see how many joined through each. Members who join this way are the founding cohort, sponsored by the owner.
- **Posts by members**, from the first day, with the same editor. Edit and delete own post.
- **Comments.** Nested replies. Edit and delete own comment.
- **Front page.** One stream ordered by recent activity. The owner's posts and members' posts look the same.
- **Moderation.** Hide a post or comment with a reason, ban a member. A report button that emails the owner.
- **Fixed pages.** Rules, and a contact address for complaints and security reports.
- **Member rights.** Account deletion works from the first day. Data export is done by hand on request until it is automated.
- **Backups** must be running before accounts open.

**Later waves**, in the order the need appears: topic spaces and tags, likes and the "most valued" archive, the public moderation log and remaining moderation tools, the wiki, the application and sponsor system, automatic reputation and invite refill, designed profiles, private messages, search, the finances page (with the first donation). Until reputation is automated, the owner grants invites by hand.

Before the forum wave, recruit five to ten people who commit to posting.

## Charter

Six principles, to be published as a public page. Later decisions are tested against them. Changes to the charter go through public meta discussion.

1. Fashion as a creative act. Not a commodity, not status.
2. No visible hierarchy. Standing is earned and hidden. Expression is free and equal.
3. Everything auditable: moderation, governance, money, code.
4. Independent: no trackers, no ads, no outside gatekeepers, infrastructure that can be left.
5. Small and slow. Growth only while quality holds.
6. Nothing buys entry or standing.

## Name

The project is called **rhizoma** (not "rhizome").

Domain check on 2026-11-11, by DNS and whois:

- Taken: `.com` (parked for resale), `.org`, `.net`, `.io`, `.xyz`, `.art`, `.be`, `.nl`, `.de`, `.fr`, `.studio`.
- No registration found: `.co`, `.community`, `.club`, `.fashion`, `.social`, `.forum`, `.wiki`, `.eu`, `.garden`, `.network`. A registrar still has to confirm these at purchase.

No fashion brand, forum or app with the exact name "Rhizoma" turned up in a web search. Near names exist (Rhyzem, Issey Miyake's "Rhizome" collection, Many Rhizomes). This was not a trademark search.

**Domain: `rhizoma.eu`.** Chosen on 2026-11-11. The ending is not a statement about the European Union and the site is not meant for Europe only: "Eu" is the nickname of the owner's wife, and the domain is named after her. The site says so on a public page (later in the wiki).

- On the day it was chosen, the registry's DNS had no entry for `rhizoma.eu`, which means it is probably unregistered. The registrar confirms at purchase.
- `.eu` can be registered by residents of the EU or EEA and by EU citizens living anywhere.
- All site email is sent from this domain.

## Scope of discussion

- At launch the forum covers **creative work only**: garments, designers, collections, construction, history, criticism, making your own.
- Practical sourcing ("where does one find this designer") is allowed inside a discussion.
- Personal style (outfit sharing) and acquisition (deals, resale value, legit checks) are not in scope at launch. Whether to open either one later is to be discussed by the forum as a group.

## Governance

- At the start the owner decides alone, after open discussion in a meta section of the forum. Every decision is posted publicly with its reasons.
- As trusted members become moderators, group discussion carries real weight in decisions. The owner still implements them, so the last step stays with the owner.
- No voting machinery in version 1.
- The role system has to support more than one moderator from the first day, even while the owner is the only one.

## Transparency

**Moderation log.** Every moderation action is logged: what was done, why, and which moderator did it.

- Logged-in members also see the name of the affected member.
- Logged-out readers see the log without the affected member's name.
- The log is excluded from search engines.

**Removed posts.** There are two kinds of removal.

- *Hidden*: for off-topic, low-effort or rule-breaking posts. The post collapses in the thread with its reason. Members can open it. Outsiders and search engines cannot see it.
- *Purged*: for illegal content, personal data and spam. Gone for everyone. The log entry and its reason remain, and the log shows how many purges each moderator has made.

**Reputation rules.** The principles (what counts, what it unlocks) are public in plain language. Exact thresholds are not published. A member sees their own unlocks, such as how many invites they hold, and never a number. Nobody sees another member's standing.

## Moderation

- **Report threshold.** A post reported by several separate members collapses automatically until a moderator reviews it. The collapse is logged as a system action. The moderator then restores the post or hides it properly.
- **Limits for new members.** Rate limits and link limits for the newest members, to stop spam bursts without judging content.
- **No content-judging automation in version 1.** A classifier may be added later. If it is, it runs on the project's own server (no posts sent to a third party), it only flags posts for the moderator queue and never acts alone, and its model and instructions are public.
- **Sanctions, mild to severe:** hide a post, lock a thread, move a thread, written warning (private to the member, logged as an action), suspension for a set time, ban, purge. Every step is logged.
- **No shadow bans.**
- **Appeal.** A member may appeal an action once, privately. The outcome is logged. Once there are several moderators, a different moderator reviews the appeal.
- **Queue.** One page for open reports, auto-collapsed posts, appeals and sponsor reviews, with an email digest to moderators for new items.

## Open source

- Open source under the **AGPL**, from the first commit.
- Reputation thresholds and anti-abuse values live in private configuration, not in the code.
- No secrets in the repository, ever.

## Forum shape

- Topic-divided spaces and nested comment threads.
- Default order is by recent activity. There is no vote-ranked feed.
- A separate "most valued" archive view (per month, all time) helps outsiders and newcomers find the best writing.

**Topic spaces.**

- A small fixed set of spaces, defined by the owner. Members propose new spaces in the meta section; a space is added when discussion supports it. Members cannot create spaces on their own.
- Draft set at launch (names can change): Designers and collections; Making; History and criticism; Meta.
- Tags inside a space carry finer topics (a designer, an era, a technique) and link to the wiki pages on the same subject.
- One kind of thread: a written piece, which may contain links and images. A bare link without commentary is not a thread.

**Writing format and images.**

- Markdown with a small toolbar and a live preview, the same in the forum and the wiki.
- Images are uploaded to rhizoma and stored by it. An outside image address in a post becomes a plain link, not an embedded picture.
- Every upload is resized and compressed on the server, and its metadata (location, device) is stripped.
- Limits on size per image and images per post, tighter for the newest members.
- Members are encouraged to credit designer, photographer and season.
- Copyright: a stated contact address for complaints, and removal on a valid request (a purge, logged).

**Likes.**

- Each member gets a small fixed number of likes per day. Unused likes expire. The number is public; its value is tuned later.
- The like count on a post is visible to everyone. Who liked it is visible to nobody, the author included.
- There is no downvote. Bad posts are reported to moderators.
- There are no totals per member anywhere: no karma, no "most liked member".
- Likes feed the hidden reputation, with a discount for repeated likes between the same two members.
- Receiving a like sends no notification.

## Joining

- Anyone can read. Joining requires an invitation.
- Every member enters through another member's invite. The ability to invite is earned through contribution and is limited.
- **Application path** for people who know nobody: the applicant writes a piece answering an open prompt (for example, about a garment, designer or collection that matters to them). Applications are visible to members only. Any member with a spare invite can sponsor an applicant by spending it. No sponsor, no entry.
- The owner sponsors the first cohort.
- A sponsor carries responsibility for the people they bring in.
- Applications are rate-limited, one open application per person, with an honest "waiting for sponsor" status and an expiry.

**Invite mechanics.**

- Slow refill: once a member passes the trust threshold, they receive one invite per period, up to a small cap held at once. The period and the cap are private configuration values and act as the growth dial.
- Earning invites is driven by contribution. Posts and the engagement they receive count most. Comments on others' posts and wiki contributions also count, to varying degrees. The exact weights are worked out later.
- If an invitee is suspended or banned within their first months, the sponsor's hidden reputation drops and their refill pauses. After that window the invitee's conduct is their own. Repeated bad invites stop the refill until a moderator reviews.
- A sponsor is never suspended for an invitee's conduct.
- The owner can invite without limit. Those invites are logged like any other.

**Reputation.**

- Contribution drives it. A short minimum membership period acts as a floor before invites can be earned, so that a group cannot rush the invite supply. The floor is a private configuration value.
- Reputation drops for: own post hidden (small), own post purged or a suspension (large), an invitee suspended or banned in their first months, a wiki edit reverted as vandalism, and reports that moderators judge to be in bad faith.
- Reputation never drops for disagreement, unpopular views, posts with no likes, ordinary wiki corrections, silence or inactivity.
- No decay. Old contribution keeps its value.

## Wiki

- A minimal wiki, built as one of the later waves and seeded by the owner: Markdown pages, full revision history, revert. Reference pages the owner writes during stage 0 become its first pages.
- Any member can edit. Every change is in the public history. Moderators can revert.
- The wiki is factual and attributes views to their sources. Argument belongs in a forum thread linked to the page.
- Wiki edits feed the hidden reputation.
- The wiki is also what newcomers learn from before they apply.

## Accounts and identity

- One account type in version 1: member. No labels, no verification.
- Pseudonyms. A member can give their real name and other details on their profile if they want to; none of it is required.
- The only required personal data is an email address.
- The invite chain (who invited whom) is visible to members only, hidden from outsiders and search engines.
- Marketplace seller accounts are a separate kind of account, built later with the marketplace and filled through outreach. The account model must leave room for that.

## What is public

- **Public and indexed by search engines:** all topic spaces (threads and comments), the wiki with its page history, the charter, the rules, the finances page, the "most valued" archive.
- **Public, not indexed:** the moderation log without affected members' names, and the meta space.
- **Members only:** applications, the moderation log with names, hidden posts (behind a click), the invite chain.
- **Moderators only:** the queue, reports, appeals, who reported what.
- **Profiles:** each member chooses public or members-only. The default is members-only. Outsiders always see the pseudonym and avatar beside posts.

## Private messages

- Inbox-style messages, built as one of the later waves. No live chat.
- Two people per conversation. Text and links only, no image uploads.
- A member can block another member from messaging them.
- A participant can report a conversation, which shows it to moderators. Moderators read a conversation only then, and each such access is logged.
- Messages are private from other members but not encrypted from the operator. The rules say so plainly.
- The newest members can start only a few new conversations per day.
- A new message sends an email notice, which the member can switch off.

## Leaving and member data

- **Account deletion.** The account, email, profile and private messages are erased. Forum posts stay, shown as written by "former member". The member may ask for specific posts that identify them to be removed. Wiki edits stay, credited to "former member". A member can always edit or delete their own individual posts.
- **Ownership.** Members keep ownership of their forum posts and grant the site the right to display and keep them, including after they leave. The wiki is published under Creative Commons Attribution-ShareAlike.
- **What the server keeps.** Server logs with visitor addresses are kept for a short time (days to a few weeks) and then deleted. For banned members only a one-way fingerprint of the email is kept, so the same address cannot rejoin.
- **Export.** A member can download their own posts and profile.
- **Privacy page** in plain language, listing exactly what is collected.
- **Minimum age** 16, by self-declaration at joining.

## Selling and commercial ties

- Members may present their own work and say where it is available. No sales threads, no prices-and-drops promotion, no discount codes.
- No affiliate links, no sponsored posts, no paid placement, for anyone including the owner.
- Members disclose commercial ties when they are relevant to what they post.

## Expression, not status

- Every member gets the same full toolkit from the first day: avatar, name colour and style, and a profile page they design.
- Nothing is earned and nothing is bought. No awarded badges, no donor badge.
- A profile can list plain facts such as wiki pages written and threads started, as a record and not as an award.
- Full freedom on the member's own profile page; a restrained set (avatar, name colour) inside threads.
- Version 1 can start with avatar, colour and a simple profile, and grow from there.

## Independence

**Hard rules, for everything a reader's browser touches and for accounts:**

- No third-party analytics, trackers or ad networks. No fonts or scripts loaded from other companies' servers.
- Own accounts only. No "Sign in with Google" or similar.
- Outside media (such as YouTube players) loads only after a click.

**Pragmatic, for infrastructure behind the site:**

- A rented server and an email delivery service are allowed.
- No provider that cannot be left within days with all data.
- Independent providers are preferred over the three biggest clouds.

## Money

- Banned permanently: advertising, sponsored content, sale or sharing of member data, and anything that buys entry, invites or standing.
- Donations are accepted. Donors get nothing visible. Thanks can appear on the finances page with the donor's consent.
- A public page shows costs and donations received.
- Order of use for donations: running costs, then a reserve of several months' costs, then compensation for the maintainer.
- Maintainer compensation is its own line on the public finances page. It has a stated ceiling tied to the work done, not to the volume of donations. Surplus above the ceiling stays with the project. Changing the ceiling goes through public meta discussion. The donation page says plainly that part may pay the maintainer once costs are covered.
- Income from a later marketplace is undecided, and bound by the same public accounting.

## Scale and growth

- Build for hundreds to low thousands of members and more readers, on one server.
- Pages for logged-out readers are cached, since a video can send a traffic spike.
- No scaling work until real load demands it.
- Growth is welcome while quality holds. The only control is the supply of invites, changed through public discussion.
- No engagement mechanics. Notifications only for things a member asked to follow.

## Technical

- **Shape.** One server-rendered program. The server sends complete pages; small JavaScript additions where they help. The site is fully readable without JavaScript. No browser-side application framework.
- **Language and framework.** Java with Spring Boot, on the current long-term support Java release. Thymeleaf templates. htmx, served from the project's own server, for small interactions. Chosen because Java and Spring are what the owner reads most fluently, and the owner's job is to judge and debug the code Claude Code writes. Known costs against Django: no built-in admin site, account flows built by hand, more code, more memory. Every access rule in Spring Security gets tests.
- **Database.** PostgreSQL, accessed through Spring Data JPA. Database changes are versioned scripts run by Flyway.
- **No extra services.** The whole site is two programs: the application and the database. PostgreSQL's built-in text search covers search. Sessions are stored in PostgreSQL. Cached pages and rate limits live in the application's memory (or in the web server in front). Background work (email, image processing) runs from a job table in PostgreSQL. A separate search engine, cache store or queue is added only when measured load demands it.
- **Hosting.** Production runs on a virtual server at Hetzner in an EU location, from the first public day. The owner's Azure credit pays for a test server before launch and for trying later waves, until the credit ends. Prices are to be verified before purchase.
- **Deployment.** Docker Compose: application, database and web server as containers described in one file, the same on a laptop and on the server. Caddy sits in front as the only program exposed to the internet: it handles HTTPS certificates automatically, passes requests to the application, and serves static files.
- **Releases.** Tests run automatically on each change. A release to the server is one deliberate manual command from the owner.
- **Image storage.** Images live on the server's own disk and are served by Caddy. The code reaches them through one small interface, so a later move to object storage changes one piece.
- **Backups.** Daily, automatic, encrypted before leaving the server, stored at a second independent provider. They cover the database and the image folder. Kept in generations (daily for a week, weekly for a month, monthly for a year). Restores are tested on the test server.
  - Stage 0 may go live with only the owner's posts and no backup.
  - The daily backup must be running **before accounts open** (stage 1). This is a hard gate.
  - Generations and tested restores follow soon after.
  - Before the forum wave, one trusted person holds a sealed copy of the access and backup keys.
- **Email.** A European delivery service, reached over standard SMTP so the provider can be swapped by changing configuration. Open tracking and click tracking are switched off. Notification emails are thin: they say something happened and link to the site, and never carry private content. Opt-in emails carry an unsubscribe link. SPF, DKIM and DMARC records are set up with the domain. The provider is chosen at setup, after checking current terms.
- **Code hosting.** GitHub to start, public from the first commit. Moving to, or mirroring on, another host (such as Codeberg) is open; the owner wants to research it. Secrets and private configuration never enter the repository. A stated private contact address for security reports.
- **Architecture.** A modular monolith: one application, with sections by feature (accounts, posts, comments, moderation; later wiki, invites, messages). Sections use each other only through a small declared surface. Spring Modulith checks those borders in the test run, so a violation fails the build. No microservices.

## Working method

- **Test-driven.** For each feature the test is written first, then the code to pass it.
- **Real database in tests.** Tests run against a real PostgreSQL in a container (Testcontainers).
- **Access rule tests, complete.** For every page and action there are tests for three visitors (outsider, member, moderator), and each must see exactly what the "What is public" map says. A new page without such tests fails the automatic check.
- **Small pull requests.** One feature or fix each, with a description of what and why, each reviewed and approved by the owner. A big change is a feature branch that collects small pull requests and then merges as a whole. Each wave of the build order is one such branch.
- **Nothing reaches the server without the owner's approval.**
- **Automatic dependency alerts** for security fixes in libraries.
- **A short record of architecture decisions** in the repository, drawn from this file.
- **A `CLAUDE.md` file** in the repository stating these rules for every Claude Code session.

## Costs and timeline

**Running costs**, estimated and to be verified at purchase: about 10 to 15 euros per month in total, covered by the owner until donations exist.

- Server at Hetzner: about 5 to 10 euros per month.
- Backup storage at a second provider: about 1 to 4 euros per month.
- Domain: about 10 to 30 euros per year.
- Email delivery: free tier at this volume.
- Test server: Azure credit until it ends.

**Timeline.** No fixed deadlines. The owner works on this part-time, and the bottleneck is review time. Rough guesses: stage 0 in two to four weeks of part-time work, including the one-time setup; stage 1 in one to three months after that. The owner expects both to be ready sooner.

**First steps, in order:**

1. Buy `rhizoma.eu`, early, so its email reputation can build.
2. Create the public repository with the licence, `CLAUDE.md` and the architecture record.
3. Project skeleton: Spring Boot, PostgreSQL, containers, and a test pipeline with a first passing test.
4. Stage 0 features, as small pull requests.
5. Server and Caddy, deploy, write the first posts.
6. Link from the first video.

The owner starts writing research notes now, in plain files, so that stage 0 launches with several posts in it. Backup of the subscriber list starts when the first subscribers exist.

## Parked

- Legal form (for example a non-profit association) once money is real. Needs proper advice for the owner's country.
- Whether profiles allow custom CSS (a security question).

## Still open

Product rules: none open. Assumed and not yet confirmed: the site is in English only.

Technical, to be decided when their wave comes: wiki internals, and how likes, reputation and invites are stored and computed.

Other open points: the visual design (a separate conversation), the number of likes per day, the weights and thresholds of reputation, and the wording of the rules, the charter page and the application prompt.
