/****** Object:  Table [dbo].[CANDIDATE]    Script Date: 13/08/2017 16:31:41 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[CANDIDATE](
	[canID] [int] IDENTITY(1,1) NOT NULL,
	[candidateID] [nvarchar](50) NOT NULL,
	[fullName] [nvarchar](50) NULL,
	[birthDate] [nvarchar](50) NULL,
	[phone] [nvarchar](50) NULL,
	[email] [nvarchar](50) NULL,
	[candidateType] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_CANDIDATE] PRIMARY KEY CLUSTERED 
(
	[canID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Certificated]    Script Date: 13/08/2017 16:31:42 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Certificated](
	[certificatedID] [nvarchar](50) NOT NULL,
	[canID] [int] NOT NULL,
	[certificateName] [nvarchar](50) NULL,
	[certificateRank] [nvarchar](50) NULL,
	[ertificatedDate] [nvarchar](50) NULL,
 CONSTRAINT [PK_Certificated] PRIMARY KEY CLUSTERED 
(
	[certificatedID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[ExperienceCandidate]    Script Date: 13/08/2017 16:31:42 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ExperienceCandidate](
	[experienceID] [int] IDENTITY(1,1) NOT NULL,
	[canID] [int] NOT NULL,
	[expInYear] [int] NULL,
	[proSkill] [nvarchar](50) NULL,
 CONSTRAINT [PK_ExperienceCandidate] PRIMARY KEY CLUSTERED 
(
	[experienceID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[FresherCandidate]    Script Date: 13/08/2017 16:31:42 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[FresherCandidate](
	[fresherID] [int] IDENTITY(1,1) NOT NULL,
	[canID] [int] NOT NULL,
	[graduationDate] [nvarchar](50) NULL,
	[graduationRank] [nvarchar](50) NULL,
	[education] [nvarchar](50) NULL,
 CONSTRAINT [PK_FresherCandidate] PRIMARY KEY CLUSTERED 
(
	[fresherID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[InternCandidate]    Script Date: 13/08/2017 16:31:42 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[InternCandidate](
	[internID] [int] IDENTITY(1,1) NOT NULL,
	[canID] [int] NOT NULL,
	[majors] [nvarchar](50) NULL,
	[semester] [nvarchar](50) NULL,
	[universityName] [nvarchar](50) NULL,
 CONSTRAINT [PK_InternCandidate] PRIMARY KEY CLUSTERED 
(
	[internID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
ALTER TABLE [dbo].[Certificated]  WITH CHECK ADD  CONSTRAINT [FK_Certificated_CANDIDATE] FOREIGN KEY([canID])
REFERENCES [dbo].[CANDIDATE] ([canID])
GO
ALTER TABLE [dbo].[Certificated] CHECK CONSTRAINT [FK_Certificated_CANDIDATE]
GO
ALTER TABLE [dbo].[ExperienceCandidate]  WITH CHECK ADD  CONSTRAINT [FK_ExperienceCandidate_CANDIDATE] FOREIGN KEY([canID])
REFERENCES [dbo].[CANDIDATE] ([canID])
GO
ALTER TABLE [dbo].[ExperienceCandidate] CHECK CONSTRAINT [FK_ExperienceCandidate_CANDIDATE]
GO
ALTER TABLE [dbo].[FresherCandidate]  WITH CHECK ADD  CONSTRAINT [FK_FresherCandidate_CANDIDATE] FOREIGN KEY([canID])
REFERENCES [dbo].[CANDIDATE] ([canID])
GO
ALTER TABLE [dbo].[FresherCandidate] CHECK CONSTRAINT [FK_FresherCandidate_CANDIDATE]
GO
ALTER TABLE [dbo].[InternCandidate]  WITH CHECK ADD  CONSTRAINT [FK_InternCandidate_CANDIDATE] FOREIGN KEY([canID])
REFERENCES [dbo].[CANDIDATE] ([canID])
GO
ALTER TABLE [dbo].[InternCandidate] CHECK CONSTRAINT [FK_InternCandidate_CANDIDATE]
GO
